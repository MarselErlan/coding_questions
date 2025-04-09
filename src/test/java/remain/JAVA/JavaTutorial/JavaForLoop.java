package remain.JAVA.JavaTutorial;

public class JavaForLoop {
    public static void main(String [] args){


        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }

        // nested loops _________________________________________________

        // Outer loop
        for(int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i);
            // Inner loop
            for(int j = 1; j <= 3; j++){
                System.out.println(" Inner : " + j);
            }
        }


        // For-Each loops _______________________________________-

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i += 10){
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }

        int number = 2;

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
