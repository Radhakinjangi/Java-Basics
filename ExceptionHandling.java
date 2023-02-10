public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int a[]=new int[5];
            a[10]=45;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block always excuted");
        }
    }
}
