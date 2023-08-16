import java.util.Objects;

public class CadruDidactic extends Angajat{
    public CadruDidactic(String nume, String prenume, String adresa, String email, int salariu, int vechime) {
        super(nume, prenume, adresa, email, salariu, vechime);
    }
    private String Titulatura;

    public CadruDidactic(String nume, String prenume, String adresa, String email, int salariu, int vechime, String titulatura) {
        super(nume, prenume, adresa, email, salariu, vechime);
        Titulatura = titulatura;
    }

    public String getTitulatura() {
        return Titulatura;
    }

    public void setTitulatura(String titulatura) {
        Titulatura = titulatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CadruDidactic that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getTitulatura(), that.getTitulatura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTitulatura());
    }

    @Override
    public String toString() {
        return "CadruDidactic{" +
                "Titulatura='" + Titulatura + '\'' +
                '}';
    }
}
