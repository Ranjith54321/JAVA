package eclips;
import java.sql.*; 															 // step 1
public class Main {

	public static void main(String[] args) throws Exception{
		String db_name = "ranjith";
		String url = "jdbc:mysql://localhost:3306/" +db_name;
		String user_name = "root";
		String pass = "toor";
		String query = "select * from stu";
		
		Class.forName("com.mysql.jdbc.Driver"); 							// step 2
		
		Connection con = DriverManager.getConnection(url,user_name,pass); // Connection is Interface		 // step 3
		
		Statement st = con.createStatement(); // Statement is Interface  	// step 4
		
		ResultSet rs = st.executeQuery(query); // ResultSet is Interface 	// step 5
		
		// ResultSet is used for accessing the data purpose
		
		//rs.next();  see below 
		while(rs.next()) {                                                	// step 6
			System.out.println("Id : "+rs.getInt("id")+"  "+"Name :"+rs.getString("name"));
		}
		st.close();con.close(); 											// step 7
	}// main
}
	// in getInt(),getString() for get the integer value and to get the string value 
	// to the arguments for the getInt() and getString() may be a column number or Attribute name i.e, column name
/* rs.next() 
 * 
 * it initially points  to
 *    
 *    --> here
 *			1
 *			2
 *			3
 *     so that only when we not using while loop make sure that next() is pointing to data
 *        
 * 
 * 		see the steps in readme.md file on this location
 * 
 * 		here see the Reference Libraries there mysql driver is added manually then only we can access mysql_db
 */

