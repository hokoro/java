
class StaticSample
{
	public int n;
	public void g()
	{
		m=20;
	}
	public void h()
	{
		m=30;
	}
	
	public static int m;		//프로그램이 실행되자마자 메모리의 정적 할당공간이 만들어짐
	public static void m()
	{
		m=5;
	}
}
 
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSample s1,s2;
		s1 = new StaticSample();
		s2 = new StaticSample();
		
		s1.n =10;
		s1.g();			
		System.out.println(StaticSample.m);
		s1.m = 50;		
		System.out.println(StaticSample.m);
		
		s2.m = 30;      
		System.out.println(StaticSample.m);
		s1.m();
		System.out.println(StaticSample.m);
		//객체에서 주소가 static 을 가리키면 정적으로 값이 바꾼다
	}

}
