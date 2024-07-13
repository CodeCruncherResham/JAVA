class PrintConstNumber
{
        PrintConstNumber(int a)
    {
        System.out.println("One Argument int type");
    }
            PrintConstNumber(float a)
    {
        System.out.println("One Argument float type ");
    }
        PrintConstNumber(double a)
    {
        System.out.println("one argument double type ");
    }
        String n;
    PrintConstNumber(String a)
    {
        n=a;
    }
    String getn()
    {
        return n;
    }

    public static void main(String[] args)
    {
        PrintConstNumber o2 = new PrintConstNumber(2);
        PrintConstNumber o4 = new PrintConstNumber(3.5f);
        PrintConstNumber o3 = new PrintConstNumber(4.123456);
        PrintConstNumber o5 = new PrintConstNumber("Argument with string type");          
                System.out.println(o5.getn());


}
}