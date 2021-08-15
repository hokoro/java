import java.util.Scanner;
public class len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intarray[] = new int [5];
		int sum =0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println(intarray.length+"개의 정수를 입력하시오");
		for(int i=0;i<intarray.length;i++)
		{
			intarray[i] = scanner.nextInt();
			sum=sum+intarray[i];
		}
		System.out.println(sum);
		System.out.println((double)sum/intarray.length);
		
		
	}

}
