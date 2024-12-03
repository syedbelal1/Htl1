import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
//import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HTLOne {

	static WebDriver driver;

    // Method to initialize the WebDriver
    public static void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();  // No need to use 'static' here
        driver.manage().window().maximize();
        driver.get("http://10.197.190.26/htlmha/(S(ka4saamhkrkcs3rswcyfcqui))/default.aspx");
    }
	
	public static void main(String[] args) {
		initializeDriver();
		login1();
		DPCC();
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		 //static driver = new ChromeDriver();
		 //driver.manage().window().maximize();
		// driver.get("http://10.197.190.26/htlmha/(S(ka4saamhkrkcs3rswcyfcqui))/default.aspx");
}

	 static void login1() {
			
			
	//WebDriver driver = new ChromeDriver();
		//driver.get("http://10.197.190.26/htlmha/(S(ka4saamhkrkcs3rswcyfcqui))/default.aspx");
WebElement Username=driver.findElement(By.id("txtUsername"));
Username.sendKeys("2019000005");
WebElement Password=driver.findElement(By.id("txtPassword"));
Password.sendKeys("Test@123");
WebElement Signin=driver.findElement(By.id("ContentPlaceHolder1_btnSignIn"));
Signin.click();

WebElement LicensingofEating_Lodging=driver.findElement(By.id("lnk_LicensingofEating_Lodging"));
LicensingofEating_Lodging.click();

try {
   // Pause for a moment to ensure the page is loaded
   Thread.sleep(1000);

   // Locate the "Services" menu item
   WebElement serviceMenu = driver.findElement(By.xpath("//ul[contains(@class, 'main-menu')]/li/a[contains(text(), 'Services')]"));

   // Click to reveal the dropdown
   serviceMenu.click();

   // Use explicit wait to locate the "Apply For New License" option in the dropdown
   WebElement applyNewLicense = new WebDriverWait(driver, Duration.ofSeconds(10)).until(
       ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='lnkbtn_FreshApply']"))
   );

   // Click the "Apply For New License" option
   applyNewLicense.click();

} catch (Exception e) {
   System.out.println("An error occurred: " + e.getMessage());
}






WebElement Close = driver.findElement(By.xpath("//button[@type='button']"));
Close.click();
WebElement upload=driver.findElement(By.id("fu_Photo"));
upload.sendKeys("D:\\New folder (4)\\panda.jpeg");
WebElement Upload1=driver.findElement(By.id("btnUPhoto"));
Upload1.click();

try {
WebElement identityDropdown = driver.findElement(By.id("ContentPlaceHolder1_ddl_Identity"));

//Create a Select object for interacting with the dropdown
Select dropdown = new Select(identityDropdown);

//Select the "Voter ID" option by visible text
dropdown.selectByVisibleText("Voter ID");

//Alternatively, you can select by value
//dropdown.selectByValue("2");

//Add a pause for demo purposes (optional)
Thread.sleep(2000);

} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
} finally {

}  



WebElement Upload2=driver.findElement(By.id("ContentPlaceHolder1_fl_id"));
Upload2.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
WebElement Upload3=driver.findElement(By.id("ContentPlaceHolder1_btn_upload_id"));
Upload3.click();

WebElement Upload4=driver.findElement(By.id("ContentPlaceHolder1_Txt_houseno"));
Upload4.sendKeys("nawadih");
WebElement Upload5=driver.findElement(By.id("ContentPlaceHolder1_txt_street"));
Upload5.sendKeys("Club road");
WebElement Upload6=driver.findElement(By.id("ContentPlaceHolder1_txt_localty"));
Upload6.sendKeys("minto road");

WebElement Upload7=driver.findElement(By.id("ContentPlaceHolder1_txt_city"));
Upload7.sendKeys("south delhi");

try {
   // Open the webpage containing the dropdown
   Thread.sleep(1000);

   // Locate the dropdown element by its ID
   WebElement dropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_state_demo"));

   // Create a Select object for interacting with the dropdown
   Select dropdown = new Select(dropdownElement);

   // Select an option by visible text
   dropdown.selectByVisibleText("DELHI");

   // Or select an option by its value attribute
   dropdown.selectByValue("8");

   // Print the selected option
   WebElement selectedOption = dropdown.getFirstSelectedOption();
   System.out.println("Selected state: " + selectedOption.getText());

} catch (Exception e) {
   e.printStackTrace();
} finally {

}
   try {
       // Open the webpage containing the dropdown
    
   	 Thread.sleep(1000);
       // Locate the district dropdown by its ID
       WebElement districtDropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_dist"));

       // Create a Select object for interacting with the dropdown
       Select districtDropdown = new Select(districtDropdownElement);

       // Select an option by visible text
       districtDropdown.selectByVisibleText("New Delhi");

       // Or select an option by its value attribute
       districtDropdown.selectByValue("149");

       // Retrieve and print the selected option
       WebElement selectedOption = districtDropdown.getFirstSelectedOption();
       System.out.println("Selected district: " + selectedOption.getText());

   } catch (Exception e) {
       e.printStackTrace();
   } finally {
   	WebElement pincode=driver.findElement(By.id("ContentPlaceHolder1_txt_pin"));
   	pincode.sendKeys("110045");
   	//ContentPlaceHolder1_txt_pin
   	
   	try {
   	    // Open the webpage containing the dropdown
   	    Thread.sleep(1000);

   	    // Locate the dropdown element by its ID
   	    WebElement dropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_JurisdictionalPStationPresentadd"));

   	    // Create a Select object for interacting with the dropdown
   	    Select dropdown = new Select(dropdownElement);

   	    // Select an option by visible text
   	    dropdown.selectByVisibleText("ANAND PARBAT");

   	    // Or select an option by its value attribute
   	    dropdown.selectByValue("1");

   	    // Print the selected option
   	    WebElement selectedOption = dropdown.getFirstSelectedOption();
   	    System.out.println("Selected DISTRICT: " + selectedOption.getText());

   	} catch (Exception e) {
   	    e.printStackTrace();
   	} finally {
   }
   	try {
   		WebElement identityDropdown = driver.findElement(By.id("ContentPlaceHolder1_ddl_Recidenceproof"));

   		// Create a Select object for interacting with the dropdown
   		Select dropdown = new Select(identityDropdown);

   		// Select the "Voter ID" option by visible text
   		dropdown.selectByVisibleText("Voter ID");

   		// Alternatively, you can select by value
   		// dropdown.selectByValue("2");

   		// Add a pause for demo purposes (optional)
   		Thread.sleep(2000);

   		} catch (Exception e) {
   		System.out.println("An error occurred: " + e.getMessage());
   		} finally {

   		} 

WebElement Upload09=driver.findElement(By.id("ContentPlaceHolder1_fu_Recidenceproof"));
Upload09.sendKeys("D:\\New folder (4)\\Ramp200.pdf");

WebElement Upload10=driver.findElement(By.id("ContentPlaceHolder1_btnURecidenceproof"));
Upload10.click();

WebElement RADIOBUTTOM=driver.findElement(By.id("ContentPlaceHolder1_chkAccept"));
RADIOBUTTOM.click();

WebElement SUBMIT1=driver.findElement(By.id("ContentPlaceHolder1_btnApplicantDetails"));
SUBMIT1.click();


WebElement Close11 = driver.findElement(By.xpath("//button[@id='btnClose']"));
Close11.click();

try {
   // Open the webpage containing the dropdown

	 Thread.sleep(1000);
   // Locate the district dropdown by its ID
   WebElement districtDropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_tradetye"));

   // Create a Select object for interacting with the dropdown
   Select districtDropdown = new Select(districtDropdownElement);

   // Select an option by visible text
   districtDropdown.selectByVisibleText("Eating Establishment");

   // Or select an option by its value attribute
   districtDropdown.selectByValue("1");

   // Retrieve and print the selected option
   WebElement selectedOption = districtDropdown.getFirstSelectedOption();
   System.out.println("Selected district: " + selectedOption.getText());

} catch (Exception e) {
   e.printStackTrace();
} finally {

}


try {
   // Open the webpage containing the dropdown
   Thread.sleep(1000);

   // Locate the dropdown element by its ID
   WebElement dropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_Eating"));

   // Create a Select object for interacting with the dropdown
   Select dropdown = new Select(dropdownElement);

		        // Create a Select object for interacting with the dropdown
		        //Select jurisdictional = new Select(dropdownElement);

   // Or select an option by its value attribute
   dropdown.selectByValue("1");

   // Print the selected option
   WebElement selectedOption = dropdown.getFirstSelectedOption();
   System.out.println("Selected nature type: " + selectedOption.getText());

} catch (Exception e) {
   e.printStackTrace();
} finally {

}
   WebElement Submit2=driver.findElement(By.id("ContentPlaceHolder1_btnTradeDetails"));
   Submit2.click();
   WebElement Close12 = driver.findElement(By.xpath("//button[@id='btnClose']"));
   Close12.click();
   WebElement UPIC=driver.findElement(By.id("ContentPlaceHolder1_txtupicid"));
   UPIC.sendKeys("HFSHCIFHGIFGHDF1234JHHGG");
   
   WebElement Establishment=driver.findElement(By.id("ContentPlaceHolder1_txt_NameEstablishment"));
   Establishment.sendKeys("Aggarwal Sweet");
   
   WebElement Nameofthepromoter=driver.findElement(By.id("ContentPlaceHolder1_txt_NameOfPromoter"));
   Nameofthepromoter.sendKeys("Aggarwal");
   
   try {
       // Open the webpage containing the dropdown
       Thread.sleep(1000);

       // Locate the dropdown element by its ID
       WebElement dropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_Proposed"));

       // Create a Select object for interacting with the dropdown
       Select dropdown = new Select(dropdownElement);

       // Select an option by visible text
       dropdown.selectByVisibleText("Shopping Mall");

       // Or select an option by its value attribute
       dropdown.selectByValue("1");

       // Print the selected option
       WebElement selectedOption = dropdown.getFirstSelectedOption();
       System.out.println("Selected nature type: " + selectedOption.getText());

   } catch (Exception e) {
       e.printStackTrace();
   } finally {

   }

WebElement shop=driver.findElement(By.id("ContentPlaceHolder1_txt_Shopnumber"));
shop.sendKeys("saheen");
WebElement ShopStreet=driver.findElement(By.id("ContentPlaceHolder1_txt_ShopStreet"));
ShopStreet.sendKeys("Friend Colany");
WebElement ShopLoacality=driver.findElement(By.id("ContentPlaceHolder1_txt_ShopLoacality"));
ShopLoacality.sendKeys("Ajmeri Gate");

try {
   // Open the webpage containing the dropdown

	 Thread.sleep(1000);
   // Locate the district dropdown by its ID
   WebElement districtDropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_ShopDistrict"));

   // Create a Select object for interacting with the dropdown
   Select districtDropdown = new Select(districtDropdownElement);

   // Select an option by visible text
   districtDropdown.selectByVisibleText("New Delhi");

   // Or select an option by its value attribute
   districtDropdown.selectByValue("4");

   // Retrieve and print the selected option
   WebElement selectedOption = districtDropdown.getFirstSelectedOption();
   System.out.println("Selected district: " + selectedOption.getText());

} catch (Exception e) {
   e.printStackTrace();
} finally {

}




try {
   // Pause to allow the page to load completely
   Thread.sleep(1000);

   // Locate the jurisdictional dropdown by its ID
   WebElement jurisdictionalDropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_JurisdictionalPStation"));

   // Create a Select object for interacting with the dropdown
   Select jurisdictional = new Select(jurisdictionalDropdownElement);

   // Select an option by visible text
   jurisdictional.selectByVisibleText("BARAKHAMBA ROAD");

   // Or select an option by its value attribute
   jurisdictional.selectByValue("70");

   // Retrieve and print the selected option
   WebElement selectedOption = jurisdictional.getFirstSelectedOption();
   System.out.println("Selected Jurisdictional: " + selectedOption.getText());

} catch (Exception e) {
   e.printStackTrace();
} finally {
   // Cleanup actions if necessary
	
	
	try {
	    // Pause to allow the page to load completely
	    Thread.sleep(1000);

	    // Locate the MunicipalWardBody dropdown by its ID
	    WebElement MunicipalWardBodyDropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_EstablishmentJurisdictionalMunicipal"));
	    
	    // Create a Select object for interacting with the dropdown
	    Select MunicipalWardBody = new Select(MunicipalWardBodyDropdownElement);

	    // Select an option by visible text
	    MunicipalWardBody.selectByVisibleText("Municipal Corporation of Delhi");

	    // Or select an option by its value attribute
	    MunicipalWardBody.selectByValue("9");

	    // Retrieve and print the selected option
	    WebElement selectedOption = MunicipalWardBody.getFirstSelectedOption();
	    System.out.println("Selected MunicipalWardBody: " + selectedOption.getText());

	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    // Cleanup actions if necessary
	}
	
	try {
	    // Pause to allow the page to load completely
	    Thread.sleep(1000);

	    // Locate the UrbanLocalBody dropdown by its ID
	    WebElement UrbanLocalBodyDropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddlMunicipalCorporationColonyName"));

	    // Create a Select object for interacting with the dropdown
	    Select UrbanLocalBody = new Select(UrbanLocalBodyDropdownElement);

	    // Select an option by visible text
	    UrbanLocalBody.selectByVisibleText("A-1 JANATA FLAT P.VIHAR");

	    // Or select an option by its value attribute
	    UrbanLocalBody.selectByValue("707");

	    // Retrieve and print the selected option
	    WebElement selectedOption = UrbanLocalBody.getFirstSelectedOption();
	    System.out.println("Selected UrbanLocalBody: " + selectedOption.getText());

	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    // Cleanup actions if necessary
	}
	
	WebElement Landline=driver.findElement(By.id("ContentPlaceHolder1_txt_EstablishmentMO"));
	Landline.sendKeys("01122734673");
	
	
	WebElement Email=driver.findElement(By.id("ContentPlaceHolder1_txt_EstablishmentEmail"));
	Email.sendKeys("XYZ@gmail.com");
	
	
	
	try {
	Thread.sleep(500);
	

	WebElement pincode23=driver.findElement(By.id("ContentPlaceHolder1_txt_ShopPincoe"));
	pincode23.sendKeys("110046");

	System.out.println("Selected pincode: " + pincode23.getText());
	
} catch (Exception e) {
   e.printStackTrace();
} finally {
   // Cleanup actions if necessary
}

	
	
	
	
	
	
	
	
	try {
	    // Wait until the file input element is interactable
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_fu_Gstin")));

	    // Ensure the file path is correct and exists
	    String filePath = "D:\\New folder (4)\\Ramp200.pdf"; // Example path
	    File file = new File(filePath);
	    if (!file.exists()) {
	        throw new FileNotFoundException("File not found: " + filePath);
	    }
	  
		
	    // Upload the file
	    fileInput.sendKeys(filePath);
	    System.out.println("File uploaded successfully: " + filePath);

	    // Optionally trigger the submit button after uploading
	    WebElement submitButton = driver.findElement(By.id("ContentPlaceHolder1_btnUGstin"));
	    submitButton.click();
	    System.out.println("Submit button clicked.");

	} catch (Exception e) {
	    e.printStackTrace();
	}

	try {
	    // Pause to allow the page to load completely
	    Thread.sleep(1000);

	    // Locate the ESTABLISHMENTBody dropdown by its ID
	    WebElement ESTABLISHMENTBodyDropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_EstablishmentConstitution"));

	    // Create a Select object for interacting with the dropdown
	    Select ESTABLISHMENTBody = new Select(ESTABLISHMENTBodyDropdownElement);

	    // Select an option by visible text
	    ESTABLISHMENTBody.selectByVisibleText("Proprietorship firm    ");

	    // Or select an option by its value attribute
	    ESTABLISHMENTBody.selectByValue("1");

	    // Retrieve and print the selected option
	    WebElement selectedOption = ESTABLISHMENTBody.getFirstSelectedOption();
	    System.out.println("Selected ESTABLISHMENTBody: " + selectedOption.getText());

	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    // Cleanup actions if necessary
	}
	

	try {
	    // Wait until the file input element is interactable
		
		 
		
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_fu_constitutionOfTheEstablishment")));

	    
	    WebElement txt_OwnerName=driver.findElement(By.id("ContentPlaceHolder1_txt_OwnerName"));
		 txt_OwnerName.sendKeys("ASHOK KUMAR");
	    
		 System.out.println("Owner Name: " + txt_OwnerName);
	     
	    // Ensure the file path is correct and exists
	    String filePath = "D:\\New folder (4)\\Ramp200.pdf"; // Example path
	    File file = new File(filePath);
	    if (!file.exists()) {
	        throw new FileNotFoundException("File not found: " + filePath);
	    }
	  
	   
	    // Upload the file
	    fileInput.sendKeys(filePath);
	    System.out.println("File uploaded successfully: " + filePath);

	    // Optionally trigger the submit button after uploading
	    WebElement submitButton = driver.findElement(By.id("ContentPlaceHolder1_btnUConsitution"));
	    submitButton.click();
	    System.out.println("Submit button clicked.");

	} catch (Exception e) {
	    e.printStackTrace();
	}
	 WebElement GST=driver.findElement(By.id("ContentPlaceHolder1_txt_GSTIN"));
		GST.sendKeys("UIGUIFDGIDFUG324326JJJJ");
		
		


    try {
        // Open the target webpage
        //driver.get("URL_of_the_page");
        driver.manage().window().maximize();

        // Wait for the button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("ContentPlaceHolder1_btnOwner")
        ));

        // Click the button
        submitButton.click();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close the browser
       // driver.quit();
		
}
    try {
        // Open the target webpage
        //driver.get("URL_of_the_page");
        driver.manage().window().maximize();

        // Wait for the button to be clickable
        WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait10.until(ExpectedConditions.elementToBeClickable( By.id("ContentPlaceHolder1_btnOwner")));

        // Click the button
        submitButton.click();
        
       WebElement operationoftheEstablishment=driver.findElement(By.id("operation of the Establishment."));
        operationoftheEstablishment.sendKeys("xyz");
        
        
        
        
        
    } catch (Exception e) {
        e.printStackTrace();
    } finally {

   	   WebElement operationEstablishment=driver.findElement(By.id("ContentPlaceHolder1_txt_ResponsiblePersonEstablishment"));
          operationEstablishment.sendKeys("xyz");
          System.out.println("operationof Establishment: " + Establishment);
         
          WebElement nominationdesignation=driver.findElement(By.id("ContentPlaceHolder1_txt_ResponsiblePersondegination"));
          nominationdesignation.sendKeys("owners");
           
          try {
         		WebElement ownershipOfthePremises = driver.findElement(By.id("ContentPlaceHolder1_ddl_ProofOwnership"));

         		// Create a Select object for interacting with the dropdown
         		Select dropdown = new Select(ownershipOfthePremises);

         		// Select the "Voter ID" option by visible text
         		dropdown.selectByVisibleText("Registered sale deed");

         		// Alternatively, you can select by value
         		dropdown.selectByValue("1");

         		// Add a pause for demo purposes (optional)
         		Thread.sleep(2000);

         		} catch (Exception e) {
         		System.out.println("An error occurred: " + e.getMessage());
         		} finally {

         		} 
             WebElement ProofOwnership=driver.findElement(By.id("ContentPlaceHolder1_fu_ProofOwnership"));
             ProofOwnership.sendKeys("D:\\New folder (4)\\Ramp200.pdf");

             WebElement Upload12=driver.findElement(By.id("ContentPlaceHolder1_btnUProofOwnership"));
             Upload12.click();
             
             
             WebElement MedicalCertificate=driver.findElement(By.id("ContentPlaceHolder1_fu_MedicalCertificate"));
             MedicalCertificate.sendKeys("D:\\New folder (4)\\Ramp200.pdf");

             WebElement Upload13=driver.findElement(By.id("ContentPlaceHolder1_btnUMedicalCertificate"));
             Upload13.click();
             
             WebElement nomination=driver.findElement(By.id("ContentPlaceHolder1_txt_nomination"));
             nomination.sendKeys("xyz");
             WebElement nominationdesignation1=driver.findElement(By.id("ContentPlaceHolder1_txt_nomination_Designation"));//1
             nominationdesignation1.sendKeys("owners");
             WebElement nomination1=driver.findElement(By.id("ContentPlaceHolder1_fl_nomination"));
             nomination1.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
             WebElement btnUnomination=driver.findElement(By.id("ContentPlaceHolder1_btnUnomination"));
             btnUnomination.click();
             //WebElement Savenext = driver.findElement( By.id("ContentPlaceHolder1_btnEstablishment "));

             // Click the button
            //Savenext.click();
          //ContentPlaceHolder1_btnEstablishment   
             WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
             WebElement SavenextButton = wait10.until(ExpectedConditions.elementToBeClickable( By.id("ContentPlaceHolder1_btnEstablishment")));

             // Click the button
             SavenextButton.click();
  	
  }  
    WebElement Close55 = driver.findElement(By.xpath("//button[@id='btnClose']"));
    Close55.click();
    
    WebElement Floor=driver.findElement(By.id("ContentPlaceHolder1_txt_PropertyFloors"));
    Floor.sendKeys("6");
    WebElement PropertyBuildingheight=driver.findElement(By.id("ContentPlaceHolder1_txt_PropertyBuildingheight"));
    PropertyBuildingheight.sendKeys("6");
    
    WebElement PropertyFloor=driver.findElement(By.id("ContentPlaceHolder1_txt_PropertyFloor"));
    PropertyFloor.sendKeys("3");
    WebElement PropertyCoveredArea=driver.findElement(By.id("ContentPlaceHolder1_txt_PropertyCoveredArea"));
    PropertyCoveredArea.sendKeys("80");
    try {
        // Open the target page
       
        driver.manage().window().maximize();

        // Locate the dropdown element
        WebElement yearDropdown = driver.findElement(By.id("ContentPlaceHolder1_ddl_year"));

        // Create a Select instance
        Select selectYear = new Select(yearDropdown);

        // Select an option by value
        selectYear.selectByValue("2022");

        // Alternative: Select an option by visible text
        // selectYear.selectByVisibleText("2022");

        // Alternative: Select an option by index (e.g., 77th index for 2022)
        // selectYear.selectByIndex(77);
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
}
WebElement PropertyWidht=driver.findElement(By.id("ContentPlaceHolder1_txt_PropertyWidht"));
PropertyWidht.sendKeys("5");

WebElement SanctionPlanupload=driver.findElement(By.id("ContentPlaceHolder1_fu_SanctionPlan"));
SanctionPlanupload.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
WebElement SanctionPlanbutton=driver.findElement(By.id("ContentPlaceHolder1_btn_SanctionPlan"));
SanctionPlanbutton.click();
WebElement RADIOBUTTOM1=driver.findElement(By.id("ContentPlaceHolder1_chkdobconoccestpro"));
RADIOBUTTOM1.click();
//req_fu_SanctionPlan

try {
//Open the target webpage

driver.manage().window().maximize();

//Locate the dropdown element
WebElement staircaseDropdown = driver.findElement(By.id("ContentPlaceHolder1_ddlstaircases"));

//Create a Select instance
Select selectStaircases = new Select(staircaseDropdown);

//Select an option by value
selectStaircases.selectByValue("5");

//Alternative: Select an option by visible text
//selectStaircases.selectByVisibleText("5");

//Alternative: Select an option by index (e.g., index 6 for the 5th staircase count including the "Select" option)
//selectStaircases.selectByIndex(6);
} catch (Exception e) {
e.printStackTrace();
} finally {
//Close the browser

}
WebElement WidthOfStaircases=driver.findElement(By.id("ContentPlaceHolder1_txt_WidthOfStaircases"));
WidthOfStaircases.sendKeys("10");
WebElement WidthOfDoor=driver.findElement(By.id("ContentPlaceHolder1_txt_WidthOfDoor"));
WidthOfDoor.sendKeys("10");

WebElement WidthOfCorridor=driver.findElement(By.id("ContentPlaceHolder1_txt_WidthOfCorridor"));
WidthOfCorridor.sendKeys("10");

WebElement StructuralSafety=driver.findElement(By.id("ContentPlaceHolder1_fu_StructuralSafety"));
StructuralSafety.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
WebElement btnUStructuralSafety=driver.findElement(By.id("ContentPlaceHolder1_btnUStructuralSafety"));
btnUStructuralSafety.click();

WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement SavesubmitButton = wait10.until(ExpectedConditions.elementToBeClickable( By.id("ContentPlaceHolder1_btn_prop_submit")));

//Click the button
SavesubmitButton.click();

WebElement close23=driver.findElement(By.id("btnClose"));
close23.click();
WebElement DetailsOfPest=driver.findElement(By.id("ContentPlaceHolder1_fu_DetailsOfPest"));
DetailsOfPest.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
WebElement btnUDetailsOfPest=driver.findElement(By.id("ContentPlaceHolder1_btnUDetailsOfPest"));
btnUDetailsOfPest.click();
WebElement publicsefty=driver.findElement(By.id("ContentPlaceHolder1_btn_publicsefty"));
publicsefty.click();
WebElement close24=driver.findElement(By.id("btnClose"));
close24.click();
}

}
	 }

   
	static void DPCC() {
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://10.197.190.26/htlmha/(S(ekbhpxzbtf2bn4ry5af3yuw1))/License/LicenseDetailsForm.aspx");
		
		
	
	//ContentPlaceHolder1_btnAddSourceOfWater
		try {
    	    // Initialize WebDriverWait with a timeout of 10 seconds
    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	    // Click 'Add Source of Water Save' button
    	    WebElement btnAddSourceOfWaterSave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ContentPlaceHolder1_btnAddSourceOfWater']")));
    	    btnAddSourceOfWaterSave.click();

    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
	
	
	
	
		
		          // Close the browser
		    	  try {
					Thread.sleep(2000);
				
		          driver.manage().window().maximize();

		    
		          WebElement categoryDropdown = driver.findElement(By.id("ContentPlaceHolder1_ddl_Category"));
		          Select selectCategory = new Select(categoryDropdown);
		          selectCategory.selectByValue("2"); // Select "Red"
		          
		          
		          
		    	  } catch (InterruptedException e) {
		  			e.printStackTrace();
		  		}
		 		                
		                WebElement txtGrossCapital=driver.findElement(By.id("ContentPlaceHolder1_txtGrossCapital"));
		                txtGrossCapital.sendKeys("1");		                
		                WebElement DetailsOfPest=driver.findElement(By.id("ContentPlaceHolder1_fu_CertificateFrom"));
		                DetailsOfPest.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
		                WebElement btnUCertificateFrom =driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnUCertificateFrom']"));
		                btnUCertificateFrom.click();
		            	try {
		            		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            	    WebElement btnAddQuantityWasteWaterSave = wait.until(ExpectedConditions.elementToBeClickable(
		                	        By.xpath("//input[@id='ContentPlaceHolder1_btnAddQuantityWasteWater']")));
		            	    btnAddQuantityWasteWaterSave.click();
		            	} catch (Exception e) {
		                    e.printStackTrace();
		                } 
		            	 	
				        

				        try {
							Thread.sleep(2000);
							WebElement TypeTreatmentDropdown=driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddl_TypeTreatment']"))	;
							 Select selectCategory = new Select(TypeTreatmentDropdown);
					          selectCategory.selectByValue("1");
	
							
						
				        	
		            		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            	    WebElement btnAddPresentTreatmentSave = wait.until(ExpectedConditions.elementToBeClickable(
		                	        By.xpath("//input[@id='ContentPlaceHolder1_btnAddPresentTreatment']")));
		            	    btnAddPresentTreatmentSave.click();
		            	} catch (Exception e) {
		                    e.printStackTrace();
		                }  
			        
	             	  try {
				    		  Thread.sleep(3000);
				    		//  (By.xpath("//button[@id='ContentPlaceHolder1_ddl_Activity']"));
				    	  WebElement activityDropdown = driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddl_Activity']"));
			            Select selectActivity = new Select(activityDropdown);

				            // Select an option by visible text
				            selectActivity.selectByVisibleText("Cloud Kitchen with trade effluent discharge connected to sewer");

				            // Wait for the page or dropdown to stabilize
				            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				           selectActivity.selectByValue("172491");
				            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner"))); // Example: Replace with the ID of a loading indicator
				            wait.until(ExpectedConditions.elementToBeClickable(By.id("anotherElementAfterRefresh"))); // Example: Replace with an actual element that appears after the dropdown stabilizes

				            // Verify the selected option
				            String selectedOption = selectActivity.getFirstSelectedOption().getText();
				            System.out.println("Selected Activity: " + selectedOption);
				            System.out.println("Is dropdown displayed: " + activityDropdown.isDisplayed());
				            System.out.println("Is dropdown enabled: " + activityDropdown.isEnabled());

				            
								
				        } catch (Exception e) {
				            e.printStackTrace();
				        }
				               
				        	
	             	 try {
		            		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            	    WebElement btnAddQuantityWasteWaterSave = wait.until(ExpectedConditions.elementToBeClickable(
		                	        By.xpath("//input[@id='ContentPlaceHolder1_btnAddWaterConsumption']")));
		            	    btnAddQuantityWasteWaterSave.click();
		            	} catch (Exception e) {
		                    e.printStackTrace();
		                }  	
				        
	             	 try {
	         		 Thread.sleep(1000);
	         		    driver.manage().window().maximize();

	         		    // Locate the date input field
	         		    WebElement dateField = driver.findElement(By.id("txtproposedoperation"));

	         		    // Clear the field if it has a default value
	         		    dateField.clear();

	         		    // Enter the desired date
	         		    dateField.sendKeys("21/11/2024");

	         		    // Optional: Submit the form or trigger any necessary actions
	         		    dateField.sendKeys(Keys.TAB); // Move focus out of the field
	         		} catch (Exception e) {
	         	          e.printStackTrace();
	         	      } 
	             	try {
	            		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            	    WebElement btnAddModeOfDisposalSave = wait.until(ExpectedConditions.elementToBeClickable(
	                	        By.xpath("//input[@id='ContentPlaceHolder1_btnAddModeOfDisposal']")));
	            	    btnAddModeOfDisposalSave.click();
	            	} catch (Exception e) {
	                    e.printStackTrace();
	                } 
	             	WebElement DPCCSaveNext=driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btn_DPCC_SaveNext']"));
	             	DPCCSaveNext.click();
	             	//ContentPlaceHolder1_btn_DPCC_SaveNext
	                WebElement Close111 = driver.findElement(By.xpath("//button[@id='btnClose']"));
	                Close111.click();
	               //public safety
		     WebElement NumberOfSecurity=driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txt_NumberOfSecurity']"));
		     NumberOfSecurity.sendKeys("3");
		     
		     WebElement txtdppccnumber=driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtdppccnumber']"));
		     txtdppccnumber.sendKeys("SDFGSDJFGSDJF4534G");
		      //ContentPlaceHolder1_txtdppccnumber
		        
         	 try {
     		 Thread.sleep(1000);
     		    driver.manage().window().maximize();

     		    // Locate the date input field
     		    WebElement dateField = driver.findElement(By.id("ContentPlaceHolder1_txtdppccissue"));

     		    // Clear the field if it has a default value
     		    dateField.clear();

     		    // Enter the desired date
     		    dateField.sendKeys("21/11/2024");

     		    // Optional: Submit the form or trigger any necessary actions
     		    dateField.sendKeys(Keys.TAB); // Move focus out of the field
     		} catch (Exception e) {
     	          e.printStackTrace();
     	      } 
         	 
         	WebElement dpccdpUpload2=driver.findElement(By.id("ContentPlaceHolder1_fu_dpccdp"));
         	dpccdpUpload2.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
         	WebElement btndppccUpload3=driver.findElement(By.id("ContentPlaceHolder1_btndppcc"));
         	btndppccUpload3.click();
         	  WebElement btnPublicSaftySavenextButton = driver.findElement( By.id("ContentPlaceHolder1_btnPublicSafty"));

              // Click the button
         	 btnPublicSaftySavenextButton.click();
         	WebElement Close112 = driver.findElement(By.xpath("//button[@id='btnClose']"));
            Close112.click();
            WebElement commanundertaking=driver.findElement(By.id("ContentPlaceHolder1_fu_commanundertaking"));
            commanundertaking.sendKeys("D:\\New folder (4)\\Ramp200.pdf");
         	WebElement btncommanundertaking=driver.findElement(By.id("ContentPlaceHolder1_btncommanundertaking"));
         	btncommanundertaking.click(); 
         	 WebElement Age=driver.findElement(By.id("ContentPlaceHolder1_txt_age"));
            Age.sendKeys("33");
            WebElement Occupation=driver.findElement(By.id("ContentPlaceHolder1_txt_Occupation"));
            Occupation.sendKeys("owner");
            
            
            WebElement Signature=driver.findElement(By.id("ContentPlaceHolder1_fu_Signature"));
            Signature.sendKeys("D:\\New folder (4)\\panda.jpeg");
            WebElement Upload1=driver.findElement(By.id("ContentPlaceHolder1_btnUSignature"));
            Upload1.click();
            
            
            WebElement FrontView=driver.findElement(By.id("ContentPlaceHolder1_fu_FrontView"));
            FrontView.sendKeys("D:\\New folder (4)\\panda.jpeg");
            WebElement btnUFrontView=driver.findElement(By.id("ContentPlaceHolder1_btnUFrontView"));
            btnUFrontView.click();
            
            WebElement txt_place=driver.findElement(By.id("ContentPlaceHolder1_txt_place"));
            txt_place.sendKeys("Delhi");
            
      	  WebElement btnSaveDraft = driver.findElement( By.id("ContentPlaceHolder1_btnSaveDraft"));

      	btnSaveDraft.click();
      	WebElement Close113 = driver.findElement(By.xpath("//button[@id='btnClose']"));
        Close113.click();
        WebElement final_submit=driver.findElement(By.id("btn_final_submit"));
        final_submit.click();
        
            //btn_final_submit
	}}

	



