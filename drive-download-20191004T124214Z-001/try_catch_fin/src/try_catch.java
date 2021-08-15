import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		int n = 0,m = 0;
		
		while((n-(int)n==0)&&(m-(int)m==0)){
			System.out.print("곱하고자 하는 두수를 입력하시오>>");
		
		
		try
		{
			 n = scanner.nextInt();
			 m = scanner.nextInt();
			 break;
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("data type miss!");
			scanner.nextLine();
			
			
			
		}
		/*finally
		{
			System.out.println(n*m);
		}*/
		
	}

		System.out.println(n*m);
	}
}
