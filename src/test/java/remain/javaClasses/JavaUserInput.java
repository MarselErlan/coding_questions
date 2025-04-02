package remain.javaClasses;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Age and Salary");



        String Name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();


        System.out.println("Name is: " + Name);
        System.out.println("Name is: " + age);
        System.out.println("Name is: " + salary);
    }
}
