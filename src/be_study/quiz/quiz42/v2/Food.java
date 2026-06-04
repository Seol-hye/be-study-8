package be_study.quiz.quiz42.v2;

public class Food {
	
	String name; //이름
	int price; //가격
	int stock; //재고

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = 0;
	}
	
	public boolean sell(int count) { //주문하면 그 수량만큼 재고에서 마이너스
	    if(stock < count) {
	        return false;
	    }

	    stock -= count;
	    return true;
	}
	
	public void addStock(int amount) {
		stock += amount;
	}
	
	void showFoodInfo() {
	    System.out.printf("%s : %d원 (잔여재고:%d)", name, price, stock);
	}

}
