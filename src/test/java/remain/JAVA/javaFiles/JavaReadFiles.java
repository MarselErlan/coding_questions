package remain.JAVA.javaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaReadFiles {
    public static void main(String [] args){
        try{
            File myobj = new File("fileName2.txt");
            Scanner myReader = new Scanner(myobj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred. ");
        e.printStackTrace();
        }

    }
}
