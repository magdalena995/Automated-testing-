package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class FormPage extends PropertyFile {
    public By firstName =  By.xpath("//div[@class='control-group']//input[@name='firstname']");
    public By lastName =  By.xpath("//input[@id='lastname']");
    public By gender =  By.xpath("//input[@id='sex-1']");
    public By yearsOfExperience = By.xpath("//input[@id='exp-0']");
    public By dateOfBirth =  By.xpath("//input[@id='datepicker']");
    public By profesion = By.xpath("//input[@id='profession-1']");
    public By automationTools = By.xpath("//input[@id='tool-2']");
    public By continets = By.xpath("//select[@id='continents']");
    public By chooseContinet = By.xpath("//div[@class='controls']//select[@id='continents']//option[text()='Europe']");
    public By commands = By.xpath("//select[@id='selenium_commands']");
    public String command1 = "Switch Commands";
    public String command2 = "Navigation Commands";
    public By upload = By.xpath("//input[@class='input-file']");
    public String uploadPhoto = "C:\\Users\\magic\\IdeaProjects\\Zadatak_6\\src\\test\\resources\\TextFile\\SampleTable.txt";


    public void enterFirstName(String firstName1){

        MainMethods.type(firstName, firstName1);
    }
    public void enterLastName(String lastName1){
        MainMethods.type(lastName,lastName1);
    }
    public void selectGender(){
        MainMethods.clickOnButton(gender);
    }
    public void selectYearsOfExperience(){
        MainMethods.clickOnButton(yearsOfExperience);
    }
    public void enterDateOfBirth(String date){
        MainMethods.type(dateOfBirth,date);
    }
    public void enterProfession(){
        MainMethods.clickOnButton(profesion);
    }
    public void selectAutomationTools(){
        MainMethods.clickOnButton(automationTools);
    }
    public void enterContinet(){
        MainMethods.clickOnButton(continets);
    }
    public void selectContinent(){
        MainMethods.clickOnButton(chooseContinet);
    }
    public void enterCommands(){
        MainMethods.selectMultiple(commands,command1,command2);
    }
    public void uploadPhotos(){
        MainMethods.uploadFile(upload,uploadPhoto);
    }
}
