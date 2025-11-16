package TwoDArray;

public class MaxELement {
    static void main() {
        int[][]arr= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int Max=arr[0][0];
        for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]>Max)
                    Max=arr[i][j];
            }
        }
        System.out.println("Max Element :"+ Max);
    }
}
