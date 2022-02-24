package com.mystudy.reader_writer_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		
		File filere = new File("file/test_char.txt");
		FileReader red = null;
		
		File filewr = new File("file/test_char_out.txt");
		FileWriter writ = null;
		
		
		try {
			red = new FileReader(filere);
			writ = new FileWriter(filewr);
			
			int k;
			
			while (true) {
				k = red.read();
				if (k == -1) break;
				writ.write(k);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (red != null)
				try {
					red.close();
				} catch (IOException e) {}
			if (writ != null)
				try {
					writ.close();
				} catch (IOException e) {}
		}
		
		
		
		
		
		
		
		

	}

}
