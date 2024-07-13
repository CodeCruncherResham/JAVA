//Remove duplicates elements from array
class DuplicateArray{
    public static void main(String [] args){
        // int [] x = {1,2,3,1,1,2};
                int [] x = {10,2,10,20,10,10,3,10,2,10,2};//11

        int c=0,j,k,i;


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
            System.out.println(x[i]);
        }
    }
}