package be_study.quiz.quiz42.v1;

public class Food {
	
	String name; //이름
	int price; //가격
	int stock; //재고

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = 0;
	}
	
	public boolean sell(int count) {
	    if(stock < count) {
	        return false;
	    }

	    stock -= count; 
	    return true;
	}
	
	public void addStock(int amount) {
		stock += amount;
	}
	
	@Override
	public String toString() {
	    return String.format("%s : %d원 (잔여재고:%d)",
	            name, price, stock);
	}

}
