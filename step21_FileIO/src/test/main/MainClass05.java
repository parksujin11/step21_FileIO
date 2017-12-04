package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		File file=new File("c:/myFolder/myMemo.txt");
		
		try { 
			//FileReader 객체 생성
			FileReader fr=new FileReader(file);
			//BufferedReader 객체 생성 
			BufferedReader br=new BufferedReader(fr);
		 
			//readline 쓰면 되는데 몇 줄인지 모르니까 반복문 처리
				while(true) {
					String line=br.readLine();//Exception 발생! tyr~
					// 더 이상 읽을 문자열이 없으면 null 이 리턴된다.
					if(line==null) {
						break;//반복문 탈출 
					}
					//읽은 내용 콘솔에 출력해 보기
					System.out.println(line);
				}
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();					
			}catch (IOException ie) {
				ie.printStackTrace();
		}
	}
}