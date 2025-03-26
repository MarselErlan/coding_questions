package remain.javaMethods;


public class JavaRecursion {

    public static void main(String [] args){
        int result = sum(10);
        int result2 = sum2(5, 10);
        System.out.println(result);
        System.out.println(result2);
    }

    public static int sum(int k){
        if(k > 0){
            return k + sum(k - 1);
        }else{
            return 0;
        }
    }

    public static int sum2(int start, int end){
        if(end > start){
            return end + sum2(start, end - 1);
        }else {
            return end;
        }
    }
}
