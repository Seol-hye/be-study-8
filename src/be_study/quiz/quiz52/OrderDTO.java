package be_study.quiz.quiz52;

import java.util.List;

public class OrderDTO {
	
	String orderId;
	String date;
	List<ItemDTO> items;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", date=" + date + ", items=" + items + "]";
	}
	
	
	
}
