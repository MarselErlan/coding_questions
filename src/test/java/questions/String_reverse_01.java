package questions;


import java.util.Scanner;

public class String_reverse_01 {

    public static void main(String [] args){
        System.out.println("Enter your StringExmp: ");
        Scanner mySraner = new Scanner(System.in);
        String myString = mySraner.nextLine();
        String reversString = "";

        for(int i = myString.length()-1; i != -1; i--){
            reversString = reversString + myString.charAt(i);
        }

        System.out.println(reversString);

    }
}
