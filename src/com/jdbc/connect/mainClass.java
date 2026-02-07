package com.jdbc.connect;

public class mainClass extends JdbcDataBase{
	
	static String sql ;

	 public static String querry() {
			return sql="INSERT INTO Student(SID,SCITY,SNAME) VALUES(?,?,?)";
		   }
	 
	 public static void results() {
		 if(JdbcDataBase.noOfRowsEffected ==0) {
			 System.out.println("The Db is not updated");
			 
		 }else{
			 System.out.println("Rows Updated in DataBAse Table are : "+" "+noOfRowsEffected);
		 }
	 }

}
