package TwoDArray;

public class SumOfColumn {
    static void main() {
        int[][]arr= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i = 0;i<arr.length;i++) {
            int sum=0;
            for (int j = 0; j < arr.length; j++) {
                sum +=arr[j][i];
            }
            System.out.println("Sum :"+ sum);
        }
    }
}
