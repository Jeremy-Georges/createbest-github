
/**
 * This class contains instances of coordinates in
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 */
public class PointCPDesign6D3 implements interfaceDesign6 {
	
	  /**
	   * Contains the current value of X.
	   */
	  private double x;
	  
	  /**
	   * Contains the current value of Y.
	   */
	  private double y;
	  
	  
	  /**
	   * Constructs a cartesian coordinate object.
	   */
	  public PointCPDesign6D3(double x, double y)
	  {
		  this.x = x;
		  this.y = y;
	  }
	  

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public double getRho() {
		// TODO Auto-generated method stub
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}

	@Override
	public double getTheta() {
		// TODO Auto-generated method stub
		return Math.toDegrees(Math.atan2(y, x));
	}
	
	  /**
	   * Returns a point in polar coordinates.
	   */
	  public PointCPDesign6D2 convertStorageToPolar()
	  {
		  return new PointCPDesign6D2(getRho(), getTheta());
	  }
		
	  /**
	   * Returns a point in cartesian coordinates.
	   */
	  public PointCPDesign6D3 convertStorageToCartesian()
	  {
		  return new PointCPDesign6D3(getX(), getY());
	  }

	  /**
	   * Calculates the distance in between two points using the Pythagorean
	   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	   *
	   * @param pointA The first point.
	   * @param pointB The second point.
	   * @return The distance between the two points.
	   */
	  public double getDistance(PointCPDesign6D3 pointB)
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
	  public PointCPDesign6D3 rotatePoint(double rotation)
	  {
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	        
	    return new PointCPDesign6D3(
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
		  return "Cartésien  (" + getX() + "," + getY() + ")" ;
	  }

}
