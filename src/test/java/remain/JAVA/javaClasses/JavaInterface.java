package remain.JAVA.javaClasses;

interface Animal_I{
    public void animalSound_I();
    public void sleep_I();
}

class Pig_I implements Animal_I{
    public void animalSound_I(){
        System.out.println("The pig says: wee wee");
    }

    public void sleep_I(){
        System.out.println("Zzzzz");
    }
}

public class JavaInterface {
    public static void main(String [] args){
        Pig_I myPig_I = new Pig_I();
        myPig_I.animalSound_I();
        myPig_I.sleep_I();
    }


}
