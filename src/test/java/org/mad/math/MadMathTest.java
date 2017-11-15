package org.mad.math;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class MadMathTest
{
	@Test
	public void testGetIntegerSumFromList()
	{
		List<Integer> i = getTestIntegerList();
		assertTrue(MadMath.getIntSumFromList(i) == 13);
	}

	@Test
	public void testGetIntegerSumFromArray()
	{
		int[] i = getTestIntegerArray();
		assertTrue(MadMath.getSumFromArray(i) == 13);
	}

	@Test
	public void testGetIntegerAverageFromList()
	{
		List<Integer> i = getTestIntegerList();
		assertTrue(MadMath.getIntAverageFromList(i) == 4);
	}

	@Test
	public void testGetIntegerAverageFromArray()
	{
		int[] i = getTestIntegerArray();
		assertTrue(MadMath.getAverageFromArray(i) == 4);
	}
	
	@Test
	public void testGetSumDoubleFromList()
	{
		List<Double> d = this.getTestDoubleList();
		assertTrue(MadMath.getDoubleSumFromList(d) == 14.9d);
	}
	
	@Test
	public void testGetSumDoubleFromArray()
	{
		double[] d = this.getTestDoubleArray();
		assertTrue(MadMath.getSumFromArray(d) == 14.9d);
	}
	
	@Test
	public void testGetAverageDoubleFromList()
	{
		List<Double> d = this.getTestDoubleList();
		assertTrue(MadMath.getAverageFromList(d) == 4.966666666666667d);
	}
	
	@Test
	public void testGetAverageDoubleFromArray()
	{
		double[] d = this.getTestDoubleArray();
		assertTrue(MadMath.getAverageFromArray(d) == 4.966666666666667d);
	}
	
	@Test
	public void testRoundDouble()
	{
		double d = 1.666;
		double x = MadMath.roundDouble(d, 2, MadMath.ROUND_UP);
		assertTrue(x == 1.67d);		
	}
	
	private int[] getTestIntegerArray()
	{
		int[] i = new int[3];
		i[0] = 0;
		i[1] = 4;
		i[2] = 9;
		return i;
	}
	
	private List<Integer> getTestIntegerList()
	{
		List<Integer> i = new ArrayList<Integer>();
		i.add(0);
		i.add(4);
		i.add(9);
		return i;
	}
	
	public List<Double> getTestDoubleList()
	{
		List<Double> d = new ArrayList<Double>();
		d.add(1.1d);
		d.add(4.5d);
		d.add(9.3d);
		return d;		
	}
	
	public double[] getTestDoubleArray()
	{
		double[] d = new double[3];
		d[0] = 1.1d;
		d[1] = 4.5d;
		d[2] = 9.3d;
		return d;
	}
	
	@Test
	public void testGetCircleArea()
	{
		assertTrue(MadMath.getCircleArea(3d) == 28.274333882308138d);
	}

	@Test
	public void testGetCircumferenceUsingRadius()
	{
		assertTrue(MadMath.getCircleCircumferenceUsingRadius(3d) == 18.84955592153876);
	}

	@Test
	public void testGetCircumferenceUsingDiameter()
	{
		assertTrue(MadMath.getCircleCircumferenceUsingDiameter(3d) == 9.42477796076938d);
	}
	
	@Test
	public void testPrimeFactor()
	{
		List<Integer> list = MadMath.primeFactor(32);
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 2);
		assertTrue(list.get(2) == 2);
	}
	
	@Test
	public void testGreatestCommonFactor()
	{
		int i = MadMath.greatestCommonFactor(18, 24);
		assertTrue(i == 6);
	}
	
	@Test
	public void testLeastCommonMultiple()
	{
		int i = MadMath.leastCommonMultiple(15, 12);
		assertTrue(i == 60);
	}
	
	@Test
	public void testGreatestCommonFactorList()
	{
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(100);
		testList.add(50);
		testList.add(10);
		int i = MadMath.greatestCommonFactor(testList);
		assertTrue(i == 10);
	}
	
	@Test
	public void testFactor()
	{
		List<Integer> list = MadMath.factor(30);
		assertTrue(list.get(0).intValue() == 1);
		assertTrue(list.get(1).intValue() == 2);
		assertTrue(list.get(2).intValue() == 3);
	}
	
	@Test
	public void testFib()
	{
		int[] f = MadMath.fibonacci(10);
		assertTrue(f[0] == 1);
		assertTrue(f[1] == 1);
		assertTrue(f[2] == 2);
		assertTrue(f[3] == 3);
		assertTrue(f[4] == 5);
		assertTrue(f[5] == 8);
		assertTrue(f[6] == 13);
		assertTrue(f[7] == 21);
		assertTrue(f[8] == 34);
		assertTrue(f[9] == 55);
	}
	
	@Test
	public void testGetCoordinateDistance()
	{
		assertTrue(MadMath.getCoordinateDistance(2d, 1d, 4d, 3d) == 1.4142135623730951d);
	}

	@Test
	@Ignore
	public void testGetMidpoint()
	{
		System.out.println(MadMath.getMidpoint(2d, 3d, 4d, 1d));
	}

	@Test
	public void testGetSlopeNoRound()
	{
		assertTrue(MadMath.getSlopeNoRound(2d, 3d, 1d, 4d) == 3.0d);
	}

	@Test
	public void testGetSlopeRounded()
	{
		assertTrue(MadMath.getSlopeRounded(2d, 3d, 1d, 4d) == 3.0d);
	}

	@Test
	@Ignore
	public void testGetSlopeAsArray()
	{
		System.out.println(MadMath.getSlopeAsArray(2d, 3d, 1d, 4d));
	}
	
	@Test 
	public void testIsPrime()
	{
		assertTrue(MadMath.isPrime(3));
		assertFalse(MadMath.isPrime(4));
	}
	
	@Test
	public void testIsEven()
	{
		assertTrue(MadMath.isEven(2));
		assertFalse(MadMath.isEven(1));
	}
	
	@Test
	public void testIsOdd()
	{
		assertTrue(MadMath.isOdd(3));
		assertFalse(MadMath.isOdd(2));
	}
	
	@Test
	public void getAreaTest()
	{
		assertTrue(MadMath.getPrismArea(2d, 2d, 3d) == 32.0d);
	}
	
	@Test
	public void getVolumeTest()
	{
		assertTrue(MadMath.getPrismVolume(2d, 2d, 3d) == 12.0d);
	}
	
	@Test
	public void testPythagoreanTheoremFindC()
	{
		assertTrue(MadMath.pythagoreanTheoremFindC(3.0d, 4.0d) == 5.0d);
	}
	
	@Test
	public void testPythagoreanTheoremFindA()
	{
		assertTrue(MadMath.pythagoreanTheoremFindAorB(3.0d, 5.0d) == 4.0d);
	}
	
	@Test
	public void testGetArea()
	{
		assertTrue(MadMath.getTriangleArea(2d, 3d) == 3.0d);
	}
	
	@Test
	public void testQuadraticEquationIntegers()
	{
		Integer[] results = MadMath.quadraticEquation(1, 2, -3);
		assertTrue(results[0].equals(new Integer(1)));
		assertTrue(results[1].equals(new Integer(-3)));
		
		Integer[] results2 = MadMath.quadraticEquation(1, 3, -3);
		assertTrue(results2[0].equals(new Integer(0)));
		assertTrue(results2[1].equals(new Integer(-3)));
	}
	
	@Test
	public void testQuadraticEquationDoubles()
	{
		Double[] results = MadMath.quadraticEquation(1d, 2d, -3d);
		assertTrue(results[0].equals(new Double(1)));
		assertTrue(results[1].equals(new Double(-3)));
		
		Double[] results2 = MadMath.quadraticEquation(1d, 3d, -3d);
		assertTrue(results2[0].equals(new Double(0.7912878474779199)));
		assertTrue(results2[1].equals(new Double(-3.79128784747792)));
	}
	
	@Test
	public void testEEqualsmc2()
	{
		double result = MadMath.eEqualsmc2(.111d);
		assertTrue(result == 9.976182483978676E15);
	}
}
