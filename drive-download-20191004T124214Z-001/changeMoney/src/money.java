import java.util.Scanner;
public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int unit[] = {50000,10000,5000,1000,500,100,50,10,1};			//자동 초기화
		int changed[] = new int [9];
		int Money = scanner.nextInt();
		
		for(int i=0;i<9;i++)
		{
			changed[i] = Money/unit[i];
			Money = Money%unit[i];
		}
		
		for(int j=0;j<changed.length;j++)
		{
			System.out.println(unit[j]+" 짜리  :"+changed[j]+"개");
			
		}
		//System.out.println();
		scanner.close();
		
	
		
		
	}

}
