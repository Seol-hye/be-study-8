package be_study.quiz.quiz53;

import java.util.List;

public class Quiz53Main {
	public static void main(String[] args) {

		MinuDustRepository repository = new MinuDustRepository();
        MinuDustDAO dao = new MinuDustDAO();

        try {
        	
            String jsonResult = repository.requestApi("2026-07-09");

            List<MinuDustDTO> dtoList = repository.parseJson(jsonResult);

            for (MinuDustDTO dto : dtoList) {
                int count = dao.insert(dto);
                if (count > 0) {
                    System.out.println("DB 저장 성공: " + dto.getPresnatnDT());
                } else {
                    System.out.println("DB 저장 실패");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
