package remain.JAVA.javaClasses;

public class JavaClassAttributes {

//    final int x  = 10; java: cannot assign a value to final variable x
    int x  = 10;
    int y = 3;
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main (String [] args){
        JavaClassAttributes myobj = new JavaClassAttributes();
        System.out.println(myobj.y);
        System.out.println(myobj.x);
        myobj.x = 40;
        System.out.println(myobj.x);
        System.out.println("Name: " + myobj.fname + " " + myobj.lname);
        System.out.println("Age: " + myobj.age);


    }
}
