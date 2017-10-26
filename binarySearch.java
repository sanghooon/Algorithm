import java.io.*;

public class binarySearch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Array Size: ");
    int size = input.nextInt();
    System.out.println();

    //Creates array [0,1,2,...,n]
    int[] numbers = new int[size];
    for(int i=0; i<numbers.length; i++) {
      numbers[i] = i;
    }
    // Counting linear search in nanoseconds
    long startTime = System.nanoTime();
    linearSearch(numbers, size);
    long endTime = System.nanoTime() - startTime;
    System.out.println("Linear search time: " +endTime);

    // Counting binary search in nanoseconds
    startTime = System.nanoTime();
    BinarySearch(numbers, size);
    endTime = System.nanoTime() - startTime;
    System.out.println("Binary search time: " +endTime);
  }

  public static boolean linearSearch(int[] a, int key){
	for(int i=0; i<a.length; i++) {
		if(a[i] == key) return true;
	}
	return false;
  }

  public static boolean BinarySearch(int[] a, int key) {
	int low = 0;
	int high = a.length - 1;
	int mid;
	while(low <= high) {
		mid = (low + high) / 2;
		// if mid point element is greater than the key, high becomes mid point
		if(a[mid] > key) {
			high = mid - 1;
		}
		// if mid point element is less than key, low becomes mid point
		else if(a[mid] < key) {
			low = mid + 1;
		} 
		// if mid point element is the key, return true
		else {
			return true;
		}
	}
	// there is no key in the array, so return false
	return false;
  }
}
