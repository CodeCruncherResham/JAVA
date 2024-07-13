import java.util.*;
class Cmn_ele{
    public static void main(String [] args){
            ArrayList<String>list1=new ArrayList<String>();
    list1.add("hii");
    list1.add("Hello");
    list1.add("goodmorning");
    list1.add("geeks");
    list1.add("for");

System.out.println("list1 : "+list1);
    ArrayList<String>list2=new ArrayList<String>();
    list2.add("hi");
        list2.add("He");
    list2.add("goodmorning");
    list2.add("geeks");
    list2.add("of");
System.out.println("list2 : "+list2);
//find the comman elemnts
list1.retainAll(list2);
System.out.println("comman elements : "+list1);
    }
}
//code for find comman word
