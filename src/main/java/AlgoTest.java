package main.java;
import java.io.BufferedReader;
import static org.junit.Assert.assertFalse;
import java.io.InputStreamReader;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AlgoTest {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	SortDemoData data = new SortDemoData();

    
//      Test Sequence 1
   
    @Test
    public final void TestEmptyArray() {
    	
    	System.out.println("Sorting an empty array");
    	data.initializeArray("0");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());  
    	System.out.println(outputBuf);
    	Assert.assertTrue(outputBuf.toString().equals(""));
    }
    
   
//      Test Sequence 2
     
    @Test
    public final void TestOneElementArray() {
    	System.out.println("Sorting array with one element in array");
    	data.initializeArray("1 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("1 "));
    }

   //	Test Sequence 3
    @Test
    public final void TestTwoElementAscendingOrderArray() {
    	System.out.println("Sorting array with 2 elements in ascending order");
    	data.initializeArray("0 1 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("0 1 "));
    }

  // 	Test Sequence 4
    @Test
    public final void TestTwoElementDescendingOrderArray() {    	
     	System.out.println("Sorting array with 2 elements in descending order");
    	data.initializeArray("1 0 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("0 1 "));
    }
    
  // 	Test Sequence 5
    
    @Test
    public final void TestThreeElementDescendingOrderArray() {
        
    	System.out.println("Sorting array with 3 elements in descending order");
    	data.initializeArray("2 1 0 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
    }
    
   // 	Test Sequence 6
    
    @Test
    public final void TestThreeElementAscendingOrderArray() {
    	 
    	System.out.println("Sorting array with 3 elements in ascending order");
    	data.initializeArray("0 1 2 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
    }

    //  Test Sequence 7
    @Test @Ignore
    public final void TestThreeElementArrayWithDuplicateElements() {
    	 
    	System.out.println("Sorting array of 3 elements having duplicate elements");
    	data.initializeArray("1 2 1 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("1 2 1 "));
    }
    
   //  Test Sequence 8
    @Test
    public final void TestAllDuplicateArray() {
    	 
    	System.out.println("Sorting array with all duplicate elements");
    	data.initializeArray("1 1 1 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("1 1 1 "));
    }

    
//  Test Sequence 1
    
@Test
public final void TestEmptyArraySelectionSort() {
	
	System.out.println("Sorting an empty array");
	data.initializeArray("0");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());  
	System.out.println(outputBuf);
	Assert.assertTrue(outputBuf.toString().equals(""));
}


//  Test Sequence 2
 
@Test
public final void TestOneElementArraySelectionSort() {
	System.out.println("Sorting array with one element in array");
	data.initializeArray("1 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//	Test Sequence 3
@Test
public final void TestTwoElementAscendingOrderArraySelectionSort() {
	System.out.println("Sorting array with 2 elements in ascending order");
	data.initializeArray("0 1 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
	Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

// 	Test Sequence 4
@Test
public final void TestTwoElementDescendingOrderArraySelectionSort() {    	
 	System.out.println("Sorting array with 2 elements in descending order");
	data.initializeArray("1 0 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

// 	Test Sequence 5

@Test
public final void TestThreeElementDescendingOrderArraySelectionSort() {
    
	System.out.println("Sorting array with 3 elements in descending order");
	data.initializeArray("2 1 0 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

// 	Test Sequence 6

@Test
public final void TestThreeElementAscendingOrderArraySelectionSort() {
	 
	System.out.println("Sorting array with 3 elements in ascending order");
	data.initializeArray("0 1 2 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//  Test Sequence 7
@Test @Ignore
public final void TestThreeElementArrayWithDuplicateElementsSelectionSort() {
	 
	System.out.println("Sorting array of 3 elements having duplicate elements");
	data.initializeArray("1 2 1 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("1 2 1 "));
}

//  Test Sequence 8
@Test
public final void TestAllDuplicateArraySelectionSort() {
	 
	System.out.println("Sorting array with all duplicate elements");
	data.initializeArray("1 1 1 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("1 1 1 "));
}

//Test Sequence 1

@Test
public final void TestEmptyArrayInsertionSort() {

System.out.println("Sorting an empty array");
data.initializeArray("0");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());  
System.out.println(outputBuf);
Assert.assertTrue(outputBuf.toString().equals(""));
}


//Test Sequence 2

@Test
public final void TestOneElementArrayInsertionSort() {
System.out.println("Sorting array with one element in array");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Sequence 3
@Test
public final void TestTwoElementAscendingOrderArrayInsertionSort() {
System.out.println("Sorting array with 2 elements in ascending order");
data.initializeArray("0 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 4
@Test
public final void TestTwoElementDescendingOrderArrayInsertionSort() {    	
	System.out.println("Sorting array with 2 elements in descending order");
data.initializeArray("1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 5

@Test
public final void TestThreeElementDescendingOrderArrayInsertionSort() {

System.out.println("Sorting array with 3 elements in descending order");
data.initializeArray("2 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//	Test Sequence 6

@Test
public final void TestThreeElementAscendingOrderArrayInsertionSort() {
 
System.out.println("Sorting array with 3 elements in ascending order");
data.initializeArray("0 1 2 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//Test Sequence 7
@Test @Ignore
public final void TestThreeElementArrayWithDuplicateElementsInsertionSort() {
 
System.out.println("Sorting array of 3 elements having duplicate elements");
data.initializeArray("1 2 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 2 1 "));
}

//Test Sequence 8
@Test
public final void TestAllDuplicateArrayInsertionSort() {
 
System.out.println("Sorting array with all duplicate elements");
data.initializeArray("1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 "));
}

//Test Sequence 1

@Test @Ignore
public final void TestEmptyArrayMergeSort() {

System.out.println("Sorting an empty array");
data.initializeArray("0");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());  
System.out.println(outputBuf);
Assert.assertTrue(outputBuf.toString().equals(""));
}


//Test Sequence 2

@Test
public final void TestOneElementArrayMergeSort() {
System.out.println("Sorting array with one element in array");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Sequence 3
@Test
public final void TestTwoElementAscendingOrderArrayMergeSort() {
System.out.println("Sorting array with 2 elements in ascending order");
data.initializeArray("0 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 4
@Test
public final void TestTwoElementDescendingOrderArrayMergeSort() {    	
	System.out.println("Sorting array with 2 elements in descending order");
data.initializeArray("1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 5

@Test
public final void TestThreeElementDescendingOrderArrayMergeSort() {

System.out.println("Sorting array with 3 elements in descending order");
data.initializeArray("2 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//	Test Sequence 6

@Test
public final void TestThreeElementAscendingOrderArrayMergeSort() {

System.out.println("Sorting array with 3 elements in ascending order");
data.initializeArray("0 1 2 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//Test Sequence 7
@Test @Ignore
public final void TestThreeElementArrayWithDuplicateElementsMergeSort() {

System.out.println("Sorting array of 3 elements having duplicate elements");
data.initializeArray("1 2 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 2 1 "));
}

//Test Sequence 8
@Test
public final void TestAllDuplicateArrayMergeSort() {

System.out.println("Sorting array with all duplicate elements");
data.initializeArray("1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 "));
}


//Test Sequence 1

@Test @Ignore
public final void TestEmptyArrayQuickSort() {

System.out.println("Sorting an empty array");
data.initializeArray("0");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());  
System.out.println(outputBuf);
Assert.assertTrue(outputBuf.toString().equals(""));
}


//Test Sequence 2

@Test
public final void TestOneElementArrayQuickSort() {
System.out.println("Sorting array with one element in array");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Sequence 3
@Test
public final void TestTwoElementAscendingOrderArrayQuickSort() {
System.out.println("Sorting array with 2 elements in ascending order");
data.initializeArray("0 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 4
@Test
public final void TestTwoElementDescendingOrderArrayQuickSort() {    	
	System.out.println("Sorting array with 2 elements in descending order");
data.initializeArray("1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 5

@Test
public final void TestThreeElementDescendingOrderArrayQuickSort() {

System.out.println("Sorting array with 3 elements in descending order");
data.initializeArray("2 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//	Test Sequence 6

@Test
public final void TestThreeElementAscendingOrderArrayQuickSort() {

System.out.println("Sorting array with 3 elements in ascending order");
data.initializeArray("0 1 2 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//Test Sequence 7
@Test @Ignore
public final void TestThreeElementArrayWithDuplicateElementsQuickSort() {

System.out.println("Sorting array of 3 elements having duplicate elements");
data.initializeArray("1 2 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 2 1 "));
}

//Test Sequence 8
@Test
public final void TestAllDuplicateArrayQuickSort() {

System.out.println("Sorting array with all duplicate elements");
data.initializeArray("1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 "));
}

//Test Sequence 1

@Test
public final void TestEmptyArrayHeapSort() {

System.out.println("Sorting an empty array");
data.initializeArray("0");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());  
System.out.println(outputBuf);
Assert.assertTrue(outputBuf.toString().equals(""));
}


//Test Sequence 2

@Test
public final void TestOneElementArrayHeapSort() {
System.out.println("Sorting array with one element in array");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Sequence 3
@Test
public final void TestTwoElementAscendingOrderArrayHeapSort() {
System.out.println("Sorting array with 2 elements in ascending order");
data.initializeArray("0 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 4
@Test
public final void TestTwoElementDescendingOrderArrayHeapSort() {    	
	System.out.println("Sorting array with 2 elements in descending order");
data.initializeArray("1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 "));
}

//	Test Sequence 5

@Test
public final void TestThreeElementDescendingOrderArrayHeapSort() {

System.out.println("Sorting array with 3 elements in descending order");
data.initializeArray("2 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//	Test Sequence 6

@Test
public final void TestThreeElementAscendingOrderArrayHeapSort() {

System.out.println("Sorting array with 3 elements in ascending order");
data.initializeArray("0 1 2 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 2 "));
}

//Test Sequence 7
@Test @Ignore
public final void TestThreeElementArrayWithDuplicateElementsHeapSort() {

System.out.println("Sorting array of 3 elements having duplicate elements");
data.initializeArray("1 2 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 2 1 "));
}

//Test Sequence 8
@Test
public final void TestAllDuplicateArrayHeapSort() {

System.out.println("Sorting array with all duplicate elements");
data.initializeArray("1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 "));
}

}