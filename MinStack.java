import java.util.*;
class MinStack
{
    public static void main(String [] args)
    {
        Stack<Integer> l = new Stack<Integer>();

        l.push(10);
        l.push(1);
        l.push(20);
        l.push(40);
        l.push(50);
        l.push(30);
        int min=l.peek();
        while(!l.empty())
        {
          System.out.println(l.peek());
          l.pop();
        for(int i=0;i<l.size();i++)
        {
            if(l.peek()<min){
            min=l.peek();
            }
        }
        }
          System.out.println("minimum element in arraylist is " +min);
        }
    }
