import java.util.Objects;

public class Curs {
    private int CursId;
    private String Denumire;
    private String Titular;

    public Curs(int cursId, String denumire, String titular) {
        CursId = cursId;
        Denumire = denumire;
        Titular = titular;
    }

    public int getCursId() {
        return CursId;
    }

    public void setCursId(int cursId) {
        CursId = cursId;
    }

    public String getDenumire() {
        return Denumire;
    }

    public void setDenumire(String denumire) {
        Denumire = denumire;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curs curs)) return false;
        return getCursId() == curs.getCursId() && Objects.equals(getDenumire(), curs.getDenumire()) && Objects.equals(getTitular(), curs.getTitular());
    }

    @Override
    public String toString() {
        return "Curs{" +
                "CursId=" + CursId +
                ", Denumire='" + Denumire + '\'' +
                ", Titular='" + Titular + '\'' +
                '}';
    }
}
