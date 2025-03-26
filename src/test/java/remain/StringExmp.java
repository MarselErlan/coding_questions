package remain;

public class StringExmp {
    public static void main(String[] args){

        String txt = "asdfghjkqwertyuiopzxcvbnm";
        System.out.println("The length of the txt string is: " + txt.length());


        String txt2 = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));

        String firstName = "Jhon";
        String lastName = "Doa";
        System.out.println(firstName + " " + lastName);

        String firstName2 = "John";
        String lastName2 = "Doa";
        System.out.println(firstName2.concat(lastName2));

        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);

        String txt4 = "We are the so-called\"Vikings\" from the north.";
        String txt5 = "It\'s alright.";
        String txt6 = "The character \\ is called backslash.";



    }
}
