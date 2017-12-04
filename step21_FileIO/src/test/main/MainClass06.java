package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		File file=new File("c:/myFolder/myMemo.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try { 
			//FileReader 객체 생성
			fr=new FileReader(file);
			//BufferedReader 객체 생성 
			br=new BufferedReader(fr);
			
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
		}finally {
			try {
				//null 이 아닌 경우에 메소드를 호출하는 구조 
				if(br!=null)br.close();
				if(fr!=null)fr.close();
				br.close();
				fr.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}
}	