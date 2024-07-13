
class Sequence
{
    public static void main(String [] args)
    {
        int subseq=3,sum=0;
        int [] a ={10,20,30,40,50,60,70,80,90};//9

        for(int i=0;i<a.length-subseq;i++)
        {
            for(int j=i;j<i+subseq;j++)
            {
                sum=sum+a[j];
            }
        
        System.out.println(sum);
        sum=0;
        }
    }
}
//when we use subsequence means use sliding window approch
//ye program brouteforce method me bna he