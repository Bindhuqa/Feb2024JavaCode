package webdriver_Arch_Interface;

public interface Webdriver extends SearchContent {
	@Override
    public void findelement(String name);
	
	@Override
	public void findelements(String name);
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendkeys(String element,String value);
	
	public void close();


}
