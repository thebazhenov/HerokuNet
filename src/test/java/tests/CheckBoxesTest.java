package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckBoxesTest extends BaseTest{

    @Test
    public void checkAllBox(){
        checkBoxesPage.open();
        checkBoxesPage.activatedAllCheckBox();
        assertEquals(checkBoxesPage.countActiveCheckBox(), 2);
    }

    @Test
    public void disableAllBox(){
        checkBoxesPage.open();
        checkBoxesPage.disableAllCheckBox();
        assertEquals(checkBoxesPage.countActiveCheckBox(), 0);
    }

    @Test
    public void oneActiveBox(){
        checkBoxesPage.open();
        checkBoxesPage.activatedSetNumber(1);
        assertEquals(checkBoxesPage.countActiveCheckBox(), 2);
    }

    @Test
    public void SetActiveAfterSetDisable(){
        checkBoxesPage.open();
        checkBoxesPage.activatedSetNumber(1);
        checkBoxesPage.disableSetNumber(1);
        assertEquals(checkBoxesPage.countActiveCheckBox(), 1);
    }

    @Test
    public void AllElementBox(){
        checkBoxesPage.open();
        assertEquals(checkBoxesPage.countAllBox(), 2);
    }
}
