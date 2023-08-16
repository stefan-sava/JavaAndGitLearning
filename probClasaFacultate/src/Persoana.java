import java.util.Objects;

public class Persoana {
    private String Nume;
    private String Prenume;
    private String Adresa;
    private String Email;

    public Persoana(String nume, String prenume, String adresa, String email) {
        Nume = nume;
        Prenume = prenume;
        Adresa = adresa;
        Email = email;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana persoana)) return false;
        return Objects.equals(getNume(), persoana.getNume()) && Objects.equals(getPrenume(), persoana.getPrenume()) && Objects.equals(getAdresa(), persoana.getAdresa()) && Objects.equals(getEmail(), persoana.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNume(), getPrenume(), getAdresa(), getEmail());
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Adresa='" + Adresa + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

}
