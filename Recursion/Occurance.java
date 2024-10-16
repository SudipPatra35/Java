public class Occurance {

  public static int first = -1;
  public static int last = -1;

  static void OccuranceOf(String str, int index, char element) {
    if (index == str.length()) {
      System.out.println("First occurance of " + element + " is " + first);
      System.out.println("Last occurance of " + element + " is " + last);
      return;
    }
    if (str.charAt(index) == element) {
      if (first == -1) {
        first = index;
      } else {
        last = index;
      }
    }
    OccuranceOf(str, index + 1, element);
  }

  public static void main(String[] args) {
    String str = "abaacdaefaah";
    OccuranceOf(str, 0, 'a');
  }
}
