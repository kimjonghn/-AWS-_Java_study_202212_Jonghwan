package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

//@RequiredArgsConstructor
//@NoArgsConstructor//기본 생성자
//@AllArgsConstructor//전체 생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString

@AllArgsConstructor
@Data

public class Student {
	private String name; //이름
	private int year; //학년
//	private final String address;
	
}
