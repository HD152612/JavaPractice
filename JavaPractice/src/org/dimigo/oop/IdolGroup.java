/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *      |_   IdolGroup
 * 
 * 1.   개요 : 
 * 2.   작성일 :  2017. 4. 11.
 * </pre> 
 * 
 * @author				:  minyoung
 *	@version			:  1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] groupName = {"빅뱅","2NE1","걸스데이"};
		String[][] memberName = {
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","혜리","소진","민아"}
				};
		for(int i=0;i<3;i++){
			System.out.println("<< "+groupName[i]+" >>");
			for(String Name: memberName[i]){
				System.out.println(Name);
			}
			System.out.println(" ");
		}
	}

}
