//example of print sum using sliding window
//when we use subsequence means use sliding window approch

class Sliding
{
    public static void main(String [] args)
    {
        int [] a = {10,20,30,40,50,60,70,80,90,100};
        int z=3,sum=0;//z determine subseuence
      for(int i=0;i<z;i++)
      {
        sum=sum+a[i];
      }
      System.out.println(sum);
      for(int i=z;i<a.length-z;i++)
      {
        sum=sum+a[i]-a[i-z];
      }
            System.out.println(sum);

    }
}