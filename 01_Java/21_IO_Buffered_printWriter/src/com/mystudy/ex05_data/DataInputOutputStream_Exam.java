package com.mystudy.ex05_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataInputOutputStream_Exam {

	public static void main(String[] args) {
		// DataInputStream, DataOutputStream 
		// 기본 데이터 타입 데이터 형식 쓰고, 읽기
		File file = new File("file/data_io_stream.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			// 파일에 쓰고, 저장된 데이터 불러오기
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//기본 데이터 타입 값을 파일에 출력(쓰기)
			dos.writeInt(12000);
			dos.writeBoolean(true);
			dos.writeByte(127);
			dos.writeDouble(Math.PI);
			dos.writeUTF("abc 대한민국");
			dos.writeUTF("Hello Java!!!");
			
			//===============================
			//저장된 데이터 읽어오기
			dis = new DataInputStream(new FileInputStream(file));
			
			//(주의) 값을 읽어 올 때는 저장한 순서대로 읽어와야 한다
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}














