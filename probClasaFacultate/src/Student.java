import java.util.List;
import java.util.Objects;

public class Student extends Persoana{
    String Nume;
    String Prenume;
    private String Adresa;
    private String Email;
    private int NrMatricol;
    private int AnStudiu;
    private String Specializare;
    private double MedieAdmitere;
    List<NotaCurs> NotaCursuri;

    public Student(String nume, String prenume, String adresa, String email, int nrMatricol, int anStudiu, String specializare, double medieAdmitere, List<NotaCurs> notaCursuri) {
        Nume = nume;
        Prenume = prenume;
        Adresa = adresa;
        Email = email;
        NrMatricol = nrMatricol;
        AnStudiu = anStudiu;
        Specializare = specializare;
        MedieAdmitere = medieAdmitere;
        NotaCursuri = notaCursuri;
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

    public double getMedieAdmitere() {
        return MedieAdmitere;
    }

    public void setMedieAdmitere(double medieAdmitere) {
        MedieAdmitere = medieAdmitere;
    }

    public List<NotaCurs> getNotaCursuri() {
        return NotaCursuri;
    }

    public void setNotaCursuri(List<NotaCurs> notaCursuri) {
        NotaCursuri = notaCursuri;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Adresa='" + Adresa + '\'' +
                ", Email='" + Email + '\'' +
                ", NrMatricol=" + NrMatricol +
                ", AnStudiu=" + AnStudiu +
                ", Specializare='" + Specializare + '\'' +
                ", MedieAdmitere=" + MedieAdmitere +
                ", NotaCursuri=" + NotaCursuri +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return getNrMatricol() == student.getNrMatricol() && getAnStudiu() == student.getAnStudiu() && Double.compare(student.getMedieAdmitere(), getMedieAdmitere()) == 0 && Objects.equals(getNume(), student.getNume()) && Objects.equals(getPrenume(), student.getPrenume()) && Objects.equals(getAdresa(), student.getAdresa()) && Objects.equals(getEmail(), student.getEmail()) && Objects.equals(getSpecializare(), student.getSpecializare()) && Objects.equals(getNotaCursuri(), student.getNotaCursuri());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNume(), getPrenume(), getAdresa(), getEmail(), getNrMatricol(), getAnStudiu(), getSpecializare(), getMedieAdmitere(), getNotaCursuri());
    }
    public void adaugaNotaCurs(NotaCurs notaCurs) {
        NotaCursuri.add(notaCurs);
    }

}
