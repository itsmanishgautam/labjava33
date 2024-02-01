package lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class lab3q1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Javalab";
            String username = "root";
            String password = "password";
            Connection con = DriverManager.getConnection(url,username,password);

            insertRecord(con,"first_item",15.46,26,"2010-11-26");
            insertRecord(con,"second_item",20.73,35,"2010-08-16");
            insertRecord(con,"third_item",25.37,15,"2010-02-05");

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void insertRecord(Connection con, String name,double unitPrice,int units, String expiryDate) throws SQLException
    {
        try{
            String sql = "insert into item(name,unitPrice,units,expiryDate) values (?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,name);
            pstm.setDouble(2,unitPrice);
            pstm.setInt(3,units);
            pstm.setString(4,expiryDate);

            int flag = pstm.executeUpdate();
            if(flag>0)
            {
                System.out.println("Date inserted Successfully !");

            }
            else{
                System.out.println("Date insertion failed !");
            }

        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
