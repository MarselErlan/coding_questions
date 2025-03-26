package remain;

import java.util.Scanner;

public class Scaner {

    public static void main(String[] args){
        Scanner myScaner = new Scanner(System.in);
        System.out.println("Enter your StringExmp");

        String MyString = myScaner.nextLine();

        System.out.println("Your StringExmp is: " + MyString);
    }
}
