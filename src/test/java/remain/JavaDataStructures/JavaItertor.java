package remain.JavaDataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaItertor {
    public static void main(String [] args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(12);
        numbers1.add(8);
        numbers1.add(2);
        numbers1.add(23);
        Iterator<Integer> it1 = numbers1.iterator();
        while(it1.hasNext()){
            Integer i1 = it1.next();
            if(i1 < 10){
                it1.remove();
            }
        }
        System.out.println(numbers1);
    }
}
