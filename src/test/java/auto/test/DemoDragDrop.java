package auto.test;

import org.junit.Test;

public class DemoDragDrop extends BaseTest{
	
	@Test
	public void dragDropTest() {
		basePage.navigate("http://demo.guru99.com/test/drag_drop.html");
		
		dragDropPage.dragToBox("BANK", "DEBIT", "Account");
		dragDropPage.dragToBox("5000", "DEBIT", "Amount");
		dragDropPage.dragToBox("SALES", "CREDIT", "Account");
		dragDropPage.dragToBox("5000", "CREDIT", "Amount");
	}
}
