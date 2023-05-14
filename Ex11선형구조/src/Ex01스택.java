import java.util.Stack;

public class Ex01스택 {

	public static void main(String[] args) {
		
		
		//1. 스택 생성
		Stack<String> st = new Stack<String>();
		
		//2.요소 삽입(push)
		st.push("hello");
		st.push("hi");
		String a = st.push("Java");
		
		//3. 가장 마지막에 들어간 요소 확인 (top에서 제일 가까운 요소, peek()로 확인,)
		System.out.println(st.peek());
		
		//4. 특정 요소의 위치 확인
		System.out.println(st.search("hello")); //3번
		System.out.println(st.search("hi"));	//2번
		System.out.println(st.search("Java"));	//1번
		
		//5. 요소 삭제 (pop)
		String e = st.pop();
		System.out.println(e);
		
		//6. 스택이 비어있는지 확인
		//비어있으면 -> true, 요소가 하나라도 있으면 -> false
		System.out.println(st.empty());

	}

}
