package remain.JAVA.JavaDataStructures;

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String [] args){
        HashSet<String> cars = new HashSet<String>();
        HashSet<Integer> numbers = new HashSet<Integer>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        System.out.println(cars.size());
        for(String i : cars){
            System.out.println(i);
        }

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for(int i = 1; i <= 10; i++){
            if(numbers.contains(i)){
                System.out.println(i + " was found in the set.");
            }else{
                System.out.println(i + "was not found in the set.");
            }
        }

    }
}
