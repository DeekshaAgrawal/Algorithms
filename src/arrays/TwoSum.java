package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,2,7,11,15};
		int target = 9;
		int [] res = twoSum(arr, target);
		System.out.println(res[0]+" "+res[1]);

	}

	private static int[] twoSum(int[] arr, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] res = new int[2];
		for(int j = 0;j<arr.length; j++){
			
			Integer val = map.get(target-arr[j]);
			if(val == null)
			{
				map.put(arr[j], j);
			}else{
				res[0] = val;
				res[1] = j;
				break;
			}
			
		}
		
		return res;
	}

}
