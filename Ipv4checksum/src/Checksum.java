import java.lang.*;
import java.util.*;
public class Checksum {
	private int VER;
	private int HLEN;
	private int Service_type;
	private int data1; //VER + HLEN + Servicetype
	
	private int Total_length;
	private int data2;
	
	private int Identification;
	private int data3;
	
	private int flags;
	private int fragment_offset;
	private int data4;
	
	private int TTL;
	private int protocol;
	private int data5;
	
	private int wrappedsum;   //총합
	private int headerchecksum;  //검사합
	
	private String source_Ip_add;
	private int data6;
	private int data7;
	private String Destination_IP_add;
	private int data8;
	private int data9;
	
	public void showDesign()
	{
		for(int i=0;i<40;i++)
		{
			 System.out.print("* ");
		}
		System.out.println("");
		System.out.println("*          Program to find the checksum for an IPv4 header                    *");                    
		for(int i=0;i<40;i++)
		{
			 System.out.print("* ");
		}
		System.out.println("");
		
	}
	public void showData()
	{
		System.out.println("VER:"+VER);
		System.out.println("HLEN:"+HLEN);
		System.out.println("Service_type:" + Service_type);
		System.out.println("Total_length:"+Total_length);
		System.out.println("Identification:"+Identification);
		System.out.println("flags:"+flags);
		System.out.println("fragment_offset"+fragment_offset);
		System.out.println("TTL:"+TTL);
		System.out.println("protocol:"+protocol);
		System.out.println("source_Ip_add:"+source_Ip_add);
		System.out.println("Destination_IP_add:"+Destination_IP_add);
	}


	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checksum test = new Checksum() ;
		test.showDesign();
		Scanner scanner = new Scanner(System.in);
		//바이트 자료형 (Ver+HLEN+service_type)
		System.out.print("VER:");
		test.VER = scanner.nextInt();
		System.out.print("HLEN:");
		test.HLEN = scanner.nextInt();
		System.out.print("Service_type:");
		test.Service_type = scanner.nextInt();
		int VER1 = (test.VER<<12);
		int HLEN1 = (test.HLEN<<8);
		int Service_type1 = (test.Service_type<<4);
		test.data1 = (VER1+HLEN1+Service_type1);
	
		//Total length 
		System.out.print("Total_length:");
		test.Total_length = scanner.nextInt();
		test.data2 = test.Total_length;
		
		
		//identification
		System.out.print("Identification:");
		test.Identification = scanner.nextInt();
		test.data3 = test.Identification;
	
		
		//flags+fragmentoffset
		System.out.print("flags:");
		test.flags = scanner.nextInt();
		System.out.print("fragment_offset:");
		test.fragment_offset = scanner.nextInt();
		int flag1 =  (test.flags<<13);
		int fragment =(test.fragment_offset);
		test.data4 =  (flag1 + fragment);
	
		
		
		//TTL + protocol
		System.out.print("TTL:");
		test.TTL  = scanner.nextInt();
		System.out.print("Protocol:");
		test.protocol = scanner.nextInt();
		int TTL1 = (test.TTL<<8);
		int protocol1 = (test.protocol);
		test.data5 = (TTL1+protocol1);
		
		
		//source_ip_add
		System.out.print("Source_IP:");
		test.source_Ip_add = scanner.next();
		String[] arr =  test.source_Ip_add.split("\\.");
		
		
		int soip1 = Integer.parseInt(arr[0]);
		soip1 = (soip1<<8);
		int soip2 = Integer.parseInt(arr[1]);
		test.data6 = (soip1+soip2);
		int soip3 = Integer.parseInt(arr[2]);
		soip3 = (soip3<<8);
		int soip4 = Integer.parseInt(arr[3]);
		test.data7 = (soip3+soip4);

   
		//Destination_ip_add
		System.out.print("Destination_IP:");
		test.Destination_IP_add= scanner.next();
		String b = test.Destination_IP_add;
		String[] arr2 = b.split("\\.");
	
		 int Doip1 = Integer.parseInt(arr2[0]);
			Doip1 = (Doip1<<8);
			int Doip2 = Integer.parseInt(arr2[1]);
			test.data8 = (Doip1+Doip2);
			int Doip3 = Integer.parseInt(arr2[2]);
			Doip3 =(Doip3<<8);
			int Doip4 = Integer.parseInt(arr2[3]);
			test.data9 =(Doip3+Doip4);

		test.wrappedsum = (test.data1+test.data2+test.data3+test.data4+test.data5+test.data6+test.data7+test.data8+test.data9+1);
		test.wrappedsum = ~test.wrappedsum;
		String a16 = Integer.toHexString(test.wrappedsum);
		test.showData();
		System.out.println("Checksum:"+a16.substring(4,8));
		
}
}