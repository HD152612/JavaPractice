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
public class CarTest2 {

	   /**
	    * @param args
	    */
	  public static void main(String[] args) {
	      Car2 car2 = new Car2();
	      System.out.println("<< 자동차 목록 >>");

	     car2 = new Car2("현대자동차","제네시스","검정색",225,50000000);

	      
	      System.out.println("제조사명 : " + car2.getCompany());
	      System.out.println("모델명 : " + car2.getModel());
	      System.out.println("색상 : " +car2.getColor());
	      System.out.println("최대속도 : "+ car2.getMaxSpeed()+"km");
	      System.out.printf("가격 : %s원",String.format("%,d",car2.getPrice())); 	      // 콤마 찍기
	      // printf인데 왜 +"원"이 된거지?
	      System.out.println("\n");
	      
	     car2 = new Car2("기아자동차","K7","흰색",246,40000000);
	     
	      System.out.println("제조사명 : " + car2.getCompany());
	      System.out.println("모델명 : " + car2.getModel());
	      System.out.println("색상 : " + car2.getColor());
	      System.out.println("최대속도 : "+ car2.getMaxSpeed()+"km");
	      System.out.printf("가격 : %s원",String.format("%,d",car2.getPrice()));
	      System.out.println("\n");

	     car2 = new Car2("삼성자동차","SM7","회색",200,38000000);

	      
	      System.out.println("제조사명 : " + car2.getCompany());
	      System.out.println("모델명 : " + car2.getModel());
	      System.out.println("색상 : " + car2.getColor());
	      System.out.println("최대속도 : "+ car2.getMaxSpeed()+"km");
	      System.out.printf("가격 : %s원",String.format("%,d",car2.getPrice()));
	   }
	}