package test.main;

import java.io.File;

public class MainClass01 {
	public static void main(String[] args) {
		String path="c:/myFolder";
		
		//��� ������ �������ִ� ���ڿ��� �������� ���ڷ� �����ϸ鼭 file ��ü �����ϱ� 
		File file=new File(path);
		
		//exists -> ���� �Ǵ� ���丮 �������� Ȯ�� �޼ҵ� 
		if(file.exists()) {//�����ϸ�
			//isDirectory ->���丮 ���� �Ǻ�
			//isFile -> �������� �Ǻ� 
			if(file.isDirectory()) {
				System.out.println(path+" �� ���丮 �Դϴ�.");	
			}else {
				System.out.println(path+"�� ���� �Դϴ�.");
			}
		}else {//�������� ������
			System.out.println(path+"�� ���� ���� �ʾƿ�");
			//���丮 ����� .mkdir();
			//mkdirs() ->��λ� ���� ��� ���丮 ����
			//createNewFile()->���ο� ���� ����
			//delete()-> ���� �Ǵ� ���丮 ����
			file.mkdir();
			System.out.println(path+" ���丮�� ������");
		}
	}
}
