package remain.JAVA.javaHowTos;

public class ConvertStringToArray {
    public static void main(String [] args){
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray[0]);
        System.out.println("----------------");
        for(char i : myArray){
            System.out.println(i);
        }
    }
}
