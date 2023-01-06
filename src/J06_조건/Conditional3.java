package J06_조건;

import java.util.Scanner;

public class Conditional3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		System.out.print("점수 입력: ");
		score = scanner.nextInt();
		
		if(0 > score || score > 100 ) {
			grade = null; }
		else if(score > 89) {
			grade = "A";}
		else if(score > 79) {
			grade = "B";}
		else if(score > 69) {
			grade = "C";}
		else if(score > 59) {
			grade = "D";}
		else {
			grade = "F";
			}
		if((score > 59 && score < 101) && (score % 10 > 4 || score == 100)) {
			grade = grade + "+";}
		
		if (grade == null) {
			System.out.println("계산불가");
		}
		else {
			System.out.println("점수(" + score + "): " + grade + "학점");
		}
			
		
	}
}
/*
 * 조건
 * Score가 0점보다 작거나 100점보다 크면 계산불가
 * 90~100
 * */
 