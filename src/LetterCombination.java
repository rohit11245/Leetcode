import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
	    static Map<Integer, List<String>> digitMap = new HashMap<Integer, List<String>>();
	    
	    LetterCombination() {
	        digitMap.put(2, Arrays.asList(new String[] {"a", "b", "c"}));
	        digitMap.put(3, Arrays.asList(new String[] {"d", "e", "f"}));
	        digitMap.put(4, Arrays.asList(new String[] {"g", "h", "i"}));
	        digitMap.put(5, Arrays.asList(new String[] {"j", "k", "l"}));
	        digitMap.put(6, Arrays.asList(new String[] {"m", "n", "o"}));
	        digitMap.put(7, Arrays.asList(new String[] {"p", "q", "r", "s"}));
	        digitMap.put(8, Arrays.asList(new String[] {"t", "u", "v"}));
	        digitMap.put(9, Arrays.asList(new String[] {"w", "x", "y", "z"}));
	    }
	    
	    public  List<String> letterCombinations(String digits) {
	        List<String> result = new ArrayList<String>();
	        if(digits.length() == 0)
	            return result;
	        if(digits.length() == 1)
	            return digitMap.get(digits.charAt(0) - '0');
	        List<String> intermediate = letterCombinations(digits.substring(1, digits.length()));
	        for(String first : digitMap.get(digits.charAt(0) - '0'))
	            for(String rest : intermediate)
	                result.add(first + rest);
	        return result;
	    }
	    public static void main(String args[])
	    {
	    List<String> st= new LetterCombination().letterCombinations("234");
	    System.out.println(st.toString());
	    }
	}
