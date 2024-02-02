import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() { 
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }

  @Test
   public void testReversed1() {
    int[] input1 = {2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2}, ArrayExamples.reversed(input1));
  }

  @SuppressWarnings("deprecation")
  @Test
  public void testAverage() { 
    double[] input1 = {0};
    double[] input2 = {2,5,6,7};

    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1),0.001);
    assertEquals(6.0, ArrayExamples.averageWithoutLowest(input2), 0.001);
  }



}
