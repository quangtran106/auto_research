package support.steps;

import support.utils.OperationHelper;

public class StepsDefinations {
	private static  String[][] table;
	private static String dataRow = "";

	public static void main(String[] args) throws Throwable {
		OperationHelper support = new OperationHelper();
		support.openFileExcel("Elements.xlsx", "Flights_Search");
		support.launch("chrome");

		// Given I am on Home Page of "Expedia"
		table = new String[][] { { "Col_Index" }, { "1" } };
		dataRow = "0";
		support.openPage("Elements.xlsx", "Flights_Search", table, dataRow);

		// When I click on "Flights" tab
		support.waitForElementVisible(table, 20);
		support.click(table);

		// When I choose Roundtrip
		table = new String[][] { { "Col_Index" }, { "2" } };
		support.waitForElementVisible(table, 20);
		support.click(table);

		// When I input "Ho Chi Minh"
		table = new String[][] { { "Col_Index" }, { "5" } };
		support.click(table);
		support.sendKey(table);

		// And I choose the correct suggestion
		table = new String[][] { { "Col_Index" }, { "6" } };
		support.waitForElementClickable(table, 20);
		support.selectListElement(table);

		// When I input "Ha Noi"
		table = new String[][] { { "Col_Index" }, { "7" } };
		support.click(table);
		support.sendKey(table);

		// And I choose the correct suggestion
		table = new String[][] { { "Col_Index" }, { "8" } };
		support.waitForElementVisible(table, 20);
		support.selectListElement(table);

		// When I choose date of departing
		table = new String[][] { { "Col_Index" }, { "12" } };
		support.waitForElementClickable(table, 20);
		support.click(table);
		table = new String[][] { { "Col_Index" }, { "13" } };
		support.waitForElementVisible(table, 20);
		support.selectDatePicker(table, "10");

		// And I choose date of returning
		table = new String[][] { { "Col_Index" }, { "14" } };
		support.waitForElementClickable(table, 20);
		support.click(table);
		table = new String[][] { { "Col_Index" }, { "15" } };
		support.waitForElementVisible(table, 20);
		support.selectDatePicker(table, "15");
		
		// When I choose travelers with "1" adult, "2" children, "1" age under 2
		// And I click on "Search" button
		// Then The webpage should display correct data
		// Close page
		Thread.sleep(2000); // just for test
		support.closePage();
	}
}
