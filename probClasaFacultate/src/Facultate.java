import java.util.*;

public class Facultate {

    private String Denumire;
    String Adresa, Email;
    private List Contact;
    List<Specializare> Specializari;
    List<Angajat> Angajati;
    List<Student> Studenti;

    public Facultate(String denumire, String adresa, String email, List specializari, List angajati, List studenti) {
        Denumire = denumire;
        Adresa = adresa;
        Email = Email;
        Contact.add(email);
        Contact.add(adresa);
        Specializari = specializari;
        Angajati = angajati;
        Studenti = studenti;
    }

    public String getDenumire() {
        return Denumire;
    }

    public void setDenumire(String denumire) {
        Denumire = denumire;
    }

    public List getContact() {
        return Contact;
    }

    public void setContact(List contact) {
        Contact = contact;
    }

    public List getSpecializari() {
        return Specializari;
    }

    public void setSpecializari(List specializari) {
        Specializari = specializari;
    }

    public List getAngajati() {
        return Angajati;
    }

    public void setAngajati(List angajati) {
        Angajati = angajati;
    }

    public List getStudenti() {
        return Studenti;
    }

    public void setStudenti(List studenti) {
        Studenti = studenti;
    }

    @Override
    public String toString() {
        StringBuilder specializariStr = new StringBuilder("Specializari:\n");
        for (Specializare specializare : Specializari) {
            specializariStr.append(specializare.toString()).append("\n");
        }

        return "Facultate: " + Denumire + "\nAdresa: " + Adresa + "\nEmail: " + Email + "\n" +
                specializariStr.toString();
    }

    //Pentru a adauga la facultate

    public void adaugaContact(Specializare specializare) {
        Specializari.add(specializare);
    }
    public void adaugaSpecializare(Specializare specializare) {
        Specializari.add(specializare);
    }

    public void adaugaAngajat(Angajat angajat) {
        Angajati.add(angajat);
    }

    public void adaugaStudent(Student student) {
        Studenti.add(student);
    }

    public void stergeSpecializare(Specializare specializare) {
        Specializari.remove(specializare);
    }

    public void stergeAngajat(Angajat angajat) {
        Angajati.remove(angajat);
    }

    public void stergeStudent(Student student) {
        Studenti.remove(student);
    }

    public void afiseazaAngajati() {
        for (Angajat angajat : Angajati) {
            System.out.println(angajat.toString());
            System.out.println("-------------------");
        }
    }
    public void afiseazaStudenti() {
        for (Student student : Studenti) {
            System.out.println(student.toString());
            System.out.println("-------------------");
        }
    }
    public void afiseazaSpecializari() {
        for (Specializare specializare : Specializari) {
            System.out.println(specializare.toString());
            System.out.println("-------------------");
        }
    }


}
