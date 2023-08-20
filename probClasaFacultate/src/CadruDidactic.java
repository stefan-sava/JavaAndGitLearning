import java.util.Objects;

public class CadruDidactic extends Angajat{
    private String Nume;
    private String Prenume;
    private String Adresa;
    private String Email;
    private double Salariu;
    private double Vechime;
    private String Titulatura;

    public CadruDidactic(String nume, String prenume, String adresa, String email, double salariu, double vechime, String titulatura) {
        Nume = nume;
        Prenume = prenume;
        Adresa = adresa;
        Email = email;
        Salariu = salariu;
        Vechime = vechime;
        Titulatura = titulatura;
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

    public String getTitulatura() {
        return Titulatura;
    }

    public void setTitulatura(String titulatura) {
        Titulatura = titulatura;
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
    public void setVechime(double Vechime) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CadruDidactic that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getNume(), that.getNume()) && Objects.equals(getPrenume(), that.getPrenume()) && Objects.equals(getAdresa(), that.getAdresa()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getTitulatura(), that.getTitulatura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNume(), getPrenume(), getAdresa(), getEmail(), getTitulatura());
    }

    @Override
    public String toString() {
        return "CadruDidactic{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Adresa='" + Adresa + '\'' +
                ", Email='" + Email + '\'' +
                ", Titulatura='" + Titulatura + '\'' +
                ", Salariu=" + Salariu +
                ", Vechime=" + Vechime +
                '}';
    }


}
