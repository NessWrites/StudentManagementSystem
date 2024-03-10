package utils;

public class StringUtils {
	
	//Start: DB Connection
	public static final String DRIVER_NAME= "com.mysql.jdbc.Driver";
	public static final String LOCALHOST_URL = "jdbc:mysql://localhost:3306/student_management";
	public static final String LOCALHOST_USERNAME = "root";
	public static final String LOCALHOST_PASSWORD = "";
	//End : DB Connection
	
	
	//Start: Queries
	public static final String REGISTER_STUDENT_QUERY = "INSERT INTO student_info (firstname,lastname, birthday,gender,email,phonenumber,subject)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
	
	public static final String GET_ALL_STUDENT_INFO = "SELECT * FROM student_info WHERE username = ? AND password = ?";
	// End: Queries
	
	
	//Start: Validation Message
	
	//End: Validation Message
	
}
