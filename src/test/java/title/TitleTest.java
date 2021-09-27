package title;

import org.junit.Assert;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class TitleTest extends DriverSetup {
	public static String baseUrl = "https://www.coursera.org/";

	@Test
	public void VerifyTitle() throws InterruptedException {
		String expectedTitle = "Coursera | Online Courses & Credentials From Top Educators. Join for Free";
		driver.get(baseUrl);

		// Actual
		String actualTitle = driver.getTitle();
		System.out.println("Title = " + actualTitle);
		Thread.sleep(2000);

		// Compare
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();

	}
}
