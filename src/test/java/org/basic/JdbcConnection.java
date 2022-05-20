package org.basic;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JdbcConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"hr", "98942446");
		String query = "Select * from Employees";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
		ResultSet executeQuery = prepareStatement.executeQuery();
		
		System.out.printf("%-15s%-10s%-10s","FIRSTNAME","LASTNAME","Salary");
		
		File f = new File("G:\\datadriven\\sqltask.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet createSheet = book.createSheet("bala");
		ArrayList<String> l = new ArrayList<String>();
		l.add("String");
		int row = 0;
		int cell = 0;
		Iterator<String> i = l.iterator();
		
		
		while (executeQuery.next()) {
			 String string = executeQuery.getString("first_name");
			 
			 String string2 = executeQuery.getString("last_name");
			 
			 String string3 = executeQuery.getString("salary");
			 String next = i.next();
			 
			 
			System.out.printf("%-15s%-10s%-10s\n",string,string2,string3);
//			Sheet createSheet = book.createSheet("bala");
//			ArrayList<String> l = new ArrayList<String>();
			
			
//			Row createRow = createSheet.createRow(0);
//			Cell createCell = createRow.createCell(0);
//			createCell.setCellValue(string);
//			FileOutputStream fo = new FileOutputStream(f);
//			book.write(fo);
		}
		connection.close();
	}
	

}
