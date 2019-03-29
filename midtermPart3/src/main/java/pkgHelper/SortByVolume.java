package pkgHelper;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid> 
{
	public int compare(Cuboid a, Cuboid b) 
	{
		return (int) (a.volume() - b.volume()); 
	}
}