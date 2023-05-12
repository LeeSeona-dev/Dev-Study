package 성적관리프로그램;

public class Student {
	
	//필드 보호 2가지 방법
	//학생 이름 , 학번, 성적
	//private : Student 클래스 안에서만 사용
	private String stuName;
	private String stuNum;
	private int javaScore;
	private int dbScore;
	private int webScore;
	
	// 생성자
	// 객체를 생성할때 1번만 호출되는 메소드
	// 반환타입을 작성하지 않는다-> void X
	// 클래스이름과 생성자 이름이 동일
	// 생성자는 하나 이상 선언되어야 한다.
	// (없는 경우 컴파일시에 자동으로 default 생성자 추가)
	
	//1번 방법 : 생성자 이용해서 매개변수로 원하는 데이터를 넣을수있음
	public Student(String stuName, 
			String stuNum, int javaScore, 
			int dbScore, int webScore) {
		//this 객체 자기 자신 안에 있는 필드
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.javaScore = validScore(javaScore);
		this.dbScore = validScore(dbScore);
		this.webScore = validScore(webScore);
		
		
	}
	private int validScore(int score) {
		if(score>=0 || score <=100) {
			return score;
		}else {
			return 0;
		}
	}
	
	//getter 메소드-> 마우스 우클릭 ->source-> generate getter...
	public String getStuName() {
		return stuName;
	}
	
	public String getStuNum() {
		return stuNum;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public int getDbScore() {
		return dbScore;
	}
	public int getWebScore() {
		return webScore;
	}
	
	//setter 메소드
	//필드명이 붙음, 객체안의 값을 수정하고 싶을때 (생성자는 값을 만들때 한번밖에 못쓰므로
	// setter로 값 수정)
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}
	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	
	
	
	
	
}
