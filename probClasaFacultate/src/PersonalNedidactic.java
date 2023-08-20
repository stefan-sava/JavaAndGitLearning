public class PersonalNedidactic extends Angajat{
    private String Nume;
    private String Prenume;
    private String Adresa;
    private String Email;
    private double Salariu;
    private double Vechime;
    private String Functie;

    public PersonalNedidactic(String nume, String prenume, String adresa, String email, double salariu, double vechime, String functie) {
        Nume = nume;
        Prenume = prenume;
        Adresa = adresa;
        Email = email;
        Salariu = salariu;
        Vechime = vechime;
        Functie = functie;
    }

    @Override
    public String getNume() {
        return Nume;
    }

    @Override
    public void setNume(String nume) {
        Nume = nume;
    }

    @Override
    public String getPrenume() {
        return Prenume;
    }

    @Override
    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    @Override
    public String getAdresa() {
        return Adresa;
    }

    @Override
    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public double getSalariu() {
        return Salariu;
    }

    @Override
    public void setSalariu(double salariu) {
        Salariu = salariu;
    }

    @Override
    public double getVechime() {
        return Vechime;
    }

    @Override
    public void setVechime(double vechime) {
        Vechime = vechime;
    }

    public String getFunctie() {
        return Functie;
    }

    public void setFunctie(String functie) {
        Functie = functie;
    }
}
