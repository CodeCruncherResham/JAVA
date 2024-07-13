class Programming
{

    public static void main(String[] args) {
        // Creating objects of the Programming class
        Programming obj1 = new Programming(); // Default message
        Programming obj2 = new Programming("cpp"); // Message with specified language
    }
}

    String n;
        Programming()
    {
        n="I love programming languages";
    }
    Programming(String language)
    {
        n="I Love ";
        n="I Love " + language;
    }
    String getn()
    {
        return n;
    }

    public static void main(String[] args)
    {
        Programming p = new Programming();
                Programming p1 = new Programming("cpp");
                System.out.println(p.getn());
                System.out.println(p1.getn());


    }

}