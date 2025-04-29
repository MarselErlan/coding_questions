package remain.JAVA.JavaAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y){
        brand = b;
        model = m;
        year = y;
    }
}

class SortByYear implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {

        Car a = (Car) o1;
        Car b = (Car) o2;

        if(a.year < b.year) return -1;
        if(a.year > b.year) return 1;
        return 0;
    }
}


public class JavaAdvancedSorting {
    public static void main(String [] args){
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        for(Car c: myCars){
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}

