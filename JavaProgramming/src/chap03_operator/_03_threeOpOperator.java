package chap03_operator;

import java.io.IOException;

//클래스 라이브러리에 있는 클래스들의 기능을 사용하기 위한 클래스 호출
public class _03_threeOpOperator {
                                          //예외 처리 방식1 - throws
	                                      //예외 처리방식2 - try/catch
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 삼항 조건 연산자
		int result1 = 10 > 30 ? 100 : -100;
		System.out.println(result1);
		System.out.println("----------------------");
		
		//2. 삼항 조건 연산자의 중첩
		int result2 = 10 > 30 ? 70 > 50 ? 200 : -200 : 300;
		System.out.println(result2);
		
		int result3 = (10 > 30) ? (70 > 50 ? 200 : -200) : (90 != 80 ? 300 : -300);
		System.out.println(result3);
		
		//3. 사용자 입력값 받기
		try { //안에 내용을 실행
			System.out.print("정수나 문자를 입력하세요. : ");
			int num = System.in.read();
			System.out.println(num);
			System.out.println((char)num);
		} catch(Exception e) {
			//try 구문의 코드를 실행하다가 예외가 발생하면 catch 구문의 코드를 실행
		}
		
				
		}

	}


