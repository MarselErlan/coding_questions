package remain.JAVA.JavaDataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaArrayList  {
    public static void main(String [] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        cars.add(0, "Mazda");
        System.out.println(cars);
        cars.set(0, "Opel");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
//        cars.size();
//        cars.clear();
//        cars.size();

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("--------------------");
        Collections.sort(cars);
        for(String i : cars){
            System.out.println(i);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(30);
        myNumbers.add(25);

        for(int i : myNumbers){
            System.out.println(i);
        }
        System.out.println("--------------");
        Collections.sort(myNumbers);
        for(int i : myNumbers){
            System.out.println(i);
        }



    }
}
