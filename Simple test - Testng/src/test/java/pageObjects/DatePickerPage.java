package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DatePickerPage extends PropertyFile{
    public static String date = "04/13/2020";

    public By tfDate = By.xpath("//input[@id='datepicker']");
    public By left = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']");
    public By day = By.xpath("//a[contains(.,'13')]");

        public void chooseDate(){
            MainMethods.clickOnButton(tfDate);
            MainMethods.clickOnButton(left);
            MainMethods.clickOnButton(day);

        }
        public void verifyDate(){

            String s = MainMethods.getInputText(tfDate);
            Assert.assertTrue(s.equals(date));

        }


}
