/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *      |_   Question
 * 
 * 1.   개요 : 
 * 2.   작성일 :  2017. 4. 3.
 * </pre> 
 * 
 * @author				:  minyoung
 *	@version			:  1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] questions = {"1. 가장 좋아하는 가수는? ", "2.가장 좋아하는 배우는? ","3.가장 좋아하는 과목은? "};
		String[] answers = {"빅뱅","탑","응용 프로그래밍"};
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<=2;i++){
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			System.out.println(answer.equals(answers[i])?"정답입니다!" :"틀렸습니다!");
		}
		
		StringBuilder s = new StringBuilder("<< 결과 출력 >> \n");
		for (int i = 0 ;i<3;i++){
			s.append(questions[i]).append(answers[i]).append("입니다.\n");
		}
		System.out.println(s);
	}
}
