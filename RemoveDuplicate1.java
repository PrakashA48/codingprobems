package in.programming;

public class RemoveDuplicate1 {

	public static void main(String[] args) {
		String str = "  P ro gra mmi ng  ";
		String repeatedStr = str.replaceAll("\\s", "").toLowerCase();
		System.out.print( repeatedStr);
		
//		String trimmed = str.trim();
//		System.out.println(trimmed);
	}

}
