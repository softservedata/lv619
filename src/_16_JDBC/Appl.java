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
	private static final Scanner in = new Scanner(System.in);
	
	private static void createCarsTableInCarsDB() throws SQLException{ 
			st.execute("CREATE DATABASE carsDB;");
			st.execute("USE carsDB");
			st.execute("CREATE TABLE Cars(id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,"
					+ "model VARCHAR(20),"
					+ "year_of_production INT);");
	}
	
	private static void insertRandCar() throws SQLException{ 
		st.execute("INSERT INTO Cars(model,year_of_production) VALUES('"
				+ randLettersStringTitleCase() + "',"
				+ randInt(1950, 2022) + ");");
	}
	
	private static void printCars() throws SQLException{
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
	
	private static void deleteOldestCars() throws SQLException{
		ResultSet rs = st.executeQuery("SELECT year_of_production FROM Cars ORDER BY year_of_production LIMIT 1");
		rs.next();
		st.execute("DELETE FROM Cars WHERE year_of_production = " + rs.getInt(1));
		rs.close();
	}

	private static String[] getCarsWithProductionYear(int year) throws SQLException{
		String info = "";
		ResultSet rs = st.executeQuery("SELECT * FROM Cars WHERE year_of_production = " + year);
		while(rs.next())
			info += "id: " + rs.getInt(1)
			+ "\tmodel: " + rs.getString(2)
			+ "\tproduction year: " + rs.getInt(3) + "\'dlmtr\'";
		rs.close();
		return info.isEmpty() ? null : info.split("\'dlmtr\'");
	}
	
	public static void main(String[] args) throws SQLException {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "root")){
			st = con.createStatement();
			//try {st.execute("DROP DATABASE carsDB");}catch(Exception e) {}
			createCarsTableInCarsDB();
			for(int i = 0; i < 3; ++i)
				insertRandCar();
			 printCars();
			 System.out.println("---------------------------------------------");
			 try {
				 System.out.println(String.join("\n", getCarsWithProductionYear(getCorrectInputYear())));
			 } catch (NullPointerException e) {
				 System.out.println("no cars found");
			 }
			 System.out.println("---------------------------------------------");
			 deleteOldestCars();
			 printCars();
			 st.execute("DROP DATABASE carsDB");
			 st.close();
		}
	}
	
	private static int getCorrectInputYear() {
		String year = "";
		System.out.print("enter year: ");
		while(!(year = in.nextLine()).matches("^ *[-+]?\\d+ *$"))
			System.out.print("invalid input data. please retry\n: ");
		return Integer.parseInt(year);
	}
	
	private static int randInt(int fromTo, int toFrom) {
		Random random = new Random();
		return fromTo < toFrom ? random.nextInt(toFrom - fromTo + 1) + fromTo
				: random.nextInt(fromTo - toFrom + 1) + toFrom;
	}

	private static String randLettersStringTitleCase() {
		StringBuilder sb = new StringBuilder(Character.toString((char) randInt(65, 90)));
		for (int i = 0, n = randInt(2, 12); i < n; ++i)
			sb.append((char) randInt(97, 122));
		return sb.toString();
	}
	
}