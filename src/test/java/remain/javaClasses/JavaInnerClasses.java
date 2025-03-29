package remain.javaClasses;

class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
        public int myInnerMethod(){
            return x;
        }

    }
}


public class JavaInnerClasses {
    public static void main(String [] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
        System.out.println(myInner.myInnerMethod());
    }
}
