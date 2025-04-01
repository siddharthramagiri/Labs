import java.util.ArrayList;
import java.util.List;

public class SubSetSums {

	public static void sum(int[] nums, int index, int currentSum, List<Integer> result) {
		if (index == nums.length) {
			result.add(currentSum);
			return;
		}
		sum(nums, index + 1, currentSum + nums[index], result);
		sum(nums, index + 1, currentSum, result);
	}

	public static List<Integer> SubsetSum(int[] nums) {
		List<Integer> result = new ArrayList<>();
		sum(nums, 0, 0, result);
		return result;
	}

	public static void main(String args[]) {
		int[] nums = { 1, 2, 3 };
		List<Integer> s = SubsetSum(nums);
		System.out.println("Subset Sum: " + s);
	}
}