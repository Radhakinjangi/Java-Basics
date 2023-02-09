class Employee {
    void score() {System.out.println("first rank");}
}
class Backflipt extends Employee{

    void score(){
        super.score();
        System.out.println("second rank");}
}

class FuncOverriding extends Employee{
    public static void main(String args[]){


        Backflipt obj = new Backflipt();

        obj.score();
    }
}
