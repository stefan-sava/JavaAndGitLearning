import java.util.Objects;

public class PersonalNedidactic extends Angajat{
    private String Nume;
    private String Prenume;
    private String Adresa;
    private String Email;
    private int Salariu;
    private int Vechime;
    private String Functie;

    public PersonalNedidactic(String nume, String prenume, String adresa, String email, int salariu, int vechime, String functie) {
        Nume = nume;
        Prenume = prenume;
        Adresa = adresa;
        Email = email;
        Salariu = salariu;
        Vechime = vechime;
        Functie = functie;
    }

    @Override
    public int getSalariu() {
        return 0;
    }

    @Override
    public void setSalariu(int Salariu) {

    }

    @Override
    public int getVechime() {
        return 0;
    }

    @Override
    public void setVechime(int Vechime) {

    }

    @Override
    public String getNume() {
        return null;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public String getPrenume() {
        return null;
    }

    @Override
    public void setPrenume(String prenume) {

    }

    @Override
    public String getAdresa() {
        return null;
    }

    @Override
    public void setAdresa(String adresa) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    public String getFunctie() {
        return Functie;
    }

    public void setFunctie(String functie) {
        Functie = functie;
    }
}
