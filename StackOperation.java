import java.util.*;
class StackOperation
{
    public static void main(String[] args)
    {
          ArrayList<String> list = new ArrayList<String>();
        Stack<Integer> l = new Stack<Integer>();
        list.add("+");
        list.add("*");
        list.add("+");
        list.add("+");

        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);

        for(String v : list)
        {
            int a = l.peek();
            l.pop();
            int b = l.peek();
            l.pop();
        
        if(v.equals("+")){
            l.push(a+b);
        }
        else if(v.equals("-")){
            l.push(a-b);
        }
        else{
            l.push(a*b);
        }
        }
         System.out.println(l.peek());

    }
}