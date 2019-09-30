// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.util.Random;

/**
 * This class tests the various methodes found in class PointCPDesign2.
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTestDesign3
{
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointCPDesign3
   * object.
   */
  public static void main(String[] args)
  {
	  PointCPDesign3 point;
	  
	  Random rand = new Random();
	  int value1 = rand.nextInt(100);
	  int value2 = rand.nextInt(100);
	  
	  point = new PointCPDesign3(value1, value2);
	  
	  
	  System.out.println("Testing PointCPDesign3");
	  System.out.println("PointCPDesign3 mémorise des coordonnées cartesien seulement.");
	  System.out.println("Les valeurs des coordonnées cartesien générées sont x = "
	                     +value1+" et y = "+value2);
	  System.out.println("Appel à la méthode getX() on obtient getX() = "+point.getX());
	  System.out.println("Appel à la méthode getY() on obtient getY() = "+point.getY());
	  System.out.println("Appel à la méthode getRho() on obtient getRho() = "+point.getRho());
	  System.out.println("Appel à la méthode getTheta() on obtient getTheta() = "+point.getTheta());
	  System.out.println("Appel à la méthode convertStorageToPolar() on obtient return "
	  		            +point.convertStorageToPolar().toString());
	  System.out.println("Appel à la méthode convertStorageToCartesian() on obtient "
	  		            +point.convertStorageToCartesian().toString());
	  
	  
	  int value3=rand.nextInt(100);
	  int value4=rand.nextInt(100);
	  PointCPDesign3 point2 = new PointCPDesign3(value3, value4);
	  System.out.println("Appel à la méthode getDistance(PointCPDesign3 point("+value3+","
	                    +value4+")) on obtient "+point.getDistance(point2));
	  		            
	  	
	   int value5 = rand.nextInt(100);
       System.out.println("Appel à la méthode rotatePoint(double "+value5+" ) on obtient "
	  		          	  +point.rotatePoint(value5).toString());
	  
	  
  }
}