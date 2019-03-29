package pkgHelper;

public class Rectangle extends Shape implements Comparable<Rectangle>
{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int w,int l)
	{
		if (w<=0 || l<=0)
		{
			throw new IllegalArgumentException();
		}
		else {
		iWidth = w;
		iLength = l;}
	}
	
	public int compareTo(Rectangle compareRectangle)
	{
		
		int compareArea = (int)compareRectangle.area();
		
		//ascending order
		return ((int)this.area() - compareArea);
		
		//descending order
		//return compareArea - this.area();
		
	}	
	
	public double area() 
	{
		return this.iWidth * this.iLength;
	}

	public double perimeter() 
	{
		return ((2 * this.iLength)+(2 * this.iLength));
	}

	public int getiWidth() 
	{
		return this.iWidth;
	}

	public void setiWidth(int iWidth) 
	{
		this.iWidth = iWidth;
	}

	public int getiLength() 
	{
		return iLength;
	}

	public void setiLength(int iLength) 
	{
		this.iLength = iLength;
	}
	
}


