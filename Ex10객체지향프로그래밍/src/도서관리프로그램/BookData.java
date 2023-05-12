package 도서관리프로그램;

//책을 표현하는 클래스(책 정보를 가지고있음)
public class BookData {
	
	//필드 책이름, 책가격, 책저자
	private String title;
	private int price;
	private String writer;
	
	
	
	//메소드
	//생성자(매개변수 3개)
	//생성자 : 메소드 이름 = 클래스 이름
	
	//생성자 생성
	//마우스우클릭->source->constructor using feild..
	public BookData(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}


	//getter 메소드
	public String getTitle() {
		return title;
	}



	public int getPrice() {
		return price;
	}



	public String getWriter() {
		return writer;
	}


	//setter 메소드
	public void setTitle(String title) {
		this.title = title;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	
}
