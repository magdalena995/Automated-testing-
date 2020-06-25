package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class SliderPage extends PropertyFile {

    public By btnSlide= By.xpath("//span");



    public void moveRight(){

        for(int i = 0; i<20; i++) {
            MainMethods.moveSliderRight(btnSlide);
        }
    }
    public void moveLeft(){
        for (int i = 0; i<10; i++) {
            MainMethods.moveSliderLeft(btnSlide);

        }
        getDriver().navigate().to("https://demoqa.com/category/widgets/");
    }
}
