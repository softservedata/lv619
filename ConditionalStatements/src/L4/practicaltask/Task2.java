package L4.practicaltask;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String[] arrayEnglish = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] arrayItalian = {"Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venderi", "Sabato", "Domenica"};
        String[] arrayFrench = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

        System.out.print("Enter The number of the day:");
        int n = Integer.parseInt(str.nextLine());

        System.out.print(arrayEnglish[n-1]+"\t");
        System.out.print(arrayItalian[n-1]+"\t");
        System.out.print(arrayFrench[n-1]+"\t");
    }
}
