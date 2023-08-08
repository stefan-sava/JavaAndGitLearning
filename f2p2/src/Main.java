import java.util.HashSet;

public class Main {

    public static void comparareObjdinSet(HashSet<Persoana> set1, HashSet<Persoana> set2){
        set1.retainAll(set2);
        System.out.println(set1);
    }

    public static void main(String[] args) {

        HashSet<Persoana> set1 = new HashSet<Persoana>();
        HashSet<Persoana> set2 = new HashSet<Persoana>();

        set1.add(new Persoana("andrei", "1234"));
        set2.add(new Persoana("andrei", "1234"));

        comparareObjdinSet(set1, set2);

    }
}