import java.util.Objects;

public abstract class Angajat extends Persoana{
    String Nume;
    String Prenume;
    String Adresa;
    String Email;
    int Salariu;
    int Vechime;

    public abstract int getSalariu();

    public abstract void setSalariu(int Salariu);

    public abstract int getVechime();

    public abstract void setVechime(int Vechime);
}
