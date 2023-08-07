public class Main {
    public static void main(String[] args) {
        Carte carte1 = new Carte("John Cena", "John Cena", 15);
        Carte carte2 = new Carte("John Cena", "John Cena", 15);
        Carte carte3 = new Carte("John Cena", "John Cena", 11);

        if(carte1.equals(carte2)) {
            System.out.println("Cartile sunt identice.");
        }
        if(carte1.equals(carte3)) {
            System.out.println("Cartile sunt identice.");
        }
        else {
            System.out.print("Cartile nu sunt identice.");
        }
    }
}