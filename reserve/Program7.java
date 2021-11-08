package reserve;

import java.util.Date;

public class Program7 {
	
	public static void main(String[] args) {
		
		Order7 order = new Order7(1080, new Date(), OrderStatus7.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus7 os1 = OrderStatus7.DELIVERED;
		
		OrderStatus7 os2 = OrderStatus7.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
