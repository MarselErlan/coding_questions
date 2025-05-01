package remain.JAVA.javaFiles;

import java.io.File;

public class JavaDeleteFiles {
    public static void main(String [] args){
        File myobj = new File("fileName3.txt");
        if(myobj.delete()){
            System.out.println("Delete the file: " + myobj.getName());
        }else{
            System.out.println("Failed to delete the file. ");
        }

        File myobj2 = new File("/Users/macbookpro/Desktop/Batch6/coding_questions/fileName4.txt");
        if(myobj2.delete()){
            System.out.println("Deleted the folder: " + myobj2.getName());
        }else {
            System.out.println("Failed to delete the folder. ");
        }

    }
}
