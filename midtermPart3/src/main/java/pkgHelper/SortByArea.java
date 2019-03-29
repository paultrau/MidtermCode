package pkgHelper;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid> 
{
	public int compare(Cuboid a, Cuboid b) 
	{
		return (int) (a.area() - b.area()); 
	}
}