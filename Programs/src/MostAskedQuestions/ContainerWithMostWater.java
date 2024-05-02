package MostAskedQuestions;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(Solution(height));
	}

	private static int Solution(int[] height) {
		
		int left = 0;
		int right = height.length-1;
		int maxArea = 0;
		
		while(left<right) {
			int area = Math.min(height[left], height[right])*Math.abs(left-right);
			maxArea = Math.max(maxArea, area);
			
			if(height[left]<height[right]) {
				left++;
			}else {
				right--;
			}
		}
		
		return maxArea;
		
	}
}
