import java.io.*;
import java.util.*;

public class Main {
    public static void afiseazaMeniu() {
        System.out.println("Meniu:");
        System.out.println("1 -> Adaugă student");
        System.out.println("2 -> Adaugă cadru didactic");
        System.out.println("3 -> Adaugă angajat personal nedidactic");
        System.out.println("4 -> Șterge angajat");
        System.out.println("5 -> Șterge student");
        System.out.println("6 -> Adaugă notă pentru student");
        System.out.println("7 -> Modifică notă pentru student");
        System.out.println("8 -> Adaugă curs nou");
        System.out.println("9 -> Salvare în fișier");
        System.out.println("0 -> Ieșire");
        System.out.print("Alege opțiunea: ");
    }
    public static Facultate citesteDateDinFisier(String numeFisier) {
        Facultate facultate = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(numeFisier))) {
            String denumireFacultate = reader.readLine();
            String adresaContact = reader.readLine();
            String emailContact = reader.readLine();
            List Contact = new ArrayList<>();
            Contact.add(adresaContact);
            Contact.add(emailContact);
            ArrayList<Specializare> specializari = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                // Citirea datelor pentru fiecare specializare și crearea obiectului Specializare
                // Adăugarea specializării în listă
            }

            // Crearea obiectului Facultate cu datele citite din fișier
            facultate = new Facultate(denumireFacultate, Contact, specializari, new ArrayList<>(), new ArrayList<>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return facultate;
    }
    public static void main(String[] args) {

    }
}