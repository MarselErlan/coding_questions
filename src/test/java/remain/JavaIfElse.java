package remain;

public class JavaIfElse {
    public static void main(String [] args){
        if(20 > 18){
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;

        if(x > y){
            System.out.println("X is greater than y");
        }


        int time = 20;
        if(time < 18){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening.");
        }

        int time2 = 22;
        if(time2 < 10){
            System.out.println("Good morning.");
        }else if(time < 18){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening.");
        }


        int doorCode = 1337;

        if(doorCode == 1337){
            System.out.println("Correct code. The door is now open.");
        }else{
            System.out.println("Wrong code. The door remains closed.");
        }

        int myNum = 10;

        if(myNum > 1){
            System.out.println("The value is a positive number.");
        }else if(myNum < 0){
            System.out.println("The value is a negative number.");
        }else{
            System.out.println("The value is 0.");
        }

        int myAge = 25;
        int votingAge = 18;

        if(myAge >= votingAge){
            System.out.println("Old enough to vote!");
        }else{
            System.out.println("Not Old enough to vote!");
        }


        int myNum2 = 5;
        if(myNum2 % 2 == 0){
            System.out.println(myNum2 + "is Even");
        }else{
            System.out.println(myNum2 + "is Odd");
        }

    }
}
