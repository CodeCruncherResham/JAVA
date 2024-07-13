
class MaxSeq
{
    public static void main(String [] args)
    {
        int subseq=3,sum=0,max=0,j;
        int [] a ={10,20,30,40,50,60,70,80,90};//9

        for(int i=0;i<=a.length-subseq;i++)
        {
            
            for(j=i;j<subseq+i;j++)
            {
            
                sum=sum+a[j];
            }
            if(sum>max)
            {
                max=sum;
            }
            sum=0;
        }    
             System.out.println(max);

        
    }
}
//find maximum sequence 