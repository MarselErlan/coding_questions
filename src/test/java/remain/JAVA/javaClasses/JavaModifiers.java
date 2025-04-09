package remain.JAVA.javaClasses;

abstract class JavaModifiers {

//    final int x = 10;
//    final double PI = 3.14;
//
//    public static void main(String [] args){
//        JavaModifiers myobj = new JavaModifiers();
//
//        myobj.x = 50;
//        myobj.PI = 25;
//        System.out.println(myobj.x);
    // error
//    }
//    static void myStaticMethod(){
//        System.out.println("Static methods cab be called without  creating objects");
//    }
//
//    public void myPublicMethod(){
//        System.out.println("Public methods must be called by creating objects");
//    }

    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

class Student extends JavaModifiers {
    public int graduationYear = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}


class Second {
    public static void main(String[] args) {
//        myStaticMethod();
//        JavaModifiers myobj = new JavaModifiers();
        Student myobj33 = new Student();
//        myobj.myPublicMethod();

        System.out.println("Name: " + myobj33.fname);
        System.out.println("Age: " + myobj33.age);
        System.out.println("Graduation Year: " + myobj33.graduationYear);
        myobj33.study();

    }
}
