// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page ??
// JUnit tests for NumZero.java 

package group2;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NumZeroTest
{
   @Test public void nonZeroFirstElement() 
   {
      int arr[] = {2, 7, 0};
      assertEquals("Nonzero in first element", 1, NumZero.numZero(arr));
   }

   @Test public void fixedNonZeroFirstElement() {
      int arr[] = {0, 0, 0, 0};
      assertEquals("Incorrect value for all 0 args.", 4, NumZero.numZero(arr));
   }
   
}