//method overriding
class M{
    void show(){
        System.out.println("Resham");
    }
}
class N extends M
{
    void display()
    {
        System.out.println("Yadav");
    }
    public static void main(String[] args)
    {
        N x = new N();
        x.show();
        x.display(); 
    }
}