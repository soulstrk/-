package DataStructure.Tree;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];
		int i = 0;
		for (String s : strArr) {
			intArr[i] = Integer.parseInt(s);
			i++;
		}

		for (int j = 0; j < intArr.length; j++) {
			bt.addNode(intArr[j]);
			bt.getRoot();
		}
	}
}
