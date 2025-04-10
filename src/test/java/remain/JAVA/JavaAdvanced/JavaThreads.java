package remain.JAVA.JavaAdvanced;

public class JavaThreads extends Thread {
//    public static void main(String [] args){
//        JavaThreads threads = new JavaThreads();
//        threads.start();
//        System.out.println("This code is outside of the tread");
//    }
//
//    public void run(){
//        System.out.println("This code is running in a thread");
//    }





//    public static int amount = 0;
//    public static void main(String [] args){
//        JavaThreads thread = new JavaThreads();
//        thread.start();
//        System.out.println(amount);
//        amount++;
//        System.out.println(amount);
//    }
//
//    public void run(){
//        amount++;
//    }








//    public static void main(String [] args){
//        JavaThreads obj1= new JavaThreads();
//        Thread thread = new Thread(String.valueOf(obj1));
//        thread.start();
//        System.out.println("This code is outside of the tread");
//    }
//
//    public void run(){
//        System.out.println("This code is running in a thread");
//    }







    public static int amount1 = 0;
    public static void main(String [] args){
        JavaThreads thread1 = new JavaThreads();
        thread1.start();

        while(thread1.isAlive()){
            System.out.println("Waiting... ");
        }
        System.out.println("Main: " + amount1);
        amount1++;
        System.out.println("Main: " + amount1);
    }

    public void run(){
        amount1++;
    }


}
