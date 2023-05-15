package 큐;

public class intQueue {
	// 필드 
	private int[] que;
	private int capacity; //큐의 최대 용량
	private int front; // 큐 맨 앞을 가리킴
	private int rear; //큐 맨 뒤를 가리킴
	private int num; //현재 데이터 개수
	
	//생성자
	public intQueue(int maxlen) {
		que = new int[maxlen];
		num= front = rear =0;
		capacity = maxlen;
	}
	
	//메서드
	//인큐(데이터 삽입)
	public int enque(int x) {
		que[rear++] = x;
		num++;
		if(rear == capacity) {
			rear = 0;
		}
		return x;
	}
	
	//디큐(데이터 삭제)
	public int deque(int x) {
		x = que[front++];
		num--;
		if(front == capacity) {
			front = 0;
		}
		return x;
	}
	
	//peek : 맨 앞(첫번째)에 데이터 확인
	public int peek() {
		return que[front];
	}
	
	//clear : 큐 비우기
	public void clear() {
		num = 0;
	}
	
	//indexOf : 특정값의 배열 상 인덱스 확인
	public int indexOf(int x) {
		for(int i =0; i<num; i++) {
			int idx = (i+front)%capacity;
			if(que[idx]== x) {
				return idx;
			}
		}return -1;
	}
	
	//size : 쌓여있는 데이터 개수
	public int size() {
		return num;
	}
	
	//isEmpty : 큐가 비어있는지 확인 
	public boolean isEmpty() {
		return  num == 0;
	}
	
	//isFull : 큐가 가득 차있는지 확인
	public boolean isFull() {
		return num==capacity;
	}
	
	//dump : 큐 안에 데이터를 front~ rear 순서로 출력
	public void dump() {
		for(int i = 0; i<num; i++) {
			System.out.print(que[i] + " ");
		}
	}
	
	
}
