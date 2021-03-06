/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *      |_   PersonTest
 * 
 * 1.   개요 : 
 * 2.   작성일 :  2017. 5. 8.
 * </pre> 
 * 
 * @author				:  minyoung
 *	@version			:  1.0
 */
public class PersonTest2 {

	public static void main(String[] args) {
		Person person = new Person("Tom");
		Korean korean = new Korean("홍길동");
		Japanese japanese = new Japanese("다나카");
		Chinese chinese = new Chinese("왕밍");

		Person [] p = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for(Person persons : p){
			greeting(persons);
		}
		
		System.out.println(person);
		System.out.println(korean);
		System.out.println(japanese);
		System.out.println(chinese);
		System.out.println();

		person.sayHello();
		korean.sayHello();
		japanese.sayHello();
		chinese.sayHello();
		System.out.println();
		person.sayBye();
		korean.sayBye();
		japanese.sayBye();
		chinese.sayBye();
	
	}
	private static void greeting(Person p){
		p.sayHello();
		p.sayBye();
	};
}
