class TestStaticVar {
    int roll_no;
    String name;
    static String college="JNTUK";
    static void change(){
        college = "AU";
    }
    TestStaticVar(int i,String n){
        roll_no=i;
        name=n;

    }
    void display(){
        System.out.println(roll_no+" "+name+" "+college);
    }
}
public class StaticVar{
    static{System.out.println("static block is invoked");}
    public static void main(String args[]){
        TestStaticVar.change();
        TestStaticVar s1 = new TestStaticVar(111,"Karan");
        TestStaticVar s2 = new TestStaticVar(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}

