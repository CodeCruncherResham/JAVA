//example of interface_01
interface Iname
{
    public abstract void show();
}
class Intrfc_01 implements Iname
{
 public void show()
 {
    System.out.println("first example of interface");
 }
 public static void main(String [] args)
 {
   Intrfc_01 i = new Intrfc_01();
   i.show();
 }
}