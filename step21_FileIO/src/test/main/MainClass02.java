package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		String path="c:/myFolder/myMemo.txt";
		
		//��� ������ �������ִ� ���ڿ��� �������� ���ڷ� �����ϸ鼭 file ��ü �����ϱ� 
		File file=new File(path);
		
		if(file.exists()) {//�����ϸ�
			//���丮 ���� �������� �Ǻ�
			if(file.isDirectory()) {
				System.out.println(path+" �� ���丮 �Դϴ�.");	
			}else {
				System.out.println(path+"�� ���� �Դϴ�.");
			}
		}else {//�������� ������
			System.out.println(path+"�� ���� ���� �ʾƿ�");
			//file .createNewFile�ϸ� Exception �߻�! ���콺����->add~
			file.createNewFile();
			System.out.println(path+" ������ ������");
		}
	}
}
