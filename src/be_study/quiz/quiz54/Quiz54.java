package be_study.quiz.quiz54;

import java.util.HashMap;

public class Quiz54 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] participant1 = { "leo", "kiki", "eden" };
		String[] completion1 = { "eden", "kiki" };

		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "marina", "josipa", "nikola", "filipa" };

		String[] participant3 = { "mislav", "stanko", "ana", "mislav" };
		String[] completion3 = { "mislav", "stanko", "ana" };

		String result1 = solution(participant1, completion1); // leo
		String result2 = solution(participant2, completion2); // vinko
		String result3 = solution(participant3, completion3); // mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	// 메소드 선언부분
	public static String solution(String[] participant, String[] completion) {

		String answer = "";

		HashMap<String, Integer> map = new HashMap<>();

		for (String p : participant) {
		    if (map.containsKey(p)) {
		        map.put(p, map.get(p) + 1);
		    } else {
		        map.put(p, 1);
		    }
		}

		//완주한 사람 1명씩 제거
		for (String c : completion) {
			map.put(c, map.get(c) - 1);
		}

		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				return key;
			}
		}

		return answer;

	}

}
