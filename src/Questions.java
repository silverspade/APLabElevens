import java.util.List;

import Activity7.ElevensBoard;

public class Questions {
	public static void main(String[] args) {
//		System.out.println(flip());
//		System.out.println(flip());
//		System.out.println(flip());
		
//		int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7};
//		int[] nums2 = new int[] {2, 3, 4, 5, 6, 7, 1};
//		System.out.println(arePermutations(nums1, nums2));
	}
	
	//FOR ACTIVITY 2
	public static String flip() {
		double decision = Math.random();
		if (decision < 0.3333333) {
			return "tails";
		} else {
			return "heads";
		}
	}
	
	//FOR ACTIVITY 2
	public static boolean arePermutations(int[] nums1, int[] nums2) {
		for(int i = 0; i < nums1.length; i++){
	        boolean test1 = false;
	        for(int j = 0; j < nums2.length; j++){
	            if(nums1[i] == nums2[j]){
	                test1 = true;
	            }
	        }
	        if(test1){
	            return true;
	        }

	    }
	    return false;
	}
	
	//FOR ACTIVITY 7
//	public static void printCards(ElevensBoard board) {
//		List<Integer> cIndexes = board.cardIndexes();
//		for (int i = 0; i < cIndexes.size(); i++) {
//			System.out.println(board.cards[i].toString());
//		}
//	}
}