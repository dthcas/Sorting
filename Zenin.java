
public class Zenin {

	public static void insertionSort(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			int j=i;
			int y=nums[i];
			while(j>0&&y<nums[j-1]) {
				
				nums[j]=nums[j-1];
				
				j--;
				//System.out.println("c");
			}
			nums[j]=y;
		}
		
		
	}
	
	public static void selectionSort(int[] nums) {
		int small=nums[0];
		for(int i=1;i<nums.length;i++) {
			small=nums[i];
			int index=i;
			for(int j=i-1;j<nums.length;j++) {
				
				if(nums[j]<small) {
					small=nums[j];
					index=j;
					
				}
			}
			nums[index]=nums[i-1];
			nums[i-1]=small;
		}
		
		
	}
	
}
