//Remove duplicates elements from array and sum

class DuplicateArrS{
    public static void main(String [] args){
                int [] x = {10,20,10,20,10,20};//6
        int c=0,j,k,i,s=0;
        for(i=0;i<x.length-c;i++)
        {
            for(j=i+1;j<x.length-c;j++)
            {
                if(x[i]==x[j])
                {
                        for(k=j;k<x.length-1-c;k++)
                        {
                            x[k]=x[k+1];
                        }
                    c++;
                    j--;
                }
            }
        }
        System.out.println("No of matches " +c+ " Elememnet " +(x.length-c));
        for(i=0;i<x.length-c;i++){
                    s=s+x[i];
        }
         System.out.println("total sum of array is :"+s);
    }
}