import java.util.Objects;

public abstract class Persoana {
    public abstract String getNume();

    public abstract void setNume(String nume);

    public abstract String getPrenume();

    public abstract void setPrenume(String prenume);

    public abstract String getAdresa();

    public abstract void setAdresa(String adresa);

    public abstract String getEmail();

    public abstract void setEmail(String email);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana persoana)) return false;
        return Objects.equals(getNume(), persoana.getNume()) && Objects.equals(getPrenume(), persoana.getPrenume()) && Objects.equals(getAdresa(), persoana.getAdresa()) && Objects.equals(getEmail(), persoana.getEmail());
    }


}
