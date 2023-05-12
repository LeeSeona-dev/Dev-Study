package 도서관리프로그램;

import java.util.ArrayList;

// 책을 관리하는 클래스(등록,책정보확인,수정등..)
public class BookSystem {
	
	//BookData 타입 ,배열로,
	private ArrayList<BookData> list = new ArrayList<>();
	
	//책 등록 기능
	public void addBook(String title, int price, String writer) {
		BookData book = new BookData(title,price,writer);
		list.add(book);
		
	}
	//책 전체 조회
	public String getBookTitleList() {
		String msg ="";
		for(int i = 0; i<list.size(); i++) {
			BookData temp = list.get(i);//책 한권씩 꺼내는코드
			msg += temp.getTitle(); //책 이름 누적
			msg +="\n";
		}
		return msg;
	}
}
