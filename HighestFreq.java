class HighestFreq{
    public static void main(String [] args)
    {
        int arr [] = {1,2,3,1,5,7,5,5,9};
        int max_count=0,freq=0;
        for(int i = 0;i<arr.length;i++)
        {
            int count=0;
            for(int j = 0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count > max_count)
            {
                max_count = count;
                freq = arr[i];
            }
        }
        System.out.println("Most frequentelement is : "+freq);
    }
}