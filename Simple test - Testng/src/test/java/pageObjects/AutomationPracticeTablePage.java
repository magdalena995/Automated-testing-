package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

import java.io.IOException;

public class AutomationPracticeTablePage extends PropertyFile {
    public static String thead;
    public static String tbody;
    public static String tfoot;

    public By head = By.xpath("//thead");
    public By body = By.xpath("//tbody");
    public By foot = By.xpath("//tfoot");

    public void getHead(){

      thead=   MainMethods.getElementText(head);

    }
    public void getBody(){

         tbody=   MainMethods.getElementText(body);

    }
    public void getFoot(){

         tfoot=   MainMethods.getElementText(foot);

    }
    public void createDoc() throws IOException {
        MainMethods.createFile(thead,tbody,tfoot);
    }



}
