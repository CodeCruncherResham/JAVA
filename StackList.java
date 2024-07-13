import java.util.*;
class StackList
{
    public static void main(String[] args)
    {
        Stack<Integer> l = new Stack<Integer>();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        l.push(60);
        Integer min = l.peek();
          System.out.println(l.peek());
          l.pop();
        int i=0;
        while(i<6){
            if(l.peek()<min)
            min=l.peek();
            i++;
        }
        l.push(min);
        l.pop();    }
}