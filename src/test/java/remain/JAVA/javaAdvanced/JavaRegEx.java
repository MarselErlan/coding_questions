package remain.JAVA.javaAdvanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegEx {
    public static void main(String [] args){
        Pattern pattern = Pattern.compile("Erlan", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Abduraimov Erlan");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }else{
            System.out.println("match not Found");
        }
    }
}
