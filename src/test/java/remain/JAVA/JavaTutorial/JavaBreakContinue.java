package remain.JAVA.JavaTutorial;

public class JavaBreakContinue {
    public static void main(String [] args){


        for(int i = 0; i < 10; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }

        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
            if(i == 4){
                break;
            }
        }

        int i2 = 0;
        while (i2 < 10){
            if(i2 == 4){
                i++;
                continue;
            }
            System.out.println(i2);
            i++;
        }
    }
}
