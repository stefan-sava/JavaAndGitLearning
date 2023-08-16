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

        CadruDidactic cadrudidactic1 = new CadruDidactic("A", "A", "AA nr. 1", "a@a.a", 2000,
                10, "fda");

        PersonalNedidactic personalnedidactic1 = new PersonalNedidactic("B", "B", "BB nr. 2", "b@b.b",
                1000, 5,"Personal Secretariat");

        System.out.println(student1);
        System.out.println(cadrudidactic1);
        System.out.println(personalnedidactic1);

        Scanner systemIN = new Scanner(System.in);

        System.out.println("Introduceti numele persoanei: ");
        String nume = systemIN.nextLine();
        System.out.println("Introduceti prenumele persoanei:");
        String prenume = systemIN.nextLine();


    }
}