package chap03_operator;

import java.io.IOException;

public class _04_homework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("영문자를 입력하세요. : ");
		int ascillCode =  System.in.read();
		
	    //1. 영문자 대문자, 소문자 판단하기
		System.out.println(ascillCode >= 65 && ascillCode <= 90 ? "대문자입니다." : ascillCode >= 97 && ascillCode <= 122 ? "소문자입니다." : "잘 못 입력하셨습니다.");
		
		//2. 영문자 대문자는 소문자로, 소문자는 대문자로
		//System.out.println(asciiCode >= (asciiCode + 32) && 97 ?  asciiCode <= (asciiCode - 32) && 90 : );
		System.out.println(ascillCode >= 65 && ascillCode <= 90 ? (char)(ascillCode + 32) : ascillCode >= 97 && ascillCode <= 122 ? (char)(ascillCode - 32) : "잘못 입력하셨습니다.");

	}

}
