/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *      |_   CarTest
 * 
 * 1.   개요 : 
 * 2.   작성일 :  2017. 3. 24.
 * </pre> 
 * 
 * @author				:  minyoung
 *	@version			:  1.0
 */
public class CarTest3 {

	   /**
	    * @param args
	    */
	  public static void main(String[] args) {
	      Car3 car3 = new Car3();
	      System.out.println("<< 자동차 목록 >>");

	     car3 = new Car3("현대자동차","제네시스","검정색",225,50000000);

	      
	      System.out.println("제조사명 : " + car3.getCompany());
	      System.out.println("모델명 : " + car3.getModel());
	      System.out.println("색상 : " +car3.getColor());
	      System.out.println("최대속도 : "+ car3.getMaxSpeed()+"km");
	      System.out.printf("가격 : %s원",String.format("%,d",car3.getPrice())); 	      // 콤마 찍기
	      // printf인데 왜 +"원"이 된거지?
	      System.out.println("\n");
	      
	     car3 = new Car3("기아자동차","K7","흰색",246);
	     
	      System.out.println("제조사명 : " + car3.getCompany());
	      System.out.println("모델명 : " + car3.getModel());
	      System.out.println("색상 : " + car3.getColor());
	      System.out.println("최대속도 : "+ car3.getMaxSpeed()+"km");
	      System.out.printf("가격 : %s원",String.format("%,d",car3.getPrice()));
	      System.out.println("\n");

	     car3 = new Car3("삼성자동차","SM7","회색");

	      
	      System.out.println("제조사명 : " + car3.getCompany());
	      System.out.println("모델명 : " + car3.getModel());
	      System.out.println("색상 : " + car3.getColor());
	      System.out.println("최대속도 : "+ car3.getMaxSpeed()+"km");
	      System.out.printf("가격 : %s원",String.format("%,d",car3.getPrice()));
	   }
	}