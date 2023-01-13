package j19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {
	public static void main(String[] args) {
		
		String[] strArray = new String[] {"java","python","c++"};
		
		String[] newStrArray = new String[strArray.length + 1];
		
		for(int i = 0; i < strArray.length; i++) {
			newStrArray[i] = strArray[i];
		}
		newStrArray[strArray.length] = "html";
		
		System.out.println("[strArray]");
		for(String str : strArray) {
			System.out.println(str);
		}
		
		System.out.println();
		
		System.out.println("[newStrArray]");
		for(String str : newStrArray) {
			
			System.out.println(str);
			
			
		}
		System.out.println();
		//////////////////////////////////////////////////////////////////
		ArrayList<String> strList = new ArrayList<>();//String 생략
		strList.add("java");		
		strList.add("python-1");
		strList.add("python-2");
		strList.add("python-3");
		strList.add("python0");
		strList.add("python1");
		strList.add("python2");
		strList.add("python3");
		strList.add("python4");
		strList.add("python5");
		strList.remove("python-1"); // python-1을 지운다.
		strList.add(1, "java"); // 1번 인덱스에 java를 넣을수 있다.
		strList.remove(2); //2번 인덱스를 지울수 있다
		
	
//		System.out.println(strList);
		for(int i = 0; i < strList.size(); i++) {
			System.out.print("[" + i + "]");
			System.out.println(strList.get(i));
		}
		
		System.out.println();
		
		for(String str : strList) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
	}
	
	
}
