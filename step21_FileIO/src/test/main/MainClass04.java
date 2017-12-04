package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		String path="c:/myFolder/myMemo.txt";
		File file=new File(path);
		
		File temp=new File("C:/Temp");
	
		//문자열 읽어오는 기능이 없다. write
		try {
			FileWriter fw=new FileWriter(file);
			//exception 발생! 마우스 오버 try~
			fw.write("나는\r\n");
			fw.write("지금\r\n");
			fw.write("배가\r\n");
			fw.write("고팡\r\n");
			fw.flush();
			fw.close();
			System.out.println("myMemo.txt 에 문자열 출력함!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
