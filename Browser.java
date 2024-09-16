package week1.day2;

public class Browser {

	public static void main(String[] args) {

		Browser b = new Browser();
		b.launchBrowser("Chrome");
		b.loadUrl();

	}

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully ---" + browserName);
		return browserName;

	}

	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

}
