//find the largest element in an array using brute force method

class Longest{
    public static void main(String args [])
    {
        int [] arr = {20,10,20,4,100};
        int max = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}