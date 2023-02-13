package chap04_controllStatement;

import java.io.IOException;

public class _01_if {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 입력받은 영문자의 대소문자 판별
		System.out.print("영문자를 입력하세요. : ");
		int ascillCode =  System.in.read();
		
		if(ascillCode >= 65 && ascillCode <= 90)
			System.out.println("대문자 입니다.");
		
	    if(ascillCode >= 97 && ascillCode <= 122)
	    	System.out.println("소문자 입니다.");
	    
	    //산술 -> 관계 -> 논리
	    if(ascillCode < 65 || (ascillCode > 90 && ascillCode < 97) || ascillCode > 122)
	    	System.out.println("잘 못 입력하셨습니다.");
		
		

	}

}
