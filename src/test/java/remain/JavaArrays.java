package remain;

public class JavaArrays {

    public static void main(String [] args){

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        //-------------------------------------------------------------------

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};

        for(int i = 0; i < cars2.length; i++){
            System.out.println(cars2[i]);
        }

        for(String i : cars2){
            System.out.println(i);
        }


        //---------------------------------------------------------------------

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age: ages){
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        //Print the average
        System.out.println("The average age is: " + avg);



        int ages2[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int length2 = ages2.length;
        int lowestAge = ages2[0];

        for(int age: ages){
            if(lowestAge > age){
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);



    }
}
