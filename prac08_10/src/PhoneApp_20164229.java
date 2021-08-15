import java.util.*;
import java.io.*;
class PhoneExplore
{
   private String filename ="c:\\Temp\\phone.txt";
   private HashMap<String,String>phonemap = new HashMap<String,String>();
   private void readPhoneFile()
   { Scanner fScanner = new Scanner(System.in);
      try 
      {
    	  fScanner = new Scanner(new FileReader(new File(filename)));
    	   while(fScanner.hasNext())
    	  {
    		  String name = fScanner.next();
    	  	  String tel = fScanner.next();
    	  	  phonemap.put(name, tel);
    	  }
    	fScanner.close();  
      } 
      catch (IOException e)   
      {
    	  e.printStackTrace();      //에러를 단계별로 출력한다
      }
      System.out.println(phonemap.size()+"개의 전화번호를 읽었습니다");
	
   }
   private void processQuery()
   {
      Scanner scanner = new Scanner(System.in);
      while(true)
      {
    	  System.out.print("이름>>");
    	  String name = scanner.next();
    	  if(name.equals("그만"))
    		  break;
    	  String tel = phonemap.get(name);
    	  if(tel == null)
    	  {
    		  System.out.println("찾는 이름은 없습니다");
    	  }
    	  else
    	  {
    		  System.out.println(tel);
    	  }
      }
      scanner.close();
   }
   void run()
   {
      readPhoneFile();
      processQuery();
   }
}
public class PhoneApp_20164229 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   PhoneExplore phoneExplorer = new PhoneExplore();
	   phoneExplorer.run();

   }

}