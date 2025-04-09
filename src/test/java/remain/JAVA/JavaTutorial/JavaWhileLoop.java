package remain.JAVA.JavaTutorial;

public class JavaWhileLoop {
    public static void main(String [] args){

        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }


        int i2 = 0;
        do{
            System.out.println(i2);
            i2++;
        }while (i2 < 5);


        int countdown = 3;
        while (countdown > 0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");


        int dice = 1;

        while(dice <= 6){
            if(dice < 6){
                System.out.println("No Yatzy.");
            }else{
                System.out.println("Yatzy.");
            }
            dice = dice + 1;
        }


    }
}
