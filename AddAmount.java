class AddAmount
{
    int amount;
        AddAmount()
    {
        amount=50;
    }
    AddAmount(int x)
    {
        amount=50;
        amount=x+50;
    }
    int getamount()
    {
        return amount;
    }
    public static void main(String[] args)
    {
        AddAmount s1 = new AddAmount();
        AddAmount s2 = new AddAmount(150);

            System.out.println(s1.getamount());
            System.out.println(s2.getamount());
    }


}