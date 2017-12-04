package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//�ϰ� import-> ctrl shift o

public class MainClass07 {
	public static void main(String[] args) {
		//�ʿ��� ��ü�� ���� ���� �����
				FileInputStream fis=null;
				FileOutputStream fos=null;
			
				try {
					//�ʿ��� ��ü�� �����ؼ� ������ ������ �����ϱ� 
					fis=new FileInputStream("c:/myFolder/myImage.jpg");
					fos=new FileOutputStream("c:/myFolder/copiedImage.jpg");
					
					//�ѹ��� �о�� byte �� ũ�⸦ ����ؼ� byte[] ��ü �����ϱ�
					byte[] buffer=new byte[1000];
					while(true){
						//buffer ��ü�� �̿��ؼ� byte �˰��̸� �о���δ�. 
						int readedCount=fis.read(buffer);
						//���̻� ���� byte �˰��̰� ���ٸ� �ݺ��� Ż�� 
						if(readedCount == -1)break;
						//buffer ��ü�� ����� byte �˰��̸� ���� ��ŭ ��� ���Ͽ� ����Ѵ�.
						fos.write(buffer, 0, readedCount);
						fos.flush();//����
			
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					//������ �ݵ��� ����Ǵ� ������ ������ �۾��� �Ұ� ������ �Ѵ�. 
					try {
						fos.close();
						fis.close();//�ݾ��ֱ� 
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

	}
}
