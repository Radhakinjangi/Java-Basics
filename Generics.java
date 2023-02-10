
class Test1<T, U>
{
    T obj1;
    U obj2;
    Test1(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
class Test<T> {
    T obj;
    Test(T obj) { this.obj = obj; }
    public T getObject() { return this.obj; }
}
class Main {
    public static void main(String[] args)
    {
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        Test<String> sObj= new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());

        Test1 <String, Integer> obj = new Test1<String, Integer>("GfG", 15);
        obj.print();

        obj.genericDisplay(11);

        // Calling generic method with String argument
        obj.genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        obj.genericDisplay(1.0);

    }
}
