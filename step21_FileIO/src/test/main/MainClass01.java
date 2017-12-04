package test.main;

import java.io.File;

public class MainClass01 {
	public static void main(String[] args) {
		String path="c:/myFolder";
		
		//경로 정보를 가지고있는 문자열을 생성자의 인자로 전달하면서 file 객체 생성하기 
		File file=new File(path);
		
		//exists -> 파일 또는 디렉토리 존재유무 확인 메소드 
		if(file.exists()) {//존재하면
			//isDirectory ->디렉토리 인지 판별
			//isFile -> 파일인지 판별 
			if(file.isDirectory()) {
				System.out.println(path+" 는 디렉토리 입니다.");	
			}else {
				System.out.println(path+"는 파일 입니다.");
			}
		}else {//존재하지 않으면
			System.out.println(path+"는 존재 하지 않아요");
			//디렉토리 만들기 .mkdir();
			//mkdirs() ->경로상에 없는 모든 디렉토리 생성
			//createNewFile()->새로운 파일 생성
			//delete()-> 파일 또는 디렉토리 삭제
			file.mkdir();
			System.out.println(path+" 디렉토리를 생성함");
		}
	}
}
