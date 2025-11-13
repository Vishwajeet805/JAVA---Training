class CorporateMajdoor{
    String Name;
    String EmpID;
    int Salary;
    void Display(){
        System.out.println("Name:"+Name);
        System.out.println("EmpID:"+EmpID);
        System.out.println("Salary:"+Salary);
    }
    void Increment(int x){
        System.out.println("Initial Salary:"+Salary);
        int incre=(Salary* x) / 100;
        Salary+=incre;
        System.out.println("Salary Increment:"+x);
        System.out.println("Final Salary:"+Salary);
    }

    static void main() {
        CorporateMajdoor Emp1=new CorporateMajdoor();
        Emp1.Name="Shruti";
        Emp1.EmpID="SD313";
        Emp1.Salary=40000;
        Emp1.Display();
        Emp1.Increment(20);

    }
}
