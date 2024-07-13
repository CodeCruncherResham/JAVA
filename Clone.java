//clone an Arraylist to another array list
import java.util.ArrayList;
class Clone{
    public static void main(String[] args)
    {
        ArrayList<String>clone1=new ArrayList<String>();
        clone1.add("red");
        clone1.add("pink");
        clone1.add("blue");
        System.out.println("Original Arraylist : "+clone1);
                ArrayList<String>clone2=new ArrayList<String>();clone1.clone();
                        System.out.println("Original Arraylist : "+clone2);



    }
}