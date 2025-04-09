package remain.JAVA.JavaTutorial;

public class MultidimensionalArras {

    public static void main(String [] args){

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]);

        int[][] myNumbers2 = {{1, 2, 3, 4}, {5, 6, 7}};
        myNumbers2[1][2] = 9;
        System.out.println(myNumbers2[1][2]);

        int[][] myNumbers3 = {{1, 2, 3, 4}, {5, 6, 7}};
        for(int i = 0; i < myNumbers3.length; ++i){
            for(int j = 0; j < myNumbers3[i].length; ++j){
                System.out.println(myNumbers3[i][j]);
            }
        }

        int[][] myNumbers4 = {{1, 2, 3, 4}, {5, 6, 7}};
        for(int[] row: myNumbers4){
            for(int i : row){
                System.out.println(i);
            }
        }





    }
}
