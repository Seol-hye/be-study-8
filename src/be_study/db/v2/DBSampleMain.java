package be_study.db.v2;

import java.util.List;

import be_study.quiz.quiz45.Product;

public class DBSampleMain {

	public static void main(String[] args) {

		// DB dept 테이블 관련 데이터 접근 담당 객체
		DeptDAO deptDAO = new DeptDAO();

		Dept dept1 = deptDAO.findDeptByDeptno(30);
		System.out.println(dept1.getDname());
		System.out.println(dept1.getDeptno());

		System.out.println(dept1.toString());

		Dept dept2 = deptDAO.findDeptByDeptno(90);
		if (dept2 == null) {
			System.out.println("90번에 해당하는 데이터가 없구나~");
		} else {
			System.out.println(dept2.toString());
		}

		Dept dept3 = deptDAO.findDeptByDname("ACCOUNTING");
		System.out.println(dept3.toString());

		Dept dept4 = deptDAO.findDeptByDname("REST");
		if (dept4 == null)
			System.out.println("해당 부서는 없습니다.");

		List<Dept> deptList = deptDAO.findDeptList();
		if (deptList != null) {

			for (Dept d : deptList) {
				System.out.println(d.toString());
			}
		}

		ProductDAO productDAO = new ProductDAO();
		
		Product p1 = productDAO.findProductByPcode(105);

		if (p1 == null) {
			System.out.println("조회 데이터 없음");
		} else {
			System.out.println("===단일 행을 읽어서 리턴해서 출력하기===");
			System.out.println(p1.toString());
		}

		List<Product> productList = productDAO.findProductList();

		if (productList == null) {
			System.out.println("조회 데이터가 없음");
		} else { // 데이터있음
			System.out.println("===객체 리스트 단위로 리턴해서 출력하기===");
			for (Product p : productList) {
				System.out.println(p.toString());
			}
		}

	}

}
