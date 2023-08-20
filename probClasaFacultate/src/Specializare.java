import java.util.*;

public class Specializare {
    private int IdSpecializare;
    private String Denumire;
    private List<Curs> Cursuri;
    private CadruDidactic Responsabil;

    public Specializare(int idSpecializare, String denumire, List<Curs> cursuri, CadruDidactic responsabil) {
        IdSpecializare = idSpecializare;
        Denumire = denumire;
        Cursuri = cursuri;
        Responsabil = responsabil;
    }

    public int getIdSpecializare() {
        return IdSpecializare;
    }

    public void setIdSpecializare(int idSpecializare) {
        IdSpecializare = idSpecializare;
    }

    public String getDenumire() {
        return Denumire;
    }

    public void setDenumire(String denumire) {
        Denumire = denumire;
    }

    public List<Curs> getCursuri() {
        return Cursuri;
    }

    public void setCursuri(List<Curs> cursuri) {
        Cursuri = cursuri;
    }

    public CadruDidactic getResponsabil() {
        return Responsabil;
    }

    public void setResponsabil(CadruDidactic responsabil) {
        Responsabil = responsabil;
    }
}
