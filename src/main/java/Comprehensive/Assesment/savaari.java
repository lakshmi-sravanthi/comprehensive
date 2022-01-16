package Comprehensive.Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class savaari {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1077476\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	     WebDriver driver=new EdgeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.savaari.com/"); 
	     //select round trip
	    driver.findElements(By.cssSelector(".custom-control.custom-radio.custom-control-inline")).get(1).click();
	    //fill details
        driver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
        Thread.sleep(1500);
        driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[placeholder='Start typing city - e.g. Mysore']")).sendKeys("P");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input[placeholder='Start typing city - e.g. Mysore']")).sendKeys(Keys.ENTER);
        //selecting pick up date
        //selecting year and month
        driver.findElement(By.cssSelector(".ng-tns-c75-1.form-control.p-inputtext.p-component.ng-star-inserted")).click();
        while(true) {
        	String Pickupdate=driver.findElement(By.cssSelector(".p-datepicker-title.ng-tns-c75-1")).getText();
        	if(Pickupdate.contains("February2022")) {
        		break;
        	}
        	else {
        		driver.findElement(By.cssSelector(".p-ripple.p-element.p-datepicker-next.p-link.ng-tns-c75-1.ng-star-inserted")).click();
        	}
        }
           //selecting day
    	   int daysize=driver.findElements(By.cssSelector(".p-ripple.p-element.ng-tns-c75-1.ng-star-inserted")).size();
    	   for(int i=0;i<daysize;i++) {
    		   String s=driver.findElements(By.cssSelector(".p-ripple.p-element.ng-tns-c75-1.ng-star-inserted")).get(i).getText();
    		   if(s.contains("14")) {
    			   driver.findElements(By.cssSelector(".p-ripple.p-element.ng-tns-c75-1.ng-star-inserted")).get(i).click();
    			   break;
    		   }
    	   }
       //selecting return date
    	   driver.findElement(By.cssSelector(".ng-tns-c75-3.form-control.p-inputtext.p-component.ng-star-inserted")).click();
    	   while(true) {
           	String returndate=driver.findElement(By.cssSelector(".p-datepicker-title.ng-tns-c75-3")).getText();
           	if(returndate.contains("March2022")) {
           		break;
           	}
           	else {
           		driver.findElement(By.cssSelector(".p-datepicker-next-icon.pi.pi-chevron-right.ng-tns-c75-3")).click();
           	}
           }
    	 //selecting day
    	   int daysize2=driver.findElements(By.cssSelector(".p-ripple.p-element.ng-tns-c75-3.ng-star-inserted")).size();
    	   for(int i=0;i<daysize2;i++) {
    		   String s2=driver.findElements(By.cssSelector(".p-ripple.p-element.ng-tns-c75-3.ng-star-inserted")).get(i).getText();
    		   if(s2.contains("13")) {
    			   driver.findElements(By.cssSelector(".p-ripple.p-element.ng-tns-c75-3.ng-star-inserted")).get(i).click();
    			   break;
    		   }
    	   }
    	   
    	  //pickup time
    	  driver.findElement(By.id("pickUpTime")).click();
    	   Thread.sleep(1500);
    		driver.findElement(By.id("pickUpTime")).sendKeys(Keys.ARROW_DOWN);
    		Thread.sleep(1500);
        	driver.findElement(By.id("pickUpTime")).sendKeys(Keys.ENTER);
    	   
    	   
    	  //Select car button
    	   driver.findElement(By.cssSelector(".book-button.btn")).click();
    	   
    	   //car selection
    	   int carSize=driver.findElements(By.cssSelector(".select-button.ng-star-inserted")).size();
    	   int carName=driver.findElements(By.cssSelector(".car-name")).size();
    	   for (int i=0;i<carName;i++) {
    		 String car=  driver.findElements(By.cssSelector(".car-name")).get(i).getText();
    		 if(car.equalsIgnoreCase("Toyota Innova")) { 
    			 driver.findElements(By.cssSelector(".select-button.ng-star-inserted")).get(i).click();
    			 break;
    		 }
    	   }
    	 
    	   //contact details
    	   driver.findElement(By.cssSelector("input[placeholder='Name *']")).sendKeys("Sravanthi");
    	   driver.findElement(By.cssSelector("input[placeholder='Email address *']")).sendKeys("abc@gmail.com");
    	   driver.findElement(By.cssSelector("input[placeholder='Mobile Number *']")).sendKeys("9951618196");
    	   driver.findElement(By.cssSelector("input[placeholder='Enter Pickup Address']")).sendKeys("44-1-31/4");
    	   Thread.sleep(1500);
    	   driver.findElement(By.cssSelector("input[placeholder='Enter Pickup Address']")).sendKeys(Keys.ENTER);
    	   driver.findElement(By.cssSelector("input[placeholder='Landmark/Door Number/Building Name']")).sendKeys("Gunadala");
    	   driver.findElement(By.cssSelector(".theme-button.width-150px.bottom-gap-in-card")).click();
 
	}
	}
