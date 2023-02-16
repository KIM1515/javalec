package chap05_class_example;

public class Course {
	//상수는 무조건 미리 값을 할당해 놓고 사용
	private final String Major = "cs";
	private int cNo; //강의 번호
	private String cName; //강의제목
	private int cScore; //학점
	
	
	//기본 생성자
	public Course() {
		//속성 값 초기화
		cNo = 1;
		cName = "자바";
		cScore = 3;
	}
	
	//매개변수인 cNo과 cNo은 다른 변수이다.
	//매개변수 cNo은 생성자 함수를 호출 했을 때 보내주는 값을 받기 위한 변수
	public Course(int cNo) {
		//this객체 : 현재 속해 있는 클래스를 지칭
		//매개변수로 받아온 cNo과 멤버 변수를 확실하게 구분하기 위해서 this사용
		this.cNo = cNo;
	}
	
	//매개 변수가 두 개인 생성자
	public Course(int cNo, String cName) {
		this.cNo = cNo;
		this.cName = cName;
	}
	
	public Course(int cNo, String cName, int cScore) {
		//Course의 생성자 호출
		//매개변수가 두 개인 생성자에서 cNo, cName 속성을 초기화 해주기 때문에
		//현재 생성자에서는 따로 cNo, cName 에 대한 초기화 작업 필요 없어진다.
		this(cNo, cName); //Course 생성자 호출
		
		this.cScore = cScore;
	}
	
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	
	public String getMajor() {
		return Major;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcScore() {
		return cScore;
	}
	public void setcScore(int cScore) {
		this.cScore = cScore;
	}

}
