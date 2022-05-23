package day07;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		System.out.println(arr.contains("123"));
		System.out.println(arr.contains("123456"));
		System.out.println(arr.remove(0));
		System.out.println(arr.get(0));
		System.out.println(arr.size());
		arr.clear();
		System.out.println(arr.size());
		arr.add("라면"); arr.add("소금");
		arr.add("순대");
		String index = "소금";
		int i = arr.indexOf(index);
		System.out.println(i+"번째 존재함");
		
		System.out.println("변경 전 : "+arr.get(1));
		arr.set(i, "금금");
		System.out.println("변경 후 : "+arr.get(1));
		System.out.println();
		
		boolean bool = arr.contains("123");
		if(bool == true) {
			System.out.println("123이 있습니다");
		}
	}

}
