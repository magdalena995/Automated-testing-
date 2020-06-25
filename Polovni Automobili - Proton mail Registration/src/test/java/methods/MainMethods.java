package methods;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class MainMethods extends PropertyFile {


    static WebDriverWait wait = new WebDriverWait(getDriver(), 20);
    private static final int elementLocatingTimeout = 20;

    // metoda koja ceka da element postane klikabilan
    public static WebElement waitForClickableElement(WebDriver webDriver, By selector)
    {
        return new WebDriverWait(webDriver, elementLocatingTimeout).until(ExpectedConditions.elementToBeClickable(selector));
    }


    // metoda koja ceka da element bude vidljiv u DOM-u
    public static WebElement waitForElement(WebDriver webDriver, By selector)
    {
        return new WebDriverWait(webDriver, elementLocatingTimeout).until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    // metoda koja ceka da neki element bude fizicki vidljiv na stranici
    public static void waitElementToBeVisible(By waitElement) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitElement));
    }

    // metoda koja ceka da neki element ne bude vise vidljiv
    public static void waitElementToBeNotVisible(By waitElement){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(waitElement));
    }

    //metoda koja uzima tekst iz elemenata
    public static String getElementText(By locator){
       return   getDriver().findElement(locator).getAttribute("innerText").trim();
    }



    // metoda koja klikce na dugme
    public static void clickOnButton(By locator){
        waitForClickableElement(getDriver(), locator).click();

    }

    public static void selectMultiple(By locator, String text, String text1){
        WebElement selectList= getDriver().findElement(locator);
        Select group = new Select(selectList);
        group.selectByVisibleText(text);
        group.selectByVisibleText(text1);
         group.selectByValue(text);
    }
    public static void uploadFile(By locator, String text){
        getDriver().findElement(locator).sendKeys(text);
    }

    // metoda koja upisuje neku vrednost u input polje
    public static void type(By locator,String text){
        waitForElement(getDriver(), locator).sendKeys(text);
    }

    //metoda koja brise vrednost iz input polja
    public static void clearValue(By locator){
        waitForElement(getDriver(), locator).clear();
    }

    //metoda koja prebacuje Handle u novi prozor

    public static void switchWindow(){

        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
    }

    //metoda koja maksimizira prozor
    public static void maxWindow(){
        getDriver().manage().window().maximize();
    }

    //metoda koja gasi novi prozor i vraca na prvi
    public static void returnWindow(){

        getDriver().close();
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }


    }
    //metoda koja uzima text iz Alert-a
    public static String txtAlert(){
        new WebDriverWait(getDriver(), 60)
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());


        Alert alert = getDriver().switchTo().alert();
        String s = alert.getText();

         return s ;
    }
    //metoda koja zatvara Alert
    public static void closeAlert(){
        getDriver().switchTo().alert().accept();
    }

    //metoda koja uzima boju teksta dugmeta
    public static String btnColor(By locator){

        String s =  getDriver().findElement(locator).getAttribute("style");
       return s;
    }

    //metoda koja koristi dupli klik
    public static void doubleClick(By locator){
        Actions action = new Actions(getDriver());
        WebElement mouse= getDriver().findElement(locator);
        action.doubleClick(mouse).perform();
    }


    //metoda koja uzima jedan elemet i prebacuje na drugo mesto
    public static void dragAndDrop(By locator1, By locator2)  {
       WebElement we1= getDriver().findElement(locator1);
        WebElement we2= getDriver().findElement(locator2);
        final String java_script =
                "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
                        "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
                        "ction(format,data){this.items[format]=data;this.types.append(for" +
                        "mat);},getData:function(format){return this.items[format];},clea" +
                        "rData:function(format){}};var emit=function(event,target){var ev" +
                        "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
                        "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
                        "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
                        "'drop',tgt);emit('dragend',src);";

        ((JavascriptExecutor)getDriver()).executeScript(java_script, we1, we2);

         /* Actions action = new Actions(getDriver());
        Action dragDrop = action.clickAndHold(we1)
                .moveToElement(we2)
                .release(we2)
                .build();
        dragDrop.perform();*/

       /* Actions action = new Actions(getDriver());
        Action dragDrop = action.dragAndDrop(we1, we2).build();
        dragDrop.perform();*/

    }


    //metoda koja kreira random string
    public static String randomString(){
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (sb.length() < 8) {
            int index = (int) (rnd.nextFloat() * s.length());
            sb.append(s.charAt(index));
        }
       String randomString = sb.toString();
        return randomString;

    }



    //metoda koja kreira email
    public static String createEmail(){
       String  email = "magica995+" + randomString().toLowerCase() + "@protonmail.com";
        return email;
    }

    //metoda koja pomera misa na zeljeno mesto i klikce
    public static void getMouseHover(By locator1){
        Actions action = new Actions(getDriver());
        WebElement we1 = getDriver().findElement(locator1);
       // WebElement we2 = getDriver().findElement(locator2);
        action.moveToElement(we1).build().perform();
        //action.moveToElement(we1).moveToElement(we2).click().build().perform();
    }

    //metoda koja skroluje stranicu do elementa
    public static void scrollDown(By locator){
        WebElement we = getDriver().findElement(locator);

        we.sendKeys(Keys.PAGE_DOWN);
    }
    public static String btnClass(By locator){

        String s =  getDriver().findElement(locator).getAttribute("class");
        return s;
    }


}

