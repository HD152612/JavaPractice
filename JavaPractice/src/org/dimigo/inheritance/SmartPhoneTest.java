/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *      |_   SmartPhoneTest
 * 
 * 1.   개요 : 
 * 2.   작성일 :  2017. 5. 16.
 * </pre> 
 * 
 * @author				:  minyoung
 *	@version			:  1.0
 */
public class SmartPhoneTest {
 
	public static void main(String[] args) {
		SmartPhone[] p = {
				new IPhone("iPhone7", "애플", 900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		for(SmartPhone i : p)
		{
			System.out.println(i.toString());
			i.turnOn();
			i.pay();
			i.useSpecialFunction(i);
			i.turnOff();
		}
	}

}
