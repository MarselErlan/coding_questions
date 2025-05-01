package remain.JAVA.javaHowTos;

public class CountWords {
    public static void main(String [] args){
        String words = "One Two Three Four u jk k";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
