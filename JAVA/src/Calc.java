class Calculator{
    int add(int x, int y){
        return x+y;
    }
    int sub(int x, int y){
        return x-y;
    }
    int mul(int x, int y){
        return x*y;
    }
    int div(int x, int y){
        if(y==0){
            System.out.println("Can't Divde by 0");
        return 0;}
        else
            return x/y;
    }

    static void main() {
        Calculator calc=new Calculator();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.sub(10, 5));
        System.out.println("Multiply: " + calc.mul(10, 5));
        System.out.println("Divide: " + calc.div(10, 5));
    }
}


