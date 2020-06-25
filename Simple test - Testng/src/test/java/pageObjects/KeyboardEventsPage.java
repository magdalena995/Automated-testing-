package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;

public class KeyboardEventsPage extends PropertyFile {
   // public static String path = "C:\\Users\\magic\\IdeaProjects\\Zadatak_6\\src\\test\\resources\\TextFile\\SampleTable.txt";

    public static String path = System.getProperty("user.home") + "\\Desktop\\SampleTable.txt";
    public static String txt = "Thanks, you have selected C:\\fakepath\\SampleTable.txt file to Upload";

    public By upload = By.xpath("//input[@id='browseFile']");
    public By btnUpload = By.xpath("//button[@id='uploadButton']");

    public void uploadTxt(){
        MainMethods.uploadFile(upload,path);
    }
    public void clickUpload(){
        MainMethods.clickOnButton(btnUpload);
    }
    public void verifyAlertText(){
        String s = MainMethods.txtAlert();
        Assert.assertTrue(s.equals(txt));
    }
    public void closeAlertBox(){
        MainMethods.closeAlert();
    }

}
