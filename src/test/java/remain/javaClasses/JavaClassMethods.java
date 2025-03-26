package remain.javaClasses;

public class JavaClassMethods {
    static void myMethod(){
        System.out.println("Hello Word!");
    }

    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }


    public static void main(String [] agrs){
        myMethod();
        myStaticMethod();
        JavaClassMethods myobjjjj = new JavaClassMethods();
        myobjjjj.myPublicMethod();
        JavaClassMethods myCar = new JavaClassMethods();
        myCar.fullThrottle();
        myCar.speed(200);
    }


}



