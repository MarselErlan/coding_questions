package remain.JAVA.javaAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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


class SortEvenFirst implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;

        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if(aIsEven == bIsEven){
            if(aIsEven){
                return -1;
            }else {
                return 1;
            }
        }
        return 0;
    }
}


public class JavaAdvancedSorting {
    public static void main(String [] args){
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Comparator myComparator2 = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator2);

        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        for(int i: myNumbers){
            System.out.println(i);
        }

        System.out.println("-----------------------");

        for(Car c: myCars){
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}

