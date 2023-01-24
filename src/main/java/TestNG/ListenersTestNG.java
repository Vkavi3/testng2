package TestNG;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Method" +result.getName());
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method" +result.getName());
    }

}