package in.programming;

public class SortAlphabatical {

	public static void main(String[] args) {
		String str = "Mother";
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		char temp;
		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		System.out.println("\nAfter sorting alphabatically in ascending :");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		System.out.println("\nAfter sorting alphabatically in Descending :");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
