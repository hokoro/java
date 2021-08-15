/*
 * this 사용시 주의 
 * 1. 생성자 코드에서만 사용가능
 * 2. 무조건 같은 클래스 내에서 다른생성자를 호출해야함
 * 3. 생성자의 첫번쨰 문장이어야한다.
 * */
public class this2 {

	String title;
	String author;
	
	void show() {System.out.println(title+" "+author);}
	
	public this2() {
		this("");				//주의 this의 생성은 무조건 맨 첫번째 줄
		System.out.println("생성자 호출");
	}
	public this2(String title)
	{
		this(title,"작자미상");		//this2(title,author) -> 함수를 호출  this의 역할 2 생성자 함수의 호출을 함
		
	}
	public this2(String title,String author)
	{
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this2 a = new this2();
		this2 b = new this2("춘향전");				//생성자 함수 호출 -> 다른생성자 호출
		this2 c = new this2("어린왕자","생택쥐베리");
		
		a.show();
		b.show();
		c.show();

	}

}
