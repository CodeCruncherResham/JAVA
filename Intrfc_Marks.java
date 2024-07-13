class Marks
{
        protected int sub1, sub2, sub3;

    // Constructor for student A
    public void set(int s1, int s2, int s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

}
interface I1
{
 public void cal();
}
class Intrfc_Marks extends Marks implements I1
{
    public void cal()
    {
        System.out.println(sub1+sub2+sub3);
    }
    public static void main(String[] args)
    {
        Intrfc_Marks im = new Intrfc_Marks();
        im.set(4,6,5);
        im.cal();
    }
}