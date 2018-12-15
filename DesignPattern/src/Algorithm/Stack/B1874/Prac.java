package Algorithm.Stack.B1874;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Prac {
 
    public static void main(String[] args) throws Exception {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	Stack st = new Stack<>();
    	ArrayList arl = new ArrayList<>();
    	int index = 0;
    	
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	
    	for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
    	
    	for (int i = 1; i < n; i++) {
    		st.push(i); arl.add('+'); // 숫자를 넣는다
    		while(!st.isEmpty() && arr[index] == (int)st.peek()) {
    			index++;
    			st.pop();
    			arl.add('-');
    		}
		}
    	
    	if(!st.isEmpty()) {
    		System.out.println("NO");
    	}else {
    		for (int i = 0; i < arl.size(); i++) {
				System.out.println(arl.get(i));
			}
    	}
    	
    	
    	
    	
    
    }
 
}


