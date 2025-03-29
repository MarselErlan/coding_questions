package remain.javaClasses;

abstract class Animal1{
    public abstract void animalSound1();

    public void sleep1(){
        System.out.println("Zzzz");
    }
}

class Pig1 extends Animal1{
    public void animalSound1(){
        System.out.println("The pig says: wee wee");
    }
}


public class JavaAbstraction {
    public static void main(String [] args){
        Pig1 myPig1 = new Pig1();
        myPig1.animalSound1();
        myPig1.sleep1();
    }

}
