package j19_컬렉션.복습;

import java.util.HashMap;
import java.util.Map;

public class SearchData {
	
	public static void main(String[] args) {
		Map<String, Object> searchData = new HashMap<>();
		
		searchData.put("category", "소셜");
		searchData.put("searchValue", "불편한 편의점");
		
		System.out.println(searchData);		//{} 반복돌리기 불가
		System.out.println(searchData.get("category")); //
		System.out.println(searchData.get("searchValue"));
		
		System.out.println(searchData.keySet()); //반복가능
		System.out.println(searchData.values());	//반복가능
		
		System.out.println(searchData.entrySet()); //[]반복이 가능하다
		
		
//		for(int i = 0; i < searchData.size(); i++) {
//			System.out.println(searchData.get(null));
//		} 인덱스로는 반복이 불가
		
		for(String key : searchData.keySet()) {
			System.out.println(searchData.get(key));
		}
		
		
		
	}
}
