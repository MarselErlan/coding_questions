package remain.JAVA.javaHowTos;

import java.util.HashMap;

public class HashMapLoop {
    public static void main(String [] args){

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        for(String i : capitalCities.keySet()){
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
        }
    }

}
