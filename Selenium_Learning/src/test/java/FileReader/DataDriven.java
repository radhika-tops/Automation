package FileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.TargetDataLine;

import org.apache.poi.extractor.MainExtractorFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	//Identify Testcases coloum by scanning the	entire 1st row
	//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
	//after you grab purchase testcase row = pull all the data of that row and	feed into test


	public static void getData() throws IOException {
		//fileInputStream argument
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\baps\\Desktop\\practice- Copy.xlsx");
		System.out.println(fis);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		System.out.println(workbook);
		int sheets = workbook.getNumberOfSheets();
		System.out.println("no of sheets : "+sheets);
		
		
		
		for(int i = 0; i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("home")) {
				//to read single sheet
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				//identify testcases coloumn by scanning the entire 1st row
				
			}
		}
	}
		public static void main(String[] args) throws IOException  {
			getData();
		}	
		
}
