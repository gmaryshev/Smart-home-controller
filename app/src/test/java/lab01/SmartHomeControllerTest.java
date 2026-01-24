package lab01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmartHomeControllerTest {
    @Test
    void sayHi() {
        System.out.println("Hello from the test.");
    }

    // A sorted array
    @Test
    void sortedAAA() {
        int[] someArray = {1,2,3,4};       // arrange
        boolean someArraySorted = ArrayUtils.isSorted(someArray);  // act
        assertTrue(someArraySorted);       // assert
    }

    // Empty arrays are sorted by definition
    @Test
    void sortedEmpty() {
        int[] someArray = {};       // arrange
        boolean someArraySorted = ArrayUtils.isSorted(someArray);  // act
        assertTrue(someArraySorted);       // assert
    }

    // Arrays of one element are sorted by definition
    @Test
    void sortedSingleElement() {
        int[] someArray = {1};       // arrange
        boolean someArraySorted = ArrayUtils.isSorted(someArray);  // act
        assertTrue(someArraySorted);       // assert
    }

    // A partially sorted array (some elements are in sorted order, but some aren't)
    @Test
    void sortedPartialSort() {
        int[] someArray = {1,3,2,4};       // arrange
        boolean someArraySorted = ArrayUtils.isSorted(someArray);  // act
        assertFalse(someArraySorted);       // assert
    }
    // A completely unsorted array (no elements are in sorted order)
     @Test
    void unsorted() {
        int[] someArray = {1,0,4,5,2};       // arrange
        boolean someArraySorted = ArrayUtils.isSorted(someArray);  // act
        assertFalse(someArraySorted);       // assert
    }
    // An array with duplicate values (may be sorted or not depending on the values chosen)
    @Test
    void duplicates() {
        int[] someArray = {1,1,2,2,3,3};       // arrange
        boolean someArraySorted = ArrayUtils.isSorted(someArray);  // act
        assertTrue(someArraySorted);       // assert
    }
}



