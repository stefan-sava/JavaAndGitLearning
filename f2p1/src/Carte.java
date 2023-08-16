import java.util.Objects;

public class Carte {
    private String Titlu;
    private String Autor;
    private int nrPag;

    public String getTitlu() {
        return Titlu;
    }

    public void setTitlu(String titlu) {
        Titlu = titlu;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNrPag() {
        return nrPag;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    public Carte(String titlu, String autor, int nrPag) {
        Titlu = titlu;
        Autor = autor;
        this.nrPag = nrPag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte carte)) return false;
        return getNrPag() == carte.getNrPag() && Objects.equals(getTitlu(), carte.getTitlu()) && Objects.equals(getAutor(), carte.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitlu(), getAutor(), getNrPag());
    }
}
//
