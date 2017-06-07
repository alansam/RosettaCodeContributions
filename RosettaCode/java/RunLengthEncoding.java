
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthEncoding {

	public static String encode(String source) {
		StringBuffer dest = new StringBuffer();
		for (int i = 0; i < source.length(); i++) {
			int runLength = 1;
			while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
				runLength++;
				i++;
			}
			dest.append(runLength);
			dest.append(source.charAt(i));
		}

		return dest.toString();
	}

	public static String decode(String source) {
		StringBuffer dest = new StringBuffer();
		Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
		Matcher matcher = pattern.matcher(source);
		while (matcher.find()) {
			int number = Integer.parseInt(matcher.group());
			matcher.find();
			while (number-- != 0) {
				dest.append(matcher.group());
			}
		}

		return dest.toString();
	}

	public static void main(String[] args) {
		String[] samples = {
			"WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW",
			"1W1B1W1B1W1B1W1B1W1B1W1B1W1B",
		};

		for (String example : samples) {
			String result;
			System.out.printf("Original: %s%n", example);
			result = encode(example);
			System.out.printf("Encoded:  %s%n", result);
			result = decode(result);
			System.out.printf("Decoded:  %s%n", result);
			System.out.println();
		}

		return;
	}
}

