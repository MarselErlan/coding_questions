package remain.JAVA.javaReference.javaKeyWord;

abstract class JavaAbstract {
    public String fName = "Jhon";
    public int age = 24;
    public abstract void study();

}

class  Student extends JavaAbstract{
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all day long");
    }
}

class Second{
    public static void main(String [] agrs){
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fName);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}