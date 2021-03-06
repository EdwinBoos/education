/**
 * 
 * 
 * An example for storing 'enum' like constants that belong together in only one Interface, by 
 * defining classes in the Interface.
 * 
 * 
 * 
 * Created by Edwin Boos ( 01.06.2017 )
 * with Jsweet see : http://www.jsweet.org/jsweet-live-sandbox/ 
 * 
 *
 */
package org.jsweet;



public final class Run implements IConstants {

 public static void main(String[] args) {

  System.out.println(EnumCar.VW);
  System.out.println(EnumCar.AUDI);
  System.out.println(EnumColor.BLACK);
  System.out.println(EnumColor.WHITE);

 }
}


interface IConstants {

 public final class EnumCar implements IConstants {

  private EnumCar() {}

  public final static String VW = "VW";
  public final static String AUDI = "AUDI";

 }

 public final class EnumColor implements IConstants {

  private EnumColor() {}

  public final static String BLACK = "schwarz";
  public final static String WHITE = "weiss";

 }

}
