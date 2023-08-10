import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void gasireID(String line){

        Pattern pattern = Pattern.compile("(.*?)\\*");
        Matcher matcher = pattern.matcher(line);

        if(matcher.find()) {

            System.out.println(matcher.group(1));

        }

    }

    // Inutil, nu era necesar gasirea in in.txt

 /*   public static String gasireTipuriObiecte(String line){

        Pattern pattern = Pattern.compile("\\*(.*?)\\*");
        Matcher matcher = pattern.matcher(line);
        String match = new String();
        if (matcher.find()) {
            match = matcher.group(1);
        }

        return match;
    }*/

    public static void main(String[] args){

        File input = new File("C:\\Users\\stefa\\IdeaProjects\\JavaPOB\\f2p3\\src\\in.txt");

        try (Scanner myReader = new Scanner(input)) {

                    while(myReader.hasNext()){

                        String dataIN = myReader.nextLine();
                        gasireID(dataIN);

                    }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

//TODO Fisierul produse.txt era deja dat de catre problema, trebuie modificat o mare parte din cod. Nu este nevoie de un fisier de iesire creat.
//TODO Trebuie citite toate produsele de in.txt si bagate intr-o colectie.
//TODO Trebuie creata o lista pentru fiecare din produsele din fisierul.txt si cele din in.txt bagate in el.
//TODO Sortare dupa ID (nu specifica unde deci o sa fie facuta la alegere)
//TODO Trebuie verificat daca exista dispozitive medicale unice.