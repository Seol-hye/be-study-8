package be_study.quiz.quiz40.q4;

//basecode
public class Main {
	public static void main(String[] args) {
		//객체 생성
		KRW krw = new KRW(1500, "원");
		USD usd = new USD(100.50, "달러");
		EUR eur = new EUR(260.87, "유로");
		JPY jpy = new JPY(1400, "엔");

		//부모 클래스를 통한 그룹화
		Currency[] currencies = { krw, usd, eur, jpy };

		//모든 화폐정보를 출력
		for (Currency c : currencies) {
			System.out.println(c.toString());
		}
	}
}
