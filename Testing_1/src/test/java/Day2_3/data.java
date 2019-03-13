package Day2_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Day2.LogIn;

public class data {
	
  
  public void f() throws IOException {
		
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.12\\Desktop\\Selium 3.0\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  
		driver.get("http://demoaut.com/");
		//LogIn login1 = new LogIn(driver);
		//login1.typefirstname("mercury");
		//login1.typeSecondName("mercury");
		//login1.clickContinueButton();
	  File src = new File ("C:\\Users\\training_c2d.02.12\\Desktop\\Selium 3.0\\datasheet.xlsx");
	  
	  
	  FileInputStream fis = new FileInputStream (src);
	  
	  XSSFWorkbook wb = new XSSFWorkbook (fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  //for(int i = 0 ; i<3; i++)
	  {
		  String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		  System.out.println("Data from excel sheet is " + data0);
		  
		  String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		  System.out.println(data1);
	  }
	  
  }
}
