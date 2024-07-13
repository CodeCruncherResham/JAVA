import java.sql.*;
class Database{
    public static void main(String[] args){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotelmanagement","root","password");
        String q="insert into profile value(101,'riya',50)";
        Statement stmt=con.createStatement();
        int rs=stmt.executeUpdate(q);
        System.out.println("save");
        con.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}