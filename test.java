package Leb2;

import java.io.IOException;
import java.nio.charset.Charset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import com.csvreader.CsvReader;

public class test {
	   
public static void main(String[] args) throws IOException {
                            
       CsvReader r = new CsvReader("/Users/hujunying/Desktop/input.csv", ',' , Charset.forName("utf8"));//读取csv文件
       r.readHeaders();  //读头部
  while (r.readRecord()) {   
    	   String number_csv = r.get(0);    //得到csv中第一列的数据
    	   String address_csv = r.get(1);	//得到csv中第二列的数据
    	   String pwd_csv = number_csv.substring(4); //获取密码
    	   //读取CSV文件中数据
    	   System.out.println(number_csv); //打印出学号
    	  
    	   WebDriver driver = new FirefoxDriver();
    	   driver.get("https://psych.liebes.top/st");               
    	   //通过火狐浏览器打开网址
      
    	   WebElement input_number = driver.findElement(By.id("username"));
    	   WebElement input_pwd = driver.findElement(By.id("password"));
    	   WebElement btn = driver.findElement(By.id("submitButton"));
    	   input_number.clear();
    	   input_pwd.clear();
    	   input_number.sendKeys(number_csv);
    	   input_pwd.sendKeys(pwd_csv);  	   
    	   btn.click();
    	   //输入CSV中读出的数据
    	   
    	   WebElement text = driver.findElement(By.tagName("p"));
           String address = text.getText();
    	   if(address_csv.equals(address))
               System.out.println("正确");
    	   else
               System.out.println("不正确");
    	   driver.close();
    	   //比较结果，得出结论
        }
        r.close();         
}  
}
