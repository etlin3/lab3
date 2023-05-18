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
  //Fails. Input {1, 2, 3, 4, 5} expects {5,4,3,2,1}, but returns {5, 4, 3, 4, 5}.
  public void testReverseInPlace5Values() {
    int[] input = {1, 2, 3, 4, 5};
    int[] expectedOutput = {5, 4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expectedOutput, input);
  }

/*

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed5Values() {
    //Fails. Input {1,2,3,4,5} expects {5,4,3,2,1} but returns {0,0,0,0,0}
    int[] input = {1, 2, 3, 4, 5};
    int[] expectedOutput = {5, 4, 3, 2, 1};
    ArrayExamples.reversed(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void averageWithoutLowest() {
    double[] input = {1.0, 1.0, 1.0, 3.0, 5.0};
    double[] input2 = {1.0};
    double[] input3 = {1.0, 5.0};
    double[] input4 = {9.0, 1.0, 2.0, 3.0, 6.0};
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input), 0.01);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2), 0.01);
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input3), 0.01);
    assertEquals(10.0, ArrayExamples.averageWithoutLowest(input), 0.01);
  }
  */
}