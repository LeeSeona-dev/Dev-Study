package 링크드리스트;

public class LinkedList {
	
	
	private Node head; //head 포인터(첫번째 노드의 주소값을 저장할 노드)
	private Node ptr; //선택 포인터 (검색에 사용)->데이터 삽입 ,삭제시 포인터 옮겨줌
	
	
	public LinkedList() {
		head = null;
		ptr = null;
		//head = ptr = null;
	}
	
	//head 쪽으로 노드 삽입
	public void addFirst(String data) { //삽입할 데이터만 지정
		Node a = head; //지금 현재 첫번째 데이터의 참조값 저장 해놓기 위함
		head = new Node(data,a); //새로 삽입할 노드(주소부에 원래 첫번째였던 노드의 참조값을 저장 할수있음)
	}
	
	//head 쪽에서 노드 삭제하기
	public void removeFirst() {
		if(head!=null) {//헤드 : 첫번째 노드에 주소값
			//첫번째 노드가 가지고 있는 주소부(head.getNext())(두번째 노드의 참조값) -> head
			head = head.getNext();
		}
	}
}
