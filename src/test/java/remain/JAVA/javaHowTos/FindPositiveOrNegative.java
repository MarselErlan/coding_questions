package remain.JAVA.javaHowTos;

public class FindPositiveOrNegative {
    public static void main(String [] args){
        int myNum = 10;
        if(myNum > 0){
            System.out.println("The value is a positive number.");
        }else if(myNum < 0){
            System.out.println("The value is a negative number.");
        }else {
            System.out.println("The value is 0. ");
        }
    }
}
