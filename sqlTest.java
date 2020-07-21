import java.sql.*;

public class sqlTest {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/dev";
            conn = DriverManager.getConnection(url, "dev", "dev");

            stmt = conn.createStatement();

            String sql = "SELECT name, owner, date_format(birth, '%Y_y%m_m%d_d' date FROM pet";

            rs = stmt.executeQuery(sql);

            while(rs.next()){
                String name = rs.getString(1);
                String owner = rs.getString(2);
                String date = rs.getString(3);

                System.out.println(name + " " + owner + " " + date);
            }
        }
        catch( ClassNotFoundException e){
            System.out.println("drive loading error");
        }
        catch( SQLException e){
            System.out.println("error " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
                if( stmt != null && !stmt.isClosed()){
                    stmt.close();
                }
                if( rs != null && !rs.isClosed()){
                    rs.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
    }    
}