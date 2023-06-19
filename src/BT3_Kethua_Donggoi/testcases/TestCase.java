package BT3_Kethua_Donggoi.testcases;

import BT3_Kethua_Donggoi.common.BaseTest;

import java.sql.SQLOutput;

public class TestCase extends BaseTest {

    public TestCase(String browser, boolean report, boolean headless) {

        super(browser, report, headless);
    }


    public void Login() {
        System.out.println("\tThong tin createDrive");
        super.createDriver();
        System.out.println();

        System.out.println("\tTC001_LOGIN");
        System.out.println("User fill in the field Email");
        System.out.println("User fill in the field Password");
        System.out.println("User press the login button");

        System.out.println();
        System.out.println("\tThong tin closeDrive");
        super.closeDriver();
        System.out.println("----------------");
    }

    public void AddCategory() {
        System.out.println("\tThong tin createDrive");
        super.createDriver();
        System.out.println();

        System.out.println("\tTC002_ADD CATEGORY");
        System.out.println("User click the Add New category button");
        System.out.println("User fill in the field Name");
        System.out.println("User click drop up/down in the field Parent Category and click choose value ");
        System.out.println("User fill in the field Ordering Number");
        System.out.println("User click drop up/down in the field Type and click choose value ");
        System.out.println("User click in the field Banner and go to Select file");
        System.out.println("User click in the field Icon and go to Select file");
        System.out.println("User fill in the field Meta Title");
        System.out.println("User fill in the field Meta Description");
        System.out.println("User click drop up/down in the field Filtering Attributes ");
        System.out.println("User press the Save button");

        System.out.println();
        System.out.println("\tThong tin closeDrive");
        super.closeDriver();
        System.out.println("----------------");
    }

    public static void main(String[] args) {
     TestCase tc = new TestCase("Google",true,false );
     tc.Login();
     tc.AddCategory();
    }
}
