package _16_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	// Create table Cars with fields id (int), model (String), year_of_production(int)
	// Insert into the table new records about three different cars
	// Input year of production from the console and receive an information about corresponding  cars
	// Delete the oldest cars
	////////////////////////////////////////////////////////////////////////////
	private static Statement  st = null;
	private static Scanner in = new Scanner(System.in);
	
	static void createCarsDBAndCarsTable() throws SQLException{ 
			st.execute("CREATE DATABASE carsDB;");
			st.execute("USE carsDB");
			st.execute("CREATE TABLE Cars(id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,"
					+ "model VARCHAR(20),"
					+ "year_of_production INT);");
	}
	
	static void insertRandCar() throws SQLException{ 
		st.execute("INSERT INTO Cars(model,year_of_production) VALUES('"
				+ randLettersStringTitleCase() + "',"
				+ randInt(1950, 2022) + ");");
	}
	
	static void printCars() throws SQLException{
		try(ResultSet rs = st.executeQuery("SELECT * FROM Cars")){
			 int n = rs.getMetaData().getColumnCount();
				for(int i = 1; i <= n; ++i)
					System.out.print(rs.getMetaData().getColumnName(i) + "\t");
				System.out.println();
				while(rs.next()) {
					for (int i = 1; i <= n; i++)
						System.out.print(rs.getString(i) + '\t');
					System.out.println();
				}
		 }
	}
	
	static void deleteOldestCar() throws SQLException{
		ResultSet rs = st.executeQuery("SELECT year_of_production FROM Cars ORDER BY year_of_production LIMIT 1");
		rs.next();
		int year = rs.getInt(1);
		st.execute("DELETE FROM Cars WHERE year_of_production = " + year);
	}

	private static String getCarByProductionYear() throws SQLException{
		String year = "";
		String info = "";
		while(!(year = in.nextLine()).matches("^ *[-+]?\\d+ *$"));
		ResultSet rs = st.executeQuery("SELECT * FROM Cars WHERE year_of_production = " + year);
		while(rs.next())
			info += "id: " + rs.getInt(1)
			+ "\tmodel: " + rs.getString(2)
			+ "\tproduction year: " + rs.getInt(3) + "\n";
		return info.isEmpty() ? "no cars found" : info.substring(0, info.length() - 1);
	}
	
	public static void main(String[] args) throws SQLException {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "root")){
			st = con.createStatement();
			createCarsDBAndCarsTable();
			for(int i = 0; i < 3; ++i)
				insertRandCar();
			 printCars();
			 System.out.println("---------------------------------------------");
			 System.out.print("enter year: ");
			 System.out.println(getCarByProductionYear());
			 System.out.println("---------------------------------------------");
			 deleteOldestCar();
			 printCars();
			 st.execute("DROP DATABASE carsDB");
			 st.close();
		}
	}

	public static int randInt(int fromTo, int toFrom) {
		Random random = new Random();
		return fromTo < toFrom ? random.nextInt(toFrom - fromTo + 1) + fromTo
				: random.nextInt(fromTo - toFrom + 1) + toFrom;
	}

	public static String randLettersStringTitleCase() {
		StringBuilder sb = new StringBuilder(Character.toString((char) randInt(65, 90)));
		for (int i = 0, n = randInt(2, 12); i < n; ++i)
			sb.append((char) randInt(97, 122));
		return sb.toString();
	}
	
}