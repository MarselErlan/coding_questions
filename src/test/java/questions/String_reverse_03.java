package questions;


import java.util.Scanner;

public class String_reverse_03 {

    public static void main(String [] args){
        System.out.println(revStr("apple"));

    }

    public static String revStr(String str){
        StringBuilder res = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
