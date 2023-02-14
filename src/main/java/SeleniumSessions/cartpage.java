package SeleniumSessions;

import org.openqa.selenium.By;

public class cartpage {

	By cart = By.id("cartpagelocator");

	public cartpage(By cart) {
		super();
		this.cart = cart;
	}
	
	public void addToCart() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cartpage got created");

	}

}
