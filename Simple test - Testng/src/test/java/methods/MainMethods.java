package methods;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


public class MainMethods extends PropertyFile {




    static WebDriverWait wait = new WebDriverWait(getDriver(), 30);
    private static final int elementLocatingTimeout = 20;

    public MainMethods() throws IOException {
    }

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
        WebDriverWait waits = new WebDriverWait(getDriver(), 30);
        waits.until(ExpectedConditions.visibilityOfElementLocated(waitElement));
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
         //group.selectByValue(text);



    }
    public static void selectMultipleActions(By locator1, By locator2){
        WebElement we1= getDriver().findElement(locator1);
        WebElement we2= getDriver().findElement(locator2);
        Actions action = new Actions(getDriver());
        action.keyDown(Keys.CONTROL).click(we1).click(we2).keyUp(Keys.CONTROL).perform();


    }
    public static void uploadFile(By locator, String text){
        getDriver().findElement(locator).sendKeys(text);
    }

    // metoda koja upisuje neku vrednost u input polje
    public static void type(By locator,String text){
        waitForElement(getDriver(), locator).sendKeys(text);
    }
    // metoda koja upisuje neku vrednost u input polje
    public static void typeEnter(By locator,String text){
        waitForElement(getDriver(), locator).sendKeys(text);
        waitForElement(getDriver(),locator).sendKeys(Keys.ENTER);
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
    public static String expanded(By locator){

        String s =  getDriver().findElement(locator).getAttribute("aria-expanded");
        return s;
    }
    public static String enabled(By locator){

        String s =  getDriver().findElement(locator).getAttribute("disabled");
        return s;
    }

    //metoda koja koristi dupli klik
    public static void doubleClick(By locator){
        Actions action = new Actions(getDriver());
        WebElement mouse= getDriver().findElement(locator);
        action.doubleClick(mouse).perform();
    }

    //drag and drop koristeci klasu actions
    public static void dragAndDropActions(By locator1, By locator2){
        WebElement we1= getDriver().findElement(locator1);
        WebElement we2= getDriver().findElement(locator2);

        Actions action = new Actions(getDriver());
        Action dragDrop = action.clickAndHold(we1).moveByOffset(0,50)
              //  .moveToElement(we2)
                .release(we2)
                .build();
        dragDrop.perform();

       /* Action dragDrop = action.dragAndDrop(we1, we2).build();
        dragDrop.perform();*/

    }
    public static void dragAndDropRobot(By locator1, By locator2) throws AWTException {
        WebElement we1= getDriver().findElement(locator1);
        WebElement we2= getDriver().findElement(locator2);

        int x = we1.getLocation().getX();
        int y = we2.getLocation().getY();

        int x1 = we1.getLocation().getX();
        int y1 = we2.getLocation().getY();

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(x1, y1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

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

        we.sendKeys(Keys.ARROW_DOWN);
    }
    public static String btnClass(By locator){

        String s =  getDriver().findElement(locator).getAttribute("class");
        return s;
    }



    //kreiranje i upis u tekstualni dokument
    public static void createFile(String thead, String tbody, String tfoot  ) throws IOException {


        FileWriter fw = new FileWriter(System.getProperty("user.home") + "\\Desktop\\SampleTable.txt");
       // FileWriter fw = new FileWriter("src\\test\\resources\\TextFile\\SampleTable.txt");
        PrintWriter writer = new PrintWriter(fw);
        writer.println(thead);
        writer.println(tbody);
        writer.println(tfoot);

        writer.close();

    }
    //upis textualnog fajla liniju po liniju u niz
    public static String[] readFile() throws IOException {
        List<String> list = Files.readAllLines(Paths.get("src\\test\\resources\\TextFile\\InfoPutovanje.txt"), StandardCharsets.UTF_8);
        String[] a = list.toArray(new String[list.size()]);
        return a;
    }

 //metoda koja menja velicinu elementa
    public static void moveElementOrResize(By locator, int xOffset, int yOffset){
        WebElement we = getDriver().findElement(locator);
        Actions action = new Actions(getDriver());
        action.dragAndDropBy(we, xOffset, yOffset).perform();

    }


    //metoda desni klik


    public static void rightClick(By locator){
        WebElement we = getDriver().findElement(locator);
        Actions action = new Actions(getDriver());
        action.contextClick(we).build().perform();
    }

    public static void moveSliderRight(By locator){
        WebElement we = getDriver().findElement(locator);
        Actions action = new Actions(getDriver());
        action.click(we).sendKeys(Keys.ARROW_RIGHT).build().perform();
    }
    public static void moveSliderLeft(By locator){
        WebElement we = getDriver().findElement(locator);
        Actions action = new Actions(getDriver());
        action.click(we).sendKeys(Keys.ARROW_LEFT).build().perform();
    }

    public static void changeAttr(By locator){

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebElement element = getDriver().findElement(locator);
        js.executeScript("arguments[0].setAttribute('style', 'width: 50%;')", element);

    }
    public static String getInputText(By locator){
        return  getDriver().findElement(locator).getAttribute("value");
    }


}

