package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;

public class DraggablePage extends PropertyFile {

    public By btnDrag = By.xpath("//div[@id='draggable']");

    public void dragElement(){
        for(int i = 0; i<2; i++) {
            MainMethods.moveElementOrResize(btnDrag, 100, 100 + i);
        }
    }
}
