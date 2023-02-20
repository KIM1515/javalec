package chap99_etc;

import java.util.Scanner;

public class _03_rockScissPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가위바위보 게임 객체를 생성하여 게임을 진행할 수 있도록 리팩토링
		//게임 스타트 메소드
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위, 바위, 보 게임입니다.");
			System.out.println("진행하시려면 1, 종료하시려면 2를 입력하세요.");
			int selector = sc.nextInt();
			
			if(selector == 1) {
				RockScissPaper rcp = new RockScissPaper();
				
				rsp.start();
			} else if(selector == 2) {
				break;
			}
		}
		
		
		/*int win = 0;
		int draw = 0;
		int lose = 0;
		
		int score = 0;
		
		int[] wdl = new int[10];
		
		for(int i = 0; i < wdl.length; i++) {
			int randomVal = (int)(Math.random() * 3) + 1;
		}
		
		System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
		String userNumStr = sc.nextLine();
		
		
		int userNum;
		
		if(userNumStr.equals('가위')) {
			userNum = '1';
		} else if(userNumStr.equals('바위')) {
			userNum = '2';
		} else if(userNumStr.equals('보')) {
			userNum = '3';
		} else {
			System.out.println("잘못 입력하셨습니다.");
			//해당 게임을 다시 진행하기 위해 1 감소
			//for문에서 continue문을 만나면 증감식으로 이동하기 때문
			i--;
			continue;
		}
		//무승부
		//가위 바위 보 비교
		if(userNum == randomVal) {
			System.out.println("비겼습니다");
			draw++;
		} else {
			//승리와 패배 조건 나누기
			//승리
			if((userNum == 1 && randomVal == 3) || (userNum == 2 && randomVal == 1)
					|| (userNum == 3 && randomVal == 2))
		}*/
		
		
		
		
		
		
		
		
		
		
	}

}
