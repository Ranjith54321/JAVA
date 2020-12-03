package eclips;
import java.sql.*;
import java.io.*;
public class Insertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String db_name = "ranjith";
		String url = "jdbc:mysql://localhost:3306/" +db_name;
		String user_name = "root";
		String pass = "toor";
		//String query = "insert into stu values ("+5+",baba,"+"c,"+"amil"+")";
		//String query = "insert into stu values(5,'bajji','c','amil')";
		
		Connection con = DriverManager.getConnection(url,user_name,pass);
		
		Statement st = con.createStatement();
		//int count = st.executeUpdate(query);
		
		//System.out.println(count+"rows  affected");
		
		int id=0;
		String name="";
		char ch=' ';
		String mail = "";
		int count=0;
		System.out.println("enter the 2 records to added");
		for(int i=0;i<2;i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the id ");
			id = Integer.parseInt(br.readLine());
			System.out.println("enter the name ");
			name = br.readLine();
			System.out.println("enter the class ");
			String chclass = br.readLine();
			ch = chclass.charAt(0);
			System.out.println("enter the mail ");
			mail = br.readLine();
			String qry = "inert into values ("+id+","+name+","+chclass+","+mail+")"; // using PreparedStatemet we can make even simpler
			count+=st.executeUpdate(qry);											// so to over come this see Insertion2
		}
		System.out.println(count+"rows  affected");
		st.close();
		con.close();
	}
}
// instead of doing this we can also use PreparedStatement instead of using Statement see Insertion2
