package remain.JAVA.JavaAdvanced;

public class JavaExceptions {

    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }else{
            System.out.println("Access granted - You are old enough.");
        }
    }

    public static void main(String [] args){

    try{
    }
    catch(Exception e){
    }

//    int [] myNumbers = {1, 2, 3};
//        System.out.println(myNumbers[10]); // errror

        try{
            int [] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("The 'try catch' is finished.");
        }


        System.out.println("----------------------");
        checkAge(15);

    }

}
