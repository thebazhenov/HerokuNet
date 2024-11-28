package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AddRemoveTest extends BaseTest{

    @Test
    public void addRemoveItem(){
        addRemovePage.open();
        addRemovePage.clickAddElement(2);
        assertEquals(addRemovePage.countButtons(), 2);
    }

}
