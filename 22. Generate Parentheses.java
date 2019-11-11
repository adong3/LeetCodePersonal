import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
    	List<String> resultList = new ArrayList<String>();
    	backTrack("", n*2, 0, n, resultList);
        return resultList;
    }
    
    public void backTrack(String word,int restLength,int difference,int n,List<String> list) {
		if (restLength <= 0) {
			list.add(word);
			
			return;
		}
		if (difference == 0) {
			backTrack(word + "(", restLength - 1, difference + 1, n, list);
		} else if (difference >0 && difference < n && restLength > difference) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					backTrack(word + "(", restLength - 1, difference + 1, n, list);
				}
				if (j==1) {
					backTrack(word + ")", restLength - 1, difference - 1, n, list);
				}
			}
		} else if (difference >= n || difference >= restLength){
			backTrack(word + ")", restLength - 1, difference - 1, n, list);
		}
	}
	
}
