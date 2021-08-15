import java.io.*;
import java.util.*;

public class PhoneExplorer {
	private static String fileName = "c:\\temp\\phone.txt";
	private HashMap<String, String> phoneMap = new HashMap<String, String>();
	
	
	public static void main(String[] args) {
BufferedReader bReader = null;
        
        try {
            
            String s;
            File file = new File(fileName);
            bReader = new BufferedReader(new FileReader(file));
            
            // 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
            while((s = bReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bReader != null) bReader.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }


	}

}