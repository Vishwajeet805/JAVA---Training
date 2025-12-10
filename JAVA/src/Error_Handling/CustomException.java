package Error_Handling;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new MyException("Underage not allowed");
            }
            System.out.println("Eligible");
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

