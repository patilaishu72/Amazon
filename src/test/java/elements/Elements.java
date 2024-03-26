package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[3]")//*[@id="nav-xshop"]/a[3]
	public static WebElement mobiles1;
	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
	public static WebElement mobiles2;
	@FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[1]")//*[@id="nav-subnav"]/a[1]
	public static WebElement electronics;
	@FindBy(xpath = "//*[@id=\"s-refinements\"]/div[1]/ul/li[2]/span/a")
	public static WebElement accessories;
	@FindBy(xpath = "//*[@id=\"s-refinements\"]/div[1]/ul/li[7]/span/a")
	public static WebElement mobileAccessories;
	@FindBy(id = "twotabsearchtextbox")
	public static WebElement search;
	@FindBy(id = "nav-search-submit-button")
	public static WebElement searchSubmit;
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")
	public static WebElement firstProduct;
	@FindBy(id = "add-to-cart-button")
	public static WebElement addToCart;
}
