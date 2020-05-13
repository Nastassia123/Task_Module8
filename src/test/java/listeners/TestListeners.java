package listeners;

import org.apache.logging.log4j.LogManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListeners implements ITestListener {

    protected static org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("On Test Start " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("On Test Success " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("On Test Failed " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

}
