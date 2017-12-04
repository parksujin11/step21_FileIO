package test.main;

import java.io.File;
import java.net.URI;

public class MainClass03 {
	public static void main(String[] args) {
		String path="c:/";
		File file=new File(path);
		
		//list()->���丮�� ���Ե� ���� �� ������丮 ��� ���θ� String�迭�� ����
		//listFiles() -> ���丮�� ���Ե� ���� �� ������丮 ��� �߿� FilenameFiter�� �´� �͸� String �迭�� ����
		//list() �޼ҵ带 �̿��ؼ� ���丮�� ���ϸ���� String[] ���� ���´�. 
		String[] afile=file.list();
		for(String tmp:afile) {
			System.out.println(tmp);
		}
		System.out.println("------");
		
		//���丮 Ȥ�� ������ access �� �� �ִ� File ��ü�� ����ִ� File[] ��ü ������ 
		File[] bfile=file.listFiles();
		for(File tmp:bfile) {
			String name=tmp.getName();
			if(tmp.isDirectory()) {
				System.out.println("[D]"+name);
			}else {
				System.out.println(name);
			}
		}
		
	}
}
