package remain.JAVA.javaKeyWord;

public class JavaAssert {
    public static void main(String [] args){
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        AssertExample example = new AssertExample();
        example.run();
    }
}

class AssertExample{
    public void run(){
        int a = 12;
        try {
            assert a == 12;
            assert a == 12 : "a is not 12";
            assert a == 15 : "a is not 15";
        }catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
}
