package remain.JAVA.JavaDataStructures;

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String [] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");



        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("England"));

        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }
        System.out.println("----------------------");
        for(String i : capitalCities.values()){
            System.out.println(i);
        }
        System.out.println("----------------------");
        for(String i : capitalCities.keySet()){
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
        }

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for(String i : people.keySet()){
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
