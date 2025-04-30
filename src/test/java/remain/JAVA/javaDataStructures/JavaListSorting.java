package remain.JAVA.javaDataStructures;
import java.util.ArrayList;
import java.util.Collections;

public class JavaListSorting {
    public static void main(String [] args){
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(cars);
        Collections.sort(myNumbers);

        for(String i : cars){
            System.out.println(i);
        }

        for(int i : myNumbers){
            System.out.println(i);
        }

        Collections.sort(cars, Collections.reverseOrder());

        for(String i : cars){
            System.out.println(i);
        }

        Collections.sort(myNumbers, Collections.reverseOrder());

        for(int i : myNumbers){
            System.out.println(i);
        }


    }
}
