package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.*;


public class InteractionsTest extends PropertyFile {
    @Test
    public void interactionsTest(){
        test = report.startTest("Check if user is able to use basic interactions");

        HomePage homePage = new HomePage();
        InteractionsPage interactionsPage = new InteractionsPage();
        SortablePage sortablePage = new SortablePage();
        SelectablePage selectablePage = new SelectablePage();
        ResizablePage resizablePage = new ResizablePage();
        DroppablePage droppablePage = new DroppablePage();
        DraggablePage draggablePage = new DraggablePage();

        homePage.clickInteractions();
        test.log(LogStatus.INFO, "[Interactions] is clicked");

        interactionsPage.clickSortable();
        test.log(LogStatus.INFO, "[Sortable] is clicked");

        sortablePage.moveItem1();
        test.log(LogStatus.INFO, "[Item1] is moved");

        sortablePage.moveItem3();
        test.log(LogStatus.INFO, "[Item3] is moved ");

        interactionsPage.clickSelectable();
        test.log(LogStatus.INFO, "[Selectable] is clicked");

        selectablePage.select();
        test.log(LogStatus.INFO, "[Item3] and [Item5] are selected");

        interactionsPage.clickResizable();
        test.log(LogStatus.INFO, "[Resizable] is clicked");

        resizablePage.resizable();
        test.log(LogStatus.INFO, "[Element] is resized");

        interactionsPage.clickDroppable();
        test.log(LogStatus.INFO, "[Droppable] is clicked");

        droppablePage.dragAndDropEl();
        test.log(LogStatus.INFO, "[Element] is dragged and dropped in another element");

        droppablePage.verifyDragAndDrop();
        test.log(LogStatus.INFO, "[Drop] is verified");

        interactionsPage.clickDaggable();
        test.log(LogStatus.INFO, "[Daggable] is clicked");

        draggablePage.dragElement();
        test.log(LogStatus.PASS, "[Element] is dragged");
    }
}