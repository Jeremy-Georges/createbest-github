// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in polar
 * format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCPDesign2
{
  //Instance variables ************************************************

  
  
  /**
   * Contains the current value of RHO.
   */
  private double rho;
  
  /**
   * Contains the current value of THETA.
   */
  private double theta;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a polar coordinate object.
   */
  public PointCPDesign2(double rho, double theta)
  {
	  this.rho = rho;
	  this.theta = theta;
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return (Math.cos(Math.toRadians(theta)) * rho);
  }
  
  public double getY()
  {
	  return (Math.sin(Math.toRadians(theta)) * rho);
  }
  
  public double getRho()
  {
	  return rho;
  }
  
  public double getTheta()
  {
	  return theta;
  }
  
	
  /**
   * Returns a point in polar coordinates.
   */
  public PointCPDesign2 convertStorageToPolar()
  {
	  return new PointCPDesign2(getRho(), getTheta());
  }
	
  /**
   * Returns a point in cartesian coordinate.
   */
  public PointCPDesign3 convertStorageToCartesian()
  {
	  return new PointCPDesign3(getX(), getY());
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCPDesign2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCPDesign2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCPDesign2(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
	  return "Polaire [" + getRho() + "," + getTheta() + "]";
  }
}
