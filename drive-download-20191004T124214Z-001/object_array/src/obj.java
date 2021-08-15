
class circle
{
	int radius;
	public circle (int radius)
	{
		this.radius =radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}
public class obj {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		circle []a = new circle[5];				//객체 배열 선언 =배열선언  1.클래스 이름 [] 변수이름  2.클래스이름 변수이름[] 
		circle b[] = new circle[10];
		
		for(int i=0;i<5;i++)
		{
			a[i]=new circle(i);
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println((int)a[i].getArea());
		}
	}

}
