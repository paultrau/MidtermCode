package pkgHelper;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.*;

import org.junit.Test;

public class shapeTester 
{

// CUBOID TESTS ****************************************************************************************

	@Test
	public void cuboidArea_test() 
	{
		ArrayList<Cuboid> listMod = new ArrayList<Cuboid>();
		ArrayList<Cuboid> listControl = new ArrayList<Cuboid>();
		
		Cuboid cub1 = new Cuboid(3,3,3);
		Cuboid cub2 = new Cuboid(2,2,2);
		Cuboid cub3 = new Cuboid(1,1,1);
		
		listMod.add(cub1);
		listMod.add(cub2);
		listMod.add(cub3);
		
		listControl.add(cub3);
		listControl.add(cub2);
		listControl.add(cub1);

		SortByArea sorter = new SortByArea();
		Collections.sort(listMod, sorter);
		System.out.println("postmod: "+listMod);
		System.out.println("expected: "+listControl);
		
		System.out.println(listMod.equals(listControl));
		assertEquals(listMod,listControl);
		
	}
	
	@Test
	public void cuboidVolumeSort_test() 
	{
		ArrayList<Cuboid> listMod = new ArrayList<Cuboid>();
		ArrayList<Cuboid> listControl = new ArrayList<Cuboid>();
		
		Cuboid cub1 = new Cuboid(3,3,3);
		Cuboid cub2 = new Cuboid(2,2,2);
		Cuboid cub3 = new Cuboid(1,1,1);
		
		listMod.add(cub1);
		listMod.add(cub2);
		listMod.add(cub3);
		
		listControl.add(cub3);
		listControl.add(cub2);
		listControl.add(cub1);

		SortByVolume sorter = new SortByVolume();
		Collections.sort(listMod, sorter);
		System.out.println("postmod: "+listMod);
		System.out.println("expected: "+listControl);
		
		System.out.println(listMod.equals(listControl));
		assertEquals(listMod,listControl); 
		
	}

	@Test
	public void getiDepth_test()
	{
		Cuboid myCub = new Cuboid(5,4,6);
		int bExpected = 6;
		int bActual = myCub.getiDepth();
		assertEquals(bExpected,bActual);
	}
	
	@Test
	public void setiDepth_test()
	{
		Cuboid myCub = new Cuboid(5,4,6);
		int bExpected = 3;
		myCub.setiDepth(3);
		int bActual = myCub.getiDepth();
		assertEquals(bExpected,bActual);
	}
	
	@Test
	public void vol_test()
	{
		Cuboid myCub = new Cuboid(2,2,2);
		double bExpected = 8.0;
		double bActual = myCub.volume();
		System.out.println("(VOULME)cuboid 2,2,2 This should be: " +bExpected+"\nIt really is: " + bExpected);
		assertEquals(bExpected,bActual,8.0);
	}

	@Test
	public void area_test_cuboid()
	{
		Cuboid myCub = new Cuboid(2,2,2);
		double bExpected = 24.0;
		double bActual = myCub.area();
		System.out.println("(AREA)cuboid=2,2,2 This should be: " +bExpected+"\nIt really is: " + bExpected);
		assertEquals(bExpected,bActual,24.0);
	}
	
	@Test
	public void test_fail_perimeter() 
	{
		
	  boolean isThrown = false;
	  try 
	  {
		  Cuboid myCub = new Cuboid(2,2,2);
		  myCub.perimeter();
	  } 
	  catch (UnsupportedOperationException e) 
	  {
		  isThrown = true;
	  }

	  assertTrue(isThrown);
	}
	
//Rectangle Tests **************************************************************************************************************************************************************************				
	@Test
	public void recAreaSort_test() 
	{
		ArrayList<Rectangle> listMod = new ArrayList<Rectangle>();
		ArrayList<Rectangle> listControl = new ArrayList<Rectangle>();
		
		Rectangle rec1 = new Rectangle(3,3);
		Rectangle rec2 = new Rectangle(2,2);
		Rectangle rec3 = new Rectangle(1,1);	
		
		listMod.add(rec1);
		listMod.add(rec2);
		listMod.add(rec3);
		
		listControl.add(rec3);
		listControl.add(rec2);
		listControl.add(rec1);

		Collections.sort(listMod);
		System.out.println("postmod: "+listMod);
		System.out.println("expected: "+listControl);
		
		System.out.println(listMod.equals(listControl));
		assertEquals(listMod,listControl); 
		
	}
	
	
	@Test
	public void construct_test()
	{
		
		Rectangle myRec = new Rectangle(5,5);
		Rectangle myRec2 = new Rectangle(5,5);
		boolean areTheSame = false;
		if ((myRec.getiLength()==myRec2.getiLength())||(myRec2.getiWidth()==myRec2.getiWidth()))
		{
			areTheSame=true;
		}
		assertTrue(areTheSame);
	}

	
	@Test
	public void getiWidth_test()
	{
		Rectangle myRec = new Rectangle(5,5);
		int bExpected = 5;
		int bActual = myRec.getiWidth();
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void setiLength_test()
	{
		Rectangle myRec = new Rectangle(5,5);
		int bExpected = 3;
		myRec.setiLength(3);
		int bActual = myRec.getiLength();
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void setiWidth_test()
	{
		Rectangle myRec = new Rectangle(5,5);
		int bExpected = 3;
		myRec.setiWidth(3);
		int bActual = myRec.getiWidth();
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void getiLength_test()
	{
		Rectangle myRec = new Rectangle(5,5);
		int bExpected = 5;
		int bActual = myRec.getiLength();
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void area_test_rectangle()
	{
		Rectangle myRec = new Rectangle(5,5);
		double bExpected = 25.0;
		double bActual = myRec.area();
		assertEquals(bExpected, bActual,25.0);
	}
	
	@Test
	public void perimeter_test1()
	{
		Rectangle myRec = new Rectangle(5,5);
		double bExpected = 20.0;
		double bActual = myRec.perimeter();
		assertEquals(bExpected,bActual,20.0);
	}

	@Test
	public void test_illegal_constructor_args1() 
	{
	  boolean thrown = false;
	  try 
	  {
	   @SuppressWarnings("unused")
	   Rectangle myRec = new Rectangle(0,5);
	  } 
	  catch (IllegalArgumentException e) 
	  {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
}