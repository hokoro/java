interface PhoneInterface
{
	final int TimeOut =1000; //상수 필드 선언
	void setcall();			//인터페이스 추상메소드는 abstract,public 생략가능
	void receiveCall();		//추상메소드
	default void printlog()
	{
		System.out.println("phone");		//default 메소드 ->
	}
}
class samsungPhone implements PhoneInterface
{
	 public void setcall()		//지정자가 없으면 추상메소드로 사용됨
	{
		System.out.println("띠리링");
	}
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다");
	}
	
	
}
public class InterFaceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
