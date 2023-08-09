import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void Comparator(String line){

        Pattern pattern = Pattern.compile("\\*(.*?)\\*");
        Matcher matcher = pattern.matcher(line);
        if(matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }

    public static void main(String[] args){

        File input = new File("C:\\Users\\stefa\\IdeaProjects\\JavaPOB\\f2p3\\src\\in.txt");

       // File output = File.createTempFile("produse",".txt");


        try (Scanner myReader = new Scanner(input)) {
            while(myReader.hasNext()){
                String data = myReader.nextLine();
                Comparator(data);


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}