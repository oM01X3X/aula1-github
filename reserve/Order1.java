package reserve;

import java.util.Date;

public class Order1 {

	private Date date;
	private Product1 product;
	
	public Order1() {
		
	}
	public Order1(Date date, Product1 product) {
		super();
		this.date = date;
		this.product = product;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Product1 getProduct() {
		return product;
	}
	public void setProduct(Product1 product) {
		this.product = product;
	}
	
	
}
