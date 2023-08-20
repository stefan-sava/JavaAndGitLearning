import java.io.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static Specializare specializare;
    private static Facultate facultate;

    //TODO citirea din fisier
    private static void adaugaStudent() {
        System.out.print("Nume: ");
        String nume = scanner.nextLine();
        System.out.print("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.print("Adresa: ");
        String adresa = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Nr. Matricol: ");
        int nrMatricol = scanner.nextInt();
        System.out.print("An Studiu: ");
        int anStudiu = scanner.nextInt();
        scanner.nextLine(); // Consumăm newline
        System.out.print("Specializare: ");
        String specializare = scanner.nextLine();
        System.out.print("Medie Admitere: ");
        double medieAdmitere = scanner.nextDouble();

        Student student = new Student(nume, prenume, adresa, email, nrMatricol, anStudiu, specializare, medieAdmitere, null);
        facultate.adaugaStudent(student);

        System.out.println("Studentul a fost adaugat cu succes.");
    }
    private static void stergeStudent() {
        System.out.print("Nume student: ");
        String numeStudent = scanner.nextLine();
        System.out.print("Prenume student: ");
        String prenumeStudent = scanner.nextLine();

        for (Student student : facultate.Studenti) {
            if (student.Nume.equalsIgnoreCase(numeStudent) && student.Prenume.equalsIgnoreCase(prenumeStudent)) {
                facultate.Studenti.remove(student);
                System.out.println("Studentul a fost sters cu succes.");
                return;
            }
        }

        System.out.println("Studentul nu a fost gasit.");
    }
    private static void adaugaCadruDidactic() {
        System.out.print("Nume: ");
        String nume = scanner.nextLine();
        System.out.print("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.print("Adresa: ");
        String adresa = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Salariu: ");
        double salariu = scanner.nextDouble();
        System.out.print("Vechime: ");
        int vechime = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Titulatura: ");
        String titulatura = scanner.nextLine();

        CadruDidactic cadruDidactic = new CadruDidactic(nume, prenume, adresa, email, salariu, vechime, titulatura);
        facultate.adaugaAngajat(cadruDidactic);

        System.out.println("Cadru didactic adaugat cu succes.");
    }
    private static void adaugaPersonalNedidactic() {
        System.out.print("Nume: ");
        String nume = scanner.nextLine();
        System.out.print("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.print("Adresa: ");
        String adresa = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Salariu: ");
        double salariu = scanner.nextDouble();
        System.out.print("Vechime: ");
        int vechime = scanner.nextInt();
        scanner.nextLine(); // Consumăm newline
        System.out.print("Functie: ");
        String functie = scanner.nextLine();

        PersonalNedidactic personalNedidactic = new PersonalNedidactic(nume, prenume, adresa, email, salariu, vechime, functie);
        facultate.adaugaAngajat(personalNedidactic);

        System.out.println("Personal nedidactic adaugat cu succes.");
    }
    private static void stergeAngajat() {
        System.out.print("Nume angajat: ");
        String numeAngajat = scanner.nextLine();
        System.out.print("Prenume angajat: ");
        String prenumeAngajat = scanner.nextLine();

        for (Angajat angajat : facultate.Angajati) {
            if (angajat.Nume.equalsIgnoreCase(numeAngajat) && angajat.Prenume.equalsIgnoreCase(prenumeAngajat)) {
                facultate.Angajati.remove(angajat);
                System.out.println("Angajatul a fost sters cu succes.");
                return;
            }
        }

        System.out.println("Angajatul nu a fost gasit.");
    }

    private static void adaugaNotaStudent() {
        System.out.print("Nume student: ");
        String numeStudent = scanner.nextLine();
        System.out.print("Prenume student: ");
        String prenumeStudent = scanner.nextLine();

        for (Student student : facultate.Studenti) {
            if (student.Nume.equalsIgnoreCase(numeStudent) && student.Prenume.equalsIgnoreCase(prenumeStudent)) {
                afiseazaCursuriDisponibile();
                System.out.print("Selectati ID-ul cursului: ");
                int cursId = scanner.nextInt();
                System.out.print("Nota: ");
                double nota = scanner.nextDouble();
                NotaCurs notaCurs = new NotaCurs(cursId, nota);
                student.adaugaNotaCurs(notaCurs);
                System.out.println("Nota a fost adaugata cu succes pentru studentul " + student.Nume + " " + student.Prenume);
                return;
            }
        }

        System.out.println("Studentul nu a fost gasit.");
    }

    private static void modificaNotaStudent() {
        System.out.print("Nume student: ");
        String numeStudent = scanner.nextLine();
        System.out.print("Prenume student: ");
        String prenumeStudent = scanner.nextLine();

        for (Student student : facultate.Studenti) {
            if (student.Nume.equalsIgnoreCase(numeStudent) && student.Prenume.equalsIgnoreCase(prenumeStudent)) {
                afiseazaNoteStudent(student);
                System.out.print("Selectati ID-ul cursului pentru care doriti sa modificati nota: ");
                int cursId = scanner.nextInt();
                System.out.print("Noua nota: ");
                double nota = scanner.nextDouble();
                NotaCurs notaCurs = new NotaCurs(cursId,nota);
                if (student.getNotaCursuri().contains(cursId)) {
                    student.NotaCursuri.add(notaCurs);
                    System.out.println("Nota a fost modificata cu succes pentru studentul " + student.Nume + " " + student.Prenume);
                } else {
                    System.out.println("Studentul nu are o nota pentru cursul selectat.");
                }
                return;
            }
        }

        System.out.println("Studentul nu a fost gasit.");
    }

    private static void afiseazaCursuriDisponibile() {
        System.out.println("Cursuri disponibile:");
        for (Specializare specializare : facultate.Specializari) {
            for (Curs curs : specializare.Cursuri) {
                System.out.println(curs.CursId + ". " + curs.Denumire);
            }
        }
    }

    private static void afiseazaNoteStudent(Student student) {
        System.out.println("Note pentru studentul " + student.Nume + " " + student.Prenume);
        for (NotaCurs notaCurs : student.NotaCursuri) {
            System.out.println("Curs ID: " + notaCurs.getCursId() + ", Nota: " + notaCurs.getNota());
        }
    }

    private static void adaugaCursNou() {
        System.out.print("ID Curs: ");
        int cursId = scanner.nextInt();
        scanner.nextLine(); // Consumăm newline
        System.out.print("Denumire Curs: ");
        String denumireCurs = scanner.nextLine();
        System.out.print("Titular Curs: ");
        String titularCurs = scanner.nextLine();

        Curs curs = new Curs(cursId, denumireCurs, titularCurs);
        specializare.adaugaCurs(curs);

        System.out.println("Curs adaugat cu succes.");
    }

    private static void salveazaInFisier() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("date_facultate.txt"))) {
            writer.println(facultate.toString());
            System.out.println("Datele au fost salvate in fisier.");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea in fisier.");
        }
    }

    private static void afiseazaMeniu() {
        int optiune;
        do {
            System.out.println("Meniu:");
            System.out.println("1. Adaugati un student");
            System.out.println("2. Adaugati un cadru didactic");
            System.out.println("3. Adaugati un angajat, personal nedidactic");
            System.out.println("4. Stergeti un angajat");
            System.out.println("5. Stergeti un student");
            System.out.println("6. Adaugati o nota pentru un student");
            System.out.println("7. Modificati o nota pentru un student");
            System.out.println("8. Adaugati un curs nou");
            System.out.println("9. Afiseaza angajatii");
            System.out.println("10. Afiseaza studentii");
            System.out.println("11. Afiseaza cursurile");
            System.out.println("12. Salvare in fisier");
            System.out.println("0. Iesire");

            System.out.print("Alegeti o optiune: ");
            optiune = scanner.nextInt();
            scanner.nextLine(); // Consumăm newline

            switch (optiune) {
                case 1:
                    adaugaStudent();
                    break;
                case 2:
                    adaugaCadruDidactic();
                    break;
                case 3:
                    adaugaPersonalNedidactic();
                    break;
                case 4:
                    stergeAngajat();
                    break;
                case 5:
                    stergeStudent();
                    break;
                case 6:
                    adaugaNotaStudent();
                    break;
                case 7:
                    modificaNotaStudent();
                    break;
                case 8:
                    adaugaCursNou();
                    break;
                case 9:
                    facultate.afiseazaAngajati();
                    break;
                case 10:
                    facultate.afiseazaStudenti();
                    break;
                case 11:
                    specializare.afiseazaCursuri();
                    break;
                case 12:
                    salveazaInFisier();
                    break;
                case 0:
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Optiune invalida.");
            }
        } while (optiune != 0);
    }



    public static void main(String[] args) {
        //facultate = citesteDateDinFisier("C:\\Users\\stefa\\IdeaProjects\\JavaPOB\\probClasaFacultate\\src\\date.in");
        afiseazaMeniu();
    }
}