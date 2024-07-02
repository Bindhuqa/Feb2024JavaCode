package webdriver_Arch_Interface;

public class AmazonTest {

	public static void main(String[] args) {
		
		String Browsername ="chrome";
		Webdriver driver = null;
		switch (Browsername.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FireFoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
        default:System.out.println("please pass the right browser name");
			break;
		}
		
	//	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Amazon")){
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is not correct");
		}
		
		driver.sendkeys("email","bindhu.0530@gmail.com");
		driver.close();

	}

}
