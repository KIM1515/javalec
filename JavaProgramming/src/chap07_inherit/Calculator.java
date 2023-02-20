package chap07_inherit;

public interface Calculator {
	//추상메소드는 클래스에도 선언 할 수 있다.
	//클래스에 선언 할 때는 abstract 키워드를 사용해야 하지만
	//인터페이스에서는 키워드 사용안해도 된다.
	//추상메소드는 상속받은 자식클래스에서 구현하여 사용한다.
	public void calc(int a, int b);
	

}
