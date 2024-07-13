class ArrayFrequency
{
    public static void main(String [] args)
    {
        int [] x = {10,2,10,2,10,20,10,2};//8
        int c=0,i,j,d=0;
        for(i=0;i<x.length;i++)
        {
            d=0;
            for(j=i-1;j>=0;j--)
            {
             if(x[i]==x[j])
            {
             d++;
             break;
            }
            }
            if(d==0)
            {
         for(j=i;j<x.length;j++)
         {
            if(x[i]==x[j])
            {
                c++;
            }
         }
        System.out.println(x[i]+ "   " +c);
        c=0;
        }
        }
    }
}