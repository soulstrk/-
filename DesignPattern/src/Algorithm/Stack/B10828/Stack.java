package Algorithm.Stack.B10828;

import java.util.ArrayList;

//LIFO
public class Stack {
	
	private static Stack stack = new Stack();
	
	private Stack() {}
	
	public static Stack getInstance() {
		return stack;
	}
	
	ArrayList<Integer> list = new ArrayList<>();
	
	public void push(int num) {
		list.add(num);
	}
	
	public void pop() {
		int index = list.size();
		list.remove(index-1);
	}
	
	public void size() {
		System.out.println("사이즈="+list.size());
	}
	
	public void empty() {
		if(list.size() == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public void top() {
		int topNum = list.get(list.size()-1);
		System.out.println("가장 마지막 숫자:"+topNum);
	}

	@Override
	public String toString() {
		return "Stack [list=" + list + "]";
	}
	
	
}
