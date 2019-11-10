import java.util.*;
class Solution {
	 Map<String, String> phone = new HashMap<String, String>() {{
		    put("2", "abc");
		    put("3", "def");
		    put("4", "ghi");
		    put("5", "jkl");
		    put("6", "mno");
		    put("7", "pqrs");
		    put("8", "tuv");
		    put("9", "wxyz");
		  }};
		 
    public List<String> letterCombinations(String digits) {
    	String word = "";
    	List<String> resultList = new ArrayList<>();
    	backTrack(word, digits, resultList);
        return resultList;
    }
    public void backTrack(String word,String digitRest,List<String> list) {
		if (digitRest.length() <= 0) {
			if (word == "") {
				return;
			}
			list.add(word);
			return;
		}
		String digit = digitRest.substring(0,1);
		if (phone.containsKey(digit)) {
			for (int i = 0; i < phone.get(digit).length(); i++) {
				String charString = phone.get(digit).substring(i,i+1);
				backTrack(word + charString, digitRest.substring(1), list);
			}
		}
	}
}
