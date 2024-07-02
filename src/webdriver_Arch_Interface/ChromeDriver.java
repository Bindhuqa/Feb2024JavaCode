package webdriver_Arch_Interface;

public class ChromeDriver implements  Webdriver {
	
	public ChromeDriver() {
		System.out.println("Chrome is launched");
	}

	@Override
	public void findelement(String name) {
		System.out.println("finding element with"+" "+name);
		
	}

	@Override
	public void findelements(String name) {
		System.out.println("finding elements with"+" "+name);
		
	}

	@Override
	public void get(String url) {
		System.out.println("launching chrome with"+" "+url);
		
	}

	@Override
	public String getTitle() {
		
		return "Amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on elememt:"+" "+element);
		
	}

	@Override
	public void sendkeys(String element, String value) {
		System.out.println("entering the values"+" "+value+"  in element "+element);
		
	}

	@Override
	public void close() {
		System.out.println("closing the browser");
		
	}

}
