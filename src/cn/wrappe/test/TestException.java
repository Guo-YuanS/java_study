package cn.wrappe.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestException {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			 reader = new FileReader("C:/Users/guoy10/Desktop/my work");
			char c= (char)reader.read();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(reader!=null) {
				reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
