package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		String path="c:/myFolder/myMemo.txt";
		File file=new File(path);
		
		File temp=new File("C:/Temp");
	
		//���ڿ� �о���� ����� ����. write
		try {
			FileWriter fw=new FileWriter(file);
			//exception �߻�! ���콺 ���� try~
			fw.write("����\r\n");
			fw.write("����\r\n");
			fw.write("�谡\r\n");
			fw.write("����\r\n");
			fw.flush();
			fw.close();
			System.out.println("myMemo.txt �� ���ڿ� �����!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
