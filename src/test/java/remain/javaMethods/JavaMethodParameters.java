package remain.javaMethods;

public class JavaMethodParameters {
    static void myMethod(String fname){
        System.out.println(fname + " Refsnes");
    }

    static void myMethod2(String fname2, int age){
        System.out.println(fname2 + " is " + age);
    }

    static void checkAge(int age){
        if(age < 18){
            System.out.println("Access denied - You are not old enough!");
        }else{
            System.out.println("Access granted - You are old enough!");
        }
    }

    //---------------------------------------------------------

    static int myMethod(int x){
        return 5 + x;
    }

    static int myMethod(int x, int y){
        return x + y;
    }




    public static void main(String [] args){
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        myMethod2("Liam", 5);
        myMethod2("Jenny", 8);
        myMethod2("Anja", 31);
        checkAge(20);

        System.out.println(myMethod(3));
        System.out.println(myMethod(5, 3));
        int z = myMethod(5, 3);
        System.out.println(z);
    }



}
