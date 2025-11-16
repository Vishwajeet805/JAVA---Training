package MethodOverloading;

class Array {
    void display(int[] arr) {
        System.out.print("Integer Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    void display(String[] arr) {
        System.out.print("String Array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    void display(int[][] matrix) {
        System.out.println("2D Integer Array:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array obj = new Array();

        int[] nums = {1, 2, 3, 4};
        String[] names = {"Ram", "Shyam", "Mohan"};
        int[][] table = {
                {1, 2},
                {3, 4}
        };

        obj.display(nums);
        obj.display(names);
        obj.display(table);
    }
}
