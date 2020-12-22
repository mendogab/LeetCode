package main.Java;

public class ReverseInteger {
  public static void main(String[] args) {
    System.out.println(reverseInt(
        -2147483412));
  }

  public static int reverseInt(int x) {
    int y = 0;
    while(x != 0) {
      y *= 10;
      y += x % 10;
      x /= 10;
      if (Integer.MAX_VALUE / 10 < y || Integer.MIN_VALUE / 10 > y) {
        return 0;
      }
      System.out.println(y);
    }
    return y;
  }
}
