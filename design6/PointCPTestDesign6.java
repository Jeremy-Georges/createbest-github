// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.util.Random;

/**
 * This class tests the various methodes found in class PointCPDesign6D2 
 * and PointCPDesign6D3.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTestDesign6
{
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of PointCPDesign6D2 
   * and PointCPDesign6D3 object.
   */
  public static void main(String[] args)
  {
      PointCPDesign6D2 point;
	  
	  Random rand = new Random();
	  int value1 = rand.nextInt(100);
	  int value2 = rand.nextInt(100);
	  
	  point = new PointCPDesign6D2(value1, value2);
	  
	  
	  System.out.println("Testing PointCPDesign6D2");
	  System.out.println("PointCPDesign6D2 mémorise des coordonnées polaire seulement.");
	  System.out.println("Les valeurs des coordonnées polaire générées sont rho = "
	                     +value1+" et theta = "+value2);
	  System.out.println("Appel à la méthode getX() on obtient getX() = "+point.getX());
	  System.out.println("Appel à la méthode getY() on obtient getY() = "+point.getY());
	  System.out.println("Appel à la méthode getRho() on obtient getRho() = "+point.getRho());
	  System.out.println("Appel à la méthode getTheta() on obtient getTheta() = "+point.getTheta());
	  System.out.println("Appel à la méthode convertStorageToPolar() on obtient "
	  		            +point.convertStorageToPolar().toString());
	  System.out.println("Appel à la méthode convertStorageToCartesian() on obtient return "
	  		            +point.convertStorageToCartesian().toString());
	  
	  
	  int value3=rand.nextInt(100);
	  int value4=rand.nextInt(100);
	  PointCPDesign6D2 point2 = new PointCPDesign6D2(value3, value4);
	  System.out.println("Appel à la méthode getDistance(PointCPDesign2 point("+value3+","
	                    +value4+")) on obtient "+point.getDistance(point2));
	  		            
	  	
	   int value5 = rand.nextInt(100);
       System.out.println("Appel à la méthode rotatePoint(double "+value5+" ) on obtient "
	  		          	  +point.rotatePoint(value5).toString());
	  
	  
       System.out.println("************************************************************");
       System.out.println("************************************************************");
       
       System.out.println("Testing PointCPDesign6D3");
      
      
       PointCPDesign6D3 point3;
 	  
 	   int value6 = rand.nextInt(100);
 	   int value7 = rand.nextInt(100);
 	  
 	   point3 = new PointCPDesign6D3(value6, value7);
 	  
 	  
 	   System.out.println("Testing PointCPDesign6D3");
 	   System.out.println("PointCPDesign6D3 mémorise des coordonnées cartesien seulement.");
 	   System.out.println("Les valeurs des coordonnées cartesien générées sont x = "
 	                     +value6+" et y = "+value7);
 	   System.out.println("Appel à la méthode getX() on obtient getX() = "+point3.getX());
 	   System.out.println("Appel à la méthode getY() on obtient getY() = "+point3.getY());
 	   System.out.println("Appel à la méthode getRho() on obtient getRho() = "+point3.getRho());
 	   System.out.println("Appel à la méthode getTheta() on obtient getTheta() = "+point3.getTheta());
 	   System.out.println("Appel à la méthode convertStorageToPolar() on obtient return "
 	  		            +point3.convertStorageToPolar().toString());
 	   System.out.println("Appel à la méthode convertStorageToCartesian() on obtient "
 	  	 	            +point3.convertStorageToCartesian().toString());
 	  
 	  
 	   int value8=rand.nextInt(100);
 	   int value9=rand.nextInt(100);
 	   PointCPDesign6D3 point4 = new PointCPDesign6D3(value8, value9);
 	   System.out.println("Appel à la méthode getDistance(PointCPDesign3 point("+value8+","
 	                     +value9+")) on obtient "+point3.getDistance(point4));
 	  		          
 	  	
 	   int value10 = rand.nextInt(100);
       System.out.println("Appel à la méthode rotatePoint(double "+value10+" ) on obtient "
 	  		          	  +point.rotatePoint(value10).toString());
       
  }
}