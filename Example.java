//class and object
class M
{
        private int id;
    //set is used for value 
    public void setid(int r)
    {
        id = r;
    }
    public int getid()
    {
        return id;
    }
}
class Example
{

    public static void main(String[] args)
    {
        M e1 = new M();
        e1.setid(17);
        System.out.println(e1.getid());
        //get is used for print 
    }
}