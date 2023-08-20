public abstract class Angajat extends Persoana{
    String Nume;
    String Prenume;
    String Adresa;
    String Email;
    double Salariu;
    double Vechime;

    public abstract double getSalariu();

    public abstract void setSalariu(double Salariu);

    public abstract double getVechime();

    public abstract void setVechime(double Vechime);


}
