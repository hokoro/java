import java.util.Scanner;
public class StringRotate_20164229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("문자열을 입력하시오");
		String text = scanner.nextLine();
		int len  = text.length();
		
		for(int i=0;i<text.length();i++)
		{
			char first = text.charAt(0);
			String last = text.substring(1);
			text=last+first;
			System.out.println(text);
			
		}

		scanner.close();
	}

}
