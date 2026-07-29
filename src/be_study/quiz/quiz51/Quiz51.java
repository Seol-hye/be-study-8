package be_study.quiz.quiz51;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz51 {

	public static void main(String[] args) {

		String jsonString = "{" + "\"employees\": [" + "{" + "\"id\": 1," + "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\"," + "\"salary\": 50000," + "\"skills\": [\"Java\", \"Python\", \"SQL\"]" + "},"
				+ "{" + "\"id\": 2," + "\"name\": \"김철수\"," + "\"position\": \"디자이너\"," + "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]" + "}" + "]," + "\"company\": {"
				+ "\"name\": \"주식회사 ABC\"," + "\"address\": \"서울시 강남구\"," + "\"established\": \"1990-01-01\","
				+ "\"departments\": [" + "{" + "\"name\": \"개발부\"," + "\"employees\": [1, 3, 5]" + "}," + "{"
				+ "\"name\": \"디자인부\"," + "\"employees\": [2, 4]" + "}" + "]" + "}," + "\"projects\": [" + "{"
				+ "\"title\": \"사내 시스템 개발\"," + "\"budget\": 100000," + "\"team\": [1, 3]" + "}," + "{"
				+ "\"title\": \"웹 디자인 프로젝트\"," + "\"budget\": 80000," + "\"team\": [2, 4]" + "}" + "]" + "}";
		
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject root = (JSONObject) parser.parse(jsonString);
			
			//Employees
			JSONArray employees = (JSONArray) root.get("employees");
			System.out.println("=====직원 정보=====");

			for (int i = 0; i < employees.size(); i++) {

			    JSONObject employee = (JSONObject) employees.get(i);
			    System.out.println("----------------------");

			    System.out.println("ID: " + employee.get("id"));
			    System.out.println("이름: " + employee.get("name"));
			    System.out.println("직급: " + employee.get("position"));
			    int salary = ((Number) employee.get("salary")).intValue();
			    System.out.println("급여: " + salary);

			    JSONArray skills = (JSONArray) employee.get("skills");

			    System.out.print("기술: ");

			    for (int j = 0; j < skills.size(); j++) {
			        System.out.print(skills.get(j) + " ");
			    }

			    System.out.println();
			}
			
			//Company
			JSONObject company = (JSONObject) root.get("company");

			System.out.println("\n=====회사 정보=====");
			System.out.println("회사명: " + company.get("name"));
			System.out.println("주소: " + company.get("address"));
			System.out.println("설립일: " + company.get("established"));
			
			//Departments
			JSONArray departments = (JSONArray) company.get("departments");
			System.out.println("\n[부서 정보]");

			for (int i = 0; i < departments.size(); i++) {

			    JSONObject dept = (JSONObject) departments.get(i);
			    
			    System.out.println("----------------------");

			    System.out.println("부서명: " + dept.get("name"));

			    JSONArray emp = (JSONArray) dept.get("employees");

			    System.out.print("사원번호: ");

			    for (int j = 0; j < emp.size(); j++) {
			        System.out.print(emp.get(j) + " ");
			    }

			    System.out.println();
			}
			
			
			//Projects
			JSONArray projects = (JSONArray) root.get("projects");
			System.out.println("\n[프로젝트 정보]");

			for (int i = 0; i < projects.size(); i++) {

			    JSONObject project = (JSONObject) projects.get(i);
			    System.out.println("----------------------");

			    System.out.println("프로젝트: " + project.get("title"));
			    System.out.println("예산: " + project.get("budget"));

			    JSONArray team = (JSONArray) project.get("team");

			    System.out.print("팀원: ");

			    for (int j = 0; j < team.size(); j++) {
			        System.out.print(team.get(j) + " ");
			    }

			    System.out.println();
			}
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
