package pkgHelper;


public class Cuboid extends Rectangle 
{
	private int iDepth;
	
	public Cuboid(int w,int l,int d)
	{
		super(w,l);
		iDepth = d;
	}
	
	public double perimeter()
	{
		throw new UnsupportedOperationException();
	}
	
	public double volume()
	{
		return (this.getiWidth() * this.getiLength() * this.iDepth);
	}
	
	public double area()
	{
		double faces1 = 2*(this.getiWidth() * this.getiLength());
		double faces2 = 2*(this.iDepth * this.getiLength());
		double faces3 = 2*(this.getiWidth() * this.iDepth);
		return (faces1 + faces2 + faces3);
	}
	
	public int getiDepth()
	{
		return this.iDepth;
	}
	public void setiDepth(int d)
	{
		this.iDepth = d;
	}
}
