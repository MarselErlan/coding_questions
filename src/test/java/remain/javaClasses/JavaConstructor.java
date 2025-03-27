package remain.javaClasses;

public class JavaConstructor {
    int x;
    int modelYear;
    String modelName;

//    public JavaConstructor(){
//        x = 5;
//    }
//    public JavaConstructor(int y){
//        x = y;
//    }

    public JavaConstructor(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String [] agrs){
//        JavaConstructor myobj = new JavaConstructor();
//        JavaConstructor myobj = new JavaConstructor(5);
        JavaConstructor myCar = new JavaConstructor(1969, "Mustang");
//        System.out.println(myobj.x);
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }
}
