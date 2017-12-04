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
			//FileReader ��ü ����
			fr=new FileReader(file);
			//BufferedReader ��ü ���� 
			br=new BufferedReader(fr);
			
			//readline ���� �Ǵµ� �� ������ �𸣴ϱ� �ݺ��� ó��
			while(true) {
				String line=br.readLine();//Exception �߻�! tyr~
				// �� �̻� ���� ���ڿ��� ������ null �� ���ϵȴ�.
				if(line==null) {
					break;//�ݺ��� Ż�� 
				}
				//���� ���� �ֿܼ� ����� ����
				System.out.println(line);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				//null �� �ƴ� ��쿡 �޼ҵ带 ȣ���ϴ� ���� 
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