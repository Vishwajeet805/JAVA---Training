import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Hii");
        short b=5;
        int c=4;
        float f=90.8f;
        boolean data=false;
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
        System.out.println(data);

        int val=85;
        if (val%2==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int aa =sc.nextInt();
        System.out.println(aa);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }


    }


    }


