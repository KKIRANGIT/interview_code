package codinginterview.easy;

import java.util.HashMap;

public class _0003_LongestSubstring {

	public int lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int start = 0, max = 0, index = 0, temp = 0;
		for (int i = 0; i < s.length() && i >= start; i++) {
			if (!map.containsKey(s.charAt(i))) {
				temp += 1;
			} else {
				index = map.get(s.charAt(i));
				if (index > start) {
					start = index + 1;
					temp = i - index;
				}
				if((index+1) < start)
					temp+=1;
			}
			if (max < temp)
				max = temp;
			map.put(s.charAt(i), i);
		}

		if (max == 0)
			return s.length();
		else
			return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_0003_LongestSubstring obj = new _0003_LongestSubstring();
		System.out.println(obj.lengthOfLongestSubstring("TMMZUXT"));
		System.out.println(obj.lengthOfLongestSubstring("PWWKEW"));
		System.out.println(obj.lengthOfLongestSubstring("aab"));
		System.out.println(obj.lengthOfLongestSubstring("VASANTHA"));

	}

}
