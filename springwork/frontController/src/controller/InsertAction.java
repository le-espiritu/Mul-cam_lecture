package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertAction implements Action {

	@Override
	public void run(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("insert기능을 실행하기 위해 만들어진 클래스 - 여기서 요청정보추출, 비지니스메소드콜, 데이터공유등의 작업이 처리");

	}

}
