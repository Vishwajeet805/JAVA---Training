 class MethodOverRidding {
    void add(int a){
        System.out.println(a);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

     static void main() {
         MethodOverRidding m=new MethodOverRidding();
         m.add(2);
         m.add(2,4);
         m.add(1,6,7);
     }
}
