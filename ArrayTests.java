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
  public void testReverseInPlaceWithValues(){
    int[] Vals = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(Vals);
    assertArrayEquals(new int[]{2, 3, 4, 5, 1}, Vals);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedWithRandomValues(){
    int[] randomlist = {2 ,4 ,6 ,8, 10};
    assertArrayEquals(new int[]{10, 8, 6, 4, 2}, ArrayExamples.reversed(randomlist));
  }





}
