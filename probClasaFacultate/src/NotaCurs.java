import java.util.Objects;

public class NotaCurs{
    private int CursId;
    private int Nota;

    public NotaCurs(int cursId, int nota) {
        CursId = cursId;
        Nota = nota;
    }

    public int getCursId() {
        return CursId;
    }

    public void setCursId(int cursId) {
        CursId = cursId;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int nota) {
        Nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotaCurs notaCurs)) return false;
        return getCursId() == notaCurs.getCursId() && getNota() == notaCurs.getNota();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCursId(), getNota());
    }

    @Override
    public String toString() {
        return "NotaCurs{" +
                "CursId=" + CursId +
                ", Nota=" + Nota +
                '}';
    }
}
