class Array{
    public static void main(String [] args){
        int [] x = {10,20,30,4,7,85,50};
        int sum=0,max=0,min=x[0];
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);

                        //for find sum of array 
            sum=sum+x[i];
                        //for find maximum value of array 
            if(max<x[i]){
        max=x[i];
            }
            //for find minimum value of array 
        if(min>x[i]){
        min=x[i];
            }

        }
        System.out.println("total sum of array is :"+sum);
       System.out.println("maximum value of array is :"+max);               
       System.out.println("minimum value of array is :"+min);


    }
}