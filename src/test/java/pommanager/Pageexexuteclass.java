package pommanager;

import java.io.IOException;

import basee.Basee;
import locii.Locuss;

public class Pageexexuteclass extends Locuss{
	public static void launchChrome() {
		Basee.launchChromeBrowser();
	}
	public static void launchDemoAPP() {
		try {
			Basee.launchURL(Basee.locationPropertyFile("url"));
		} catch (IOException e) {
			System.out.println("The Exception is "+e);
		}
	}
	public static void enterUsername() {
		try {
			Basee.jsSendKeys(getUsername(), Basee.locationPropertyFile("username"));
		} catch (IOException e) {
			System.out.println("The Exception of entering username "+e);
		}
	}
	public static void enterPassword() throws InterruptedException {
		try {
			Basee.jsSendKeys(getPassword(), Basee.locationPropertyFile("password"));
		} catch (IOException e) {
			System.out.println("The Exception of entering password "+e);
		}
		Thread.sleep(3000);
	}

	public static void clickLoginButton() {
		Basee.click(getLoginBtn());
	}


}
