class Animal {
    void eat(){System.out.println("I am eating");}

}
class Fox extends Animal{
    void bark(){System.out.println("i am barking");
    }
}
class BabyDog extends Fox{
    void weep(){System.out.println("weeping...");}
}
public class SingleInheritance {
    public static void main(String[] args) {
        BabyDog v = new BabyDog();
        v.weep();
        v.bark();
        v.eat();
    }
}

