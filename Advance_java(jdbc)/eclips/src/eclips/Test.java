package eclips;
import java.sql.*;
public class Test {
	public static void main(String[] args) throws Exception {
		String db_name = "ranjith";
		String url = "jdbc:mysql://localhost:3306/"+db_name;
		String uname = "root";
		String pass = "toor";
		String query = "select * from stu where class='a'";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		//while(rs.next()) {
		rs.next();
			System.out.println("Id : "+rs.getInt("id")+"  "+"Name :"+rs.getString("name"));
		//}
		st.close();
		con.close();
	}
}
