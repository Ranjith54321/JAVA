/*
				Properties file in java :
	-----------------------------------------------------------
				
		-> To get the flexibility of midification we use the properties files
	
		-> frequently changed data is stored this file and we can use it so no need to hard code in java files

		-> eg: interest in various bank servers and user name and pass words for 100 java files etc,..

		-> properties file always ends with .properties eg abc.properties

		-> Properites file data by default String data

		-> it contains (key,value) pairs



		// also we get flexibility of the midification using xml files
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
class pro{
	public static void main(String[] args) throws IOException {
		// load thr data from properties file
		FileInputStream fis = new FileInputStream("xyz.properties");
		Properties prop = new Properties();
		prop.load(fis);

		// read thr data from properties file
		System.out.println("username : "+prop.getProperty("username"));
		System.out.println("password : "+prop.getProperty("password"));
	}
}

/*
		output :

			username : ranjith
			password : hitman
*/