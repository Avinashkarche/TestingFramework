package testngAll;




import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshots;

public class TestNGListeners extends ListenersTest implements ITestListener  {
	public void onTestStart(ITestResult result) {

		System.out.println("Test case started: "+result.getName());
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed: "+result.getName());
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed: "+result.getName());

		Screenshots scr = new Screenshots();

		try {
			scr.captureScreenshot(driver, result.getName());
		} catch (IOException e) {
			System.out.println("Exception arrived while taking screenshot");
		}
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped: "+result.getName());
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("Test tag started : "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag finished : "+context.getName());

	}






}
