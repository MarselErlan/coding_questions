package remain.JAVA.javaHowTos;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String [] args){
        int x, y, sum;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Type a number: ");
        x = myobj.nextInt();
        System.out.println("Type another number");
        y = myobj.nextInt();
        sum = x + y;
        System.out.println("Sum is : " + sum);
    }

}
