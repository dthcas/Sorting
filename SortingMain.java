import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SortingMain {
	
	public static boolean verifySort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generate a large array
		int array_size = 10000;
		int [] numbers = new int[array_size];
		int [] i_array = new int[array_size];
		int [] s_array = new int[array_size];
		String [] names = {"David","Warren","Zenin","Beckham","Alysha","Will","Alan"};
		long start_time;
		long end_time;
		double total_time_i=0;
		double total_time_s=0;
		
		// generate random numbers to fill in the array
		int temp;
		for(int i=0; i < numbers.length; i++) {
			temp = (int) (Math.random()*1000);
			numbers[i] = temp;
		}
		
		// Insertion sort loop for all names
		for(String n:names) {
			
			for(int j=0; j< numbers.length; j++) {
				i_array[j] = numbers[j];
				s_array[j] = numbers[j];
			}
			
			// Test insertion sort
			//System.out.println("Array before sort: ");
			//System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
			
			if(n.equals("Warren")) {
				
				System.out.println("Testing "+n+"'s insertion sort");
				
				start_time = System.nanoTime();
				try { Warren.insertionSort(i_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
				if(verifySort(i_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_i = (end_time - start_time)/1000000000.0;
				System.out.printf("INSERTION Sort Total time: %.6f seconds\n",total_time_i);
				
				System.out.println("\t~~~~~");
				
				System.out.println("Testing "+n+"'s selection sort");
				start_time = System.nanoTime();
				try { Warren.selectionSort(s_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(s_array).substring(0,50)+"...");
				if(verifySort(s_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_s = (end_time - start_time)/1000000000.0;
				System.out.printf("SELECTION Sort Total time: %.6f seconds\n\n",total_time_s);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			else if(n.equals("Alan")) {
				
				System.out.println("Testing "+n+"'s insertion sort");
				
				start_time = System.nanoTime();
				try { Alan.insertionSort(i_array); }
				catch(Exception e) { System.out.println("Error with Alan's code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
				if(verifySort(i_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_i = (end_time - start_time)/1000000000.0;
				System.out.printf("INSERTION Sort Total time: %.6f seconds\n",total_time_i);
				
				System.out.println("\t~~~~~");
				
				System.out.println("Testing "+n+"'s selection sort");
				start_time = System.nanoTime();
				try { Alan.selectionSort(s_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(s_array).substring(0,50)+"...");
				if(verifySort(s_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_s = (end_time - start_time)/1000000000.0;
				System.out.printf("SELECTION Sort Total time: %.6f seconds\n\n",total_time_s);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			else if(n.equals("Will")) {
				
				System.out.println("Testing "+n+"'s insertion sort");
				start_time = System.nanoTime();
				try { Will.insertionSort(i_array); }
				catch(Exception e) { System.out.println("Error with Alan's code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
				if(verifySort(i_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_i = (end_time - start_time)/1000000000.0;
				System.out.printf("INSERTION Sort Total time: %.6f seconds\n",total_time_i);
				
				System.out.println("\t~~~~~");
				
				System.out.println("Testing "+n+"'s selection sort");
				start_time = System.nanoTime();
				try { Will.selectionSort(s_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(s_array).substring(0,50)+"...");
				if(verifySort(s_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_s = (end_time - start_time)/1000000000.0;
				System.out.printf("SELECTION Sort Total time: %.6f seconds\n\n",total_time_s);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			else if(n.equals("Zenin")) {
				
				System.out.println("Testing "+n+"'s insertion sort");
				start_time = System.nanoTime();
				try { Zenin.insertionSort(i_array); }
				catch(Exception e) { System.out.println("Error with Alan's code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
				if(verifySort(i_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_i = (end_time - start_time)/1000000000.0;
				System.out.printf("INSERTION Sort Total time: %.6f seconds\n",total_time_i);
				
				System.out.println("\t~~~~~");
				
				System.out.println("Testing "+n+"'s selection sort");
				start_time = System.nanoTime();
				try { Zenin.selectionSort(s_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(s_array).substring(0,50)+"...");
				if(verifySort(s_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_s = (end_time - start_time)/1000000000.0;
				System.out.printf("SELECTION Sort Total time: %.6f seconds\n\n",total_time_s);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			else if(n.equals("Alysha")) {
				
				System.out.println("Testing "+n+"'s insertion sort");
				start_time = System.nanoTime();
				try { Alysha.insertionSort(i_array); }
				catch(Exception e) { System.out.println("Error with Alan's code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
				if(verifySort(i_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_i = (end_time - start_time)/1000000000.0;
				System.out.printf("INSERTION Sort Total time: %.6f seconds\n",total_time_i);
				
				System.out.println("\t~~~~~");
				
				System.out.println("Testing "+n+"'s selection sort");
				start_time = System.nanoTime();
				try { Alysha.selectionSort(s_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(s_array).substring(0,50)+"...");
				if(verifySort(s_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_s = (end_time - start_time)/1000000000.0;
				System.out.printf("SELECTION Sort Total time: %.6f seconds\n\n",total_time_s);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			else if(n.equals("Beckham")) {
				
				System.out.println("Testing "+n+"'s insertion sort");
				start_time = System.nanoTime();
				try { Beckham.insertionSort(i_array); }
				catch(Exception e) { System.out.println("Error with Alan's code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
				if(verifySort(i_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_i = (end_time - start_time)/1000000000.0;
				System.out.printf("INSERTION Sort Total time: %.6f seconds\n",total_time_i);
				
				System.out.println("\t~~~~~");
				
				System.out.println("Testing "+n+"'s selection sort");
				start_time = System.nanoTime();
				try { Beckham.selectionSort(s_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(s_array).substring(0,50)+"...");
				if(verifySort(s_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_s = (end_time - start_time)/1000000000.0;
				System.out.printf("SELECTION Sort Total time: %.6f seconds\n\n",total_time_s);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			else if(n.equals("David")) {
				
				System.out.println("Testing "+n+"'s insertion sort");
				start_time = System.nanoTime();
				try { David.insertionSort(i_array); }
				catch(Exception e) { System.out.println("Error with Alan's code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(i_array).substring(0,50)+"...");
				if(verifySort(i_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_i = (end_time - start_time)/1000000000.0;
				System.out.printf("INSERTION Sort Total time: %.6f seconds\n",total_time_i);
				
				System.out.println("\t~~~~~");
				
				System.out.println("Testing "+n+"'s selection sort");
				start_time = System.nanoTime();
				try { David.selectionSort(s_array); }
				catch(Exception e) { System.out.println("Error with the code: "+e.toString()); }
				end_time = System.nanoTime();
				
				System.out.println("Array after sort: ");
				System.out.println(Arrays.toString(s_array).substring(0,50)+"...");
				if(verifySort(s_array)) System.out.println("Array is sorted");
				else System.out.println("Array is NOT sorted");
				total_time_s = (end_time - start_time)/1000000000.0;
				System.out.printf("SELECTION Sort Total time: %.6f seconds\n\n",total_time_s);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			
			
		
		}		
		
	}

}
