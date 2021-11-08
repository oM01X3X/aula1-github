package reserve;

import java.util.Date;

public class Order7 {

		private Integer id;
		private Date moment;
		private OrderStatus7 status;
		
		public Order7() {
			
		}

		public Order7(Integer id, Date moment, OrderStatus7 status) {
			this.id = id;
			this.moment = moment;
			this.status = status;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Date getMoment() {
			return moment;
		}

		public void setMoment(Date moment) {
			this.moment = moment;
		}

		public OrderStatus7 getStatus() {
			return status;
		}

		public void setStatus(OrderStatus7 status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
		}
		
}
