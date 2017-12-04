package test.main;

import java.io.File;
import java.net.URI;

public class MainClass03 {
	public static void main(String[] args) {
		String path="c:/";
		File file=new File(path);
		
		//list()->디렉토리에 포함된 파일 및 서브디렉토리 목록 전부를 String배열로 리턴
		//listFiles() -> 디렉토리에 포함된 파이 및 서브디렉토리 목록 중에 FilenameFiter에 맞는 것만 String 배열로 리턴
		//list() 메소드를 이용해서 디렉토리와 파일목록을 String[] 으로 얻어온다. 
		String[] afile=file.list();
		for(String tmp:afile) {
			System.out.println(tmp);
		}
		System.out.println("------");
		
		//디렉토리 혹은 파일을 access 할 수 있는 File 객체가 담겨있는 File[] 객체 얻어오기 
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
