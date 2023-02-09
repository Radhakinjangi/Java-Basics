class Human{
    private String bloodType;
    Human(String bT){
        this.bloodType=bT;
        System.out.println("i am not a lizard");
    }
    public String getBloodType(){
        return bloodType;
    }
}
public class ParaConstructor{
    public static void main(String[] args){
        Human h1=new Human( "ABC");
        System.out.println(h1.getBloodType());


    }
}