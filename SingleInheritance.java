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
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
///multiple inheritance:
//class A{
//    void msg(){System.out.println("Hello");}
//}
//class B{
//    void msg(){System.out.println("Welcome");}
//}
//class C extends A,B{//suppose if it were
//
//    public static void main(String args[]){
//        C obj=new C();
//        obj.msg();//Now which msg() method would be invoked?
//    }
//}
public class SingleInheritance {
    public static void main(String[] args) {
        BabyDog v = new BabyDog();
        Cat c=new Cat();
        c.meow();
        v.weep();
        v.bark();
        v.eat();
    }
}

