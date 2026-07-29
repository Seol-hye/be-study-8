package be_study.quiz.quiz50;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz50 {

	public static void main(String[] args) {

		String jsonString = "" + "{" + "\"도서관\": {" + "\"위치\": \"서울특별시 강남구\"," + "\"운영시간\": {"
				+ "\"평일\": [\"09:00\", \"21:00\"]," + "\"주말\": [\"10:00\", \"18:00\"]" + "}," + "\"책목록\": [" + "{"
				+ "\"제목\": \"자바 프로그래밍\"," + "\"저자\": \"홍길동\"," + "\"출판연도\": 2023," + "\"가격\": 25000,"
				+ "\"대출가능\": true," + "\"카테고리\": [\"프로그래밍\", \"자기계발\"]" + "}," + "{" + "\"제목\": \"데이터 분석 입문\","
				+ "\"저자\": \"김철수\"," + "\"출판연도\": 2022," + "\"가격\": 28000," + "\"대출가능\": false,"
				+ "\"카테고리\": [\"데이터\", \"분석\"]" + "}" + "]," + "\"특별서비스\": {" + "\"키오스크\": true," + "\"스터디룸\": {"
				+ "\"개수\": 5," + "\"예약 가능\": true," + "\"비용\": {" + "\"1시간당\": 5000," + "\"하루\": 30000" + "}" + "}"
				+ "}" + "}" + "}";

		// JSON 파싱
		JSONParser jsonParser = new JSONParser();

		try {
			JSONObject root = (JSONObject) jsonParser.parse(jsonString);

			JSONObject library = (JSONObject) root.get("도서관");
			String location = library.get("위치").toString();

			System.out.println("=====도서관 정보=====");
			System.out.println("위치 : " + location);

			JSONObject time = (JSONObject) library.get("운영시간");
			System.out.println("\n[운영시간]");
			JSONArray weekday = (JSONArray) time.get("평일");
			JSONArray weekend = (JSONArray) time.get("주말");

			System.out.println("평일 : " + weekday.get(0) + " ~ " + weekday.get(1));
			System.out.println("주말 : " + weekend.get(0) + " ~ " + weekend.get(1));

			JSONArray books = (JSONArray) library.get("책목록");
			System.out.println("\n[책 목록]");

			for (int i = 0; i < books.size(); i++) {

				JSONObject book = (JSONObject) books.get(i);

				System.out.println("--------------------");
				System.out.println("제목 : " + book.get("제목"));
				System.out.println("저자 : " + book.get("저자"));
				System.out.println("출판연도 : " + book.get("출판연도"));

				int price = ((Number) book.get("가격")).intValue();
				System.out.println("가격 : " + price);

				System.out.println("대출가능 : " + book.get("대출가능"));

				JSONArray category = (JSONArray) book.get("카테고리");
				System.out.print("카테고리 : ");

				for (int j = 0; j < category.size(); j++) {
					System.out.print(category.get(j) + " ");
				}

				System.out.println();
			}

			JSONObject service = (JSONObject) library.get("특별서비스");
			System.out.println("\n[특별서비스]");

			System.out.println("--------------------");
			System.out.println("키오스크 : " + service.get("키오스크"));

			JSONObject room = (JSONObject) service.get("스터디룸");

			System.out.println("스터디룸 개수 : " + room.get("개수"));
			System.out.println("예약 가능 : " + room.get("예약 가능"));

			JSONObject cost = (JSONObject) room.get("비용");

			System.out.println("1시간당 : " + cost.get("1시간당"));
			System.out.println("하루 : " + cost.get("하루"));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
