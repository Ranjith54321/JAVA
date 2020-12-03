package eclips;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Insertion2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		String db_name = "ranjith";
		String url = "jdbc:mysql://localhost:3306/" +db_name;
		String user_name = "root";
		String pass = "toor";
		String query = "insert into m1 values (?,?)"; // here i'm using m1 table in ranjith database // this is for multiplle insertion
			// no of ? belong's to no of attribute in the table
		
		//String query = "insert into m1 values ('ranjith',46)"; // this is for normal insertion
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user_name,pass);
		
		PreparedStatement st = con.prepareStatement(query); // we are passed query structure here itself 
		//int count = st.executeUpdate(query);  // this is for normal insertion
		
		int id=0;
		String name="";
		int count=0;
		System.out.println("enter the 2 records to added");
		for(int i=0;i<2;i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the name ");
			name = br.readLine();
			System.out.println("enter the id ");
			id = Integer.parseInt(br.readLine());
			
			st.setString(1, name);
			st.setInt(2, id);
		
			
			count+=st.executeUpdate(); // this is for multiple insertion [->execute update return the no of rows affected count at each operation
		}
		System.out.println(count+"rows  affected");
	}

}
