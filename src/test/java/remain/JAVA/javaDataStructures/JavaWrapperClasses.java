package remain.JAVA.javaDataStructures;

public class JavaWrapperClasses {
    public static void main(String [] args){
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer myInt1 = 100;
        String myString = myInt1.toString();
        System.out.println(myString.length());
    }
}
