import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
 /*   public static boolean cautareInPersoana(String nume, String prenume){
        Persoana.getNume() = nume;

    }*/
    public static void main(String[] args) {
        Student student1 = new Student("Sava", "Stefan", "Prunilor 24", "stefan@sava.ro", 1,2,
                "IE", 9.23F, null);


        System.out.println(student1);

        Scanner systemIN = new Scanner(System.in);

        System.out.println("Introduceti numele persoanei: ");
        String nume = systemIN.nextLine();
        System.out.println("Introduceti prenumele persoanei:");
        String prenume = systemIN.nextLine();


    }
}