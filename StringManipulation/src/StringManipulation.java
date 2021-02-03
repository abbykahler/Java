public class StringManipulation {
	public String trimAndConcat(String string1, String string2) {
		String result = string1.trim() + string2.trim();
		return result;
	}
	public Integer getIndexOrNull(String str, char chr) {
		if(str.indexOf(chr) >= 0) {
			return str.indexOf(chr);
		}
		else {
			return null;
		}
	}
	
	public Integer getIndexOrNull(String string3, String string4) {
		if(string3.indexOf(string4) >0) {
			return string3.indexOf(string4);
		}
		else {
			return null;
		}
	}
	public String concatSubstring(String string5, int one, int two, String string6) {
		return string5.substring(one,two).concat(string6);
	}
	
}