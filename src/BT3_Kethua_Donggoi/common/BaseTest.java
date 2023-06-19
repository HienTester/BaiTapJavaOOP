package BT3_Kethua_Donggoi.common;

public class BaseTest extends Constants {

    public BaseTest(String browser, boolean report, boolean headless) {
        this.browser = browser;
        this.report = report;
        this.headless = headless;
    }
    public void createDriver() {
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver() {
        System.out.println("Closed browser: " + Constants.browser);

    }
    public static void main(String[] args) {

       BaseTest bt = new BaseTest("Chorme",true,false);
       bt.createDriver();
       bt.closeDriver();

    }
}
