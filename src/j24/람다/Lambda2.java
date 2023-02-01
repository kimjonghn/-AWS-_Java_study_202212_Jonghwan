package j24.람다;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda2 {
	public static void main(String[] args) {
		
		// 1. Runnable - run()
		Runnable a = () -> System.out.println("하나만실행");
		Runnable b = () -> {
			System.out.println("여"); 
			System.out.println("러"); 
			System.out.println("명"); 
			System.out.println("령"); 
			System.out.println("실"); 
			System.out.println("행"); 
			
		};
		a.run();
		b.run();
		b.run();
		
		
		
		// 2. Supplier - get() = 매개변수 없이 리턴값이 있는 인터페이스
		Supplier<LocalDate> c = () -> LocalDate.now();//LocalDate 지금 시간을 가져와줌
		System.out.println();//위 아래 값은 동일
		Supplier<String> d = () -> {
			LocalDate now = LocalDate.now();
			return now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));//ofPateern(String)
		};
		
		System.out.println(c.get());//LocalDate 리턴
		System.out.println();
		System.out.println(d.get());
		System.out.println();
		
		
		
		// 3. Consumer<T> - void accept(T t) =  매개의 값을 받아 소비만 하고 리턴값을 가지지 않는다.
		Consumer<String> e = (name) -> {
			System.out.println("이름 : " + name);
			System.out.println("오늘 날짜 : " + d.get());
		};
		
		e.accept("이종현");
		
		// 메소드 참조 표현식 {[인스턴스]::[메소드명 또는 new]}
		Consumer<String> f = System.out :: println;
		f.accept("출력");//println으로 들어감
		
		List<String> names = new ArrayList<>();
		names.add("김동민");
		names.add("김두영");
		names.add("장진원");
		names.add("조병철");
		
		Consumer<String> g = name -> System.out.println("이름: " + name + "남");
		names.forEach(g);
		System.out.println();//위 아래 값 동일
		names.forEach(name -> {
		
			System.out.println("이름을 출력합니다.");
			System.out.println("이름: " + name + "남");
			System.out.println();
		});
		
		Map<String, String> userMap = new HashMap<>();//forEach를 썼을때
		userMap.put("username", "aaa");
		userMap.put("password", "1234");
		
		userMap.forEach((key, value) -> {
			System.out.println("key: " + key);
			System.out.println("value: " + value);
			System.out.println();
		});
		
		for(Entry<String, String> entry : userMap.entrySet()) {//forEach를 안썼을때
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
			System.out.println();
		}
		
		// 4. Function<R.T>
		
		Function<String, Integer> h = num -> Integer.parseInt(num);
		
		int convertStrNum1 = h.apply("10000");
		int convertStrNum2 = h.apply("20000");
		
		System.out.println(convertStrNum1 + convertStrNum2);
		
		// 5. Predicate<T>
//		Predicate<String> p = str -> str.startsWith("김");
//		Predicate<String> p2 = str -> str.startsWith("이");	
		
		
//		System.out.println(p.or(p2).test("김준일"));// "김"도 되고 "이"도 된다
		
		//위아래 값 동일
		Function<Predicate<String>, Boolean> function1 = 
				predicate -> predicate.or(str -> str.startsWith("이")).test("김준일");
				
		boolean rs = function1.apply(str -> str.startsWith("김"));
		System.out.println(rs);
		
		List<String> namesList = new ArrayList<>();
		names.add("김종환");
		names.add("고병수");
		names.add("김상현");
		names.add("김준경");
		
		//스트림 -> 일회용
		Stream<String> stream = names.stream().filter(name -> name.startsWith("김"));
//		stream.forEach(name -> System.out.println(name));
		List<String> newList = stream.collect(Collectors.toList());
		
		System.out.println(newList);		
		
		newList.forEach(str -> System.out.println(str));
		
		System.out.println("==================================================");
		
		
	}
}
