abstract class Calculator
{
	public abstract int add (int a,int b);
	public abstract int substract(int a,int b);
	public abstract  double average(int a[]);
}
public class GoodCalc extends Calculator {

	public int add(int a,int b)			//함수를 정의하지 않았으므로 추상abstract 제거
	{
		return a+b;
	}
	public int substract(int a,int b)
	{
		return a-b;
	}
	public double average(int a[])
	{
		double sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		GoodCalc a= new GoodCalc();
		
		System.out.println(a.add(2, 3));
		System.out.println(a.substract(2, 3));
		System.out.println(new int[] {2,3,4});		//동적할당 및초기화
		//메소드 안에서 동적할당 할시 new int [] {2,3,4}; = 필요없음 
	}

}
