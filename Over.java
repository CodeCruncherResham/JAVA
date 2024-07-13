//it's a example of method overriding with Super kryword
class M{
    void show()
    {
        System.out.println("faultforchild");
    }
}
class Over extends M{
       void show()
    {
       super.show();//its called M
        System.out.println("FAULTFORCHILD");
    }
 public static void main(String[] args)
 {
    Over o = new Over();
    o.show();//its called over
 }
}