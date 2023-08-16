import java.util.List;

public class Facultate {

    private String Denumire;
    private List Contact;
    private List Specializari;
    private List Angajati;
    private List Studenti;

    public Facultate(String denumire, List contact, List specializari, List angajati, List studenti) {
        Denumire = denumire;
        Contact = contact;
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
        return "Facultate{" +
                "Denumire='" + Denumire + '\'' +
                ", Contact='" + Contact + '\'' +
                ", Specializari='" + Specializari + '\'' +
                ", Angajati=" + Angajati +
                ", Studenti=" + Studenti +
                '}';
    }


}
