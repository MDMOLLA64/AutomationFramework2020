package bit.com.returnpactice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
/*
	Return type method is used to give any data to the user OR when we don't know the action
	Last line of the method has to be return key word 
	we can only return 1 value 
	return value type and method return type has to be same 
	we can return data from global, local or from any external source(ex: XL file, database etc)
	we can return data in 4 different format
		Value, variable, method and class/Object
	when we return a method, that method also has to be a return type method
	we can use any of the primitive and reference data type as a method return type
	
	when we return anything what happens:
		based on return type it will allocate space in the memory 
		value will be saved against the method name 
	
	how to get data from a return method? How to get the return value of the method? 
		when you call the method, you have to assign that method to another variable 
		that variable will hold the return value 
		
	what is the difference between a void vs return type method? 
		when U call a void method, it will just execute and you cant do anything else with the method 
		when U call a return method, it will execute then against the method name it will store the return value in the memory 
	
*/
	int e = 1; 
	ChromeDriver dr;
	
	void xp() {
		System.out.println("i am void mnethod");
	}
	
	int getData() {
		
		return 10;
	}
	 
	String data1() {
		
		int r = getData();
		int w = e;
		System.out.println(r);
		
		return "hi";
	}
	
	WebElement anyAction(By by) {
		
		//dr.findElement(By.id("")).click();
		return dr.findElement(by);
	}
	
/*
 * 1st homework: practice parameterized class 
 * 2nd homework: create at least 9 methods and return each of the 8 primitive data type and Object 	
 */
	
	

}