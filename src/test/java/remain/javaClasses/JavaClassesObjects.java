package remain.javaClasses;

import com.sun.tools.javac.Main;

public class JavaClassesObjects {

    int x = 5;
    int x2 = x + 1;

    public static void main (String [] args){
        JavaClassesObjects myobj = new JavaClassesObjects();
        JavaClassesObjects myobj2 = new JavaClassesObjects();
        System.out.println(myobj.x);
        System.out.println(myobj2.x2);
    }

}
