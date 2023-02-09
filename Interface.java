interface Icecream{
    void cost();
}
class Chocobar implements Icecream{
    public void cost(){System.out.println("40rs");}
}
class Venilla implements Icecream{
    public void cost(){System.out.println("50 rs");}
}
class Strawberry implements Icecream{
    public void cost(){System.out.println("60 rs");}
}
class Interface{
    public static void main(String[] args){
        Icecream s=new Strawberry();
        //Icecream s=new Venilla();
        //Icecream s=new Chocobar();
        s.cost();

    }
}