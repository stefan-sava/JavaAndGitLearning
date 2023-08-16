import java.util.List;
import java.util.Objects;

public class Student extends Persoana{
    public Student(String nume, String prenume, String adresa, String email) {
        super(nume, prenume, adresa, email);
    }

    private int NrMatricol;
    private int AnStudiu;
    private String Specializare;
    private int MedieAdmitere;
    private List NotaCursuri;

    public Student(String nume, String prenume, String adresa, String email, int nrMatricol, int anStudiu, String specializare, int medieAdmitere, List notaCursuri) {
        super(nume, prenume, adresa, email);
        NrMatricol = nrMatricol;
        AnStudiu = anStudiu;
        Specializare = specializare;
        MedieAdmitere = medieAdmitere;
        NotaCursuri = notaCursuri;
    }

    public int getNrMatricol() {
        return NrMatricol;
    }

    public void setNrMatricol(int nrMatricol) {
        NrMatricol = nrMatricol;
    }

    public int getAnStudiu() {
        return AnStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        AnStudiu = anStudiu;
    }

    public String getSpecializare() {
        return Specializare;
    }

    public void setSpecializare(String specializare) {
        Specializare = specializare;
    }

    public int getMedieAdmitere() {
        return MedieAdmitere;
    }

    public void setMedieAdmitere(int medieAdmitere) {
        MedieAdmitere = medieAdmitere;
    }

    public List getNotaCursuri() {
        return NotaCursuri;
    }

    public void setNotaCursuri(List notaCursuri) {
        NotaCursuri = notaCursuri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return getNrMatricol() == student.getNrMatricol() && getAnStudiu() == student.getAnStudiu() && getMedieAdmitere() == student.getMedieAdmitere() && Objects.equals(getSpecializare(), student.getSpecializare()) && Objects.equals(getNotaCursuri(), student.getNotaCursuri());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNrMatricol(), getAnStudiu(), getSpecializare(), getMedieAdmitere(), getNotaCursuri());
    }

    @Override
    public String toString() {
        return "Student{" +
                "NrMatricol=" + NrMatricol +
                ", AnStudiu=" + AnStudiu +
                ", Specializare='" + Specializare + '\'' +
                ", MedieAdmitere=" + MedieAdmitere +
                ", NotaCursuri=" + NotaCursuri +
                '}';
    }
}
