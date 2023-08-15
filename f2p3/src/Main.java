import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

/*    public static String gasireID(String line){

        Pattern pattern = Pattern.compile("(.*?)\\*");
        Matcher matcher = pattern.matcher(line);
        if(matcher.find())
            return matcher.group(1);
    }
 */

      public static String gasireTipuriObiecte(String line){

        Pattern pattern = Pattern.compile("\\*(.*?)\\*");
        Matcher matcher = pattern.matcher(line);
        String match = new String();
        if (matcher.find()) {
            match = matcher.group(1);
        }
        return match;
    }

    public static void main(String[] args){

        List<String> med = new ArrayList<>();
        med.add("medicament");
        List<String> dispMed = new ArrayList<>();
        dispMed.add("dispozitiveMedicale");
        List<String> die = new ArrayList<>();
        die.add("dieta");
        List<String> list= new ArrayList<String>();


        File inputFromIN = new File("C:\\Users\\stefa\\IdeaProjects\\JavaPOB\\f2p3\\src\\in.txt");
        File inputFromProduse = new File("C:\\Users\\stefa\\IdeaProjects\\JavaPOB\\f2p3\\src\\produse.txt");


        try (Scanner myReader = new Scanner(inputFromIN)) {

                    while(myReader.hasNext()){

                        String dataIN = myReader.nextLine();
                        list.add(dataIN);
                        String tipMedicament = gasireTipuriObiecte(dataIN);

                        if(tipMedicament.equalsIgnoreCase(med.get(0))){
                            med.add(dataIN);

                        }
                        else if (tipMedicament.equalsIgnoreCase(dispMed.get(0))) {
                            dispMed.add(dataIN);
                        }

                        else if (tipMedicament.equalsIgnoreCase(die.get(0))){
                            die.add(dataIN);
                        }

                    }
                    List<String> dispMedSortate = new ArrayList<>();
                    dispMedSortate.retainAll(dispMed);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
