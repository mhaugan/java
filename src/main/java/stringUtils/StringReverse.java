package stringUtils;

public class StringReverse {
  private static String input = "hello world!";
  private static String polyString = "agnes i senga|agnes i senga";

  public static void main(String[] args) {
//    System.out.println(reversed(input));
    System.out.println(palindrome(polyString));
  }

  private static boolean palindrome(String input) {
    int end = input.length() -1;

    for(int i = 0; i < input.length(); i++) {
      if (input.charAt(i) != input.charAt(end)) {
        System.out.println(input.charAt(i));
        System.out.println(input.charAt(end));
        return false;
      }
//      System.out.println("start: " + input.charAt(i) + " end: " + input.charAt(end));
      end--;
    }
    return true;
  }

  private static String reversed(String input) {
    System.out.println(input.length());
    StringBuilder builder = new StringBuilder();
    for (int i = input.length() -1; i >= 0; i--) {
      builder.append(input.charAt(i));
    }
    return builder.toString();
  }

}
