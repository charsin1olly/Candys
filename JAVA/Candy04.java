// 編號：CANDY-004
// 程式語言：Java
// 題目：完成函數的內容，把傳進去的秒數變成平常人類看的懂的時間格式

class Candy04{
  public static void main(String[] args){
      System.out.println(humanReadableTimer(0)); // 印出 00:00:00
      System.out.println(humanReadableTimer(59));// 印出 00:00:59
      System.out.println(humanReadableTimer(60)); // 印出 00:01:00
      System.out.println(humanReadableTimer(90)); // 印出 00:01:30
      System.out.println(humanReadableTimer(3599));  // 印出 00:59:59
      System.out.println(humanReadableTimer(3600));// 印出 01:00:00
      System.out.println(humanReadableTimer(45296)); // 印出 12:34:56
      System.out.println(humanReadableTimer(86399));// 印出 23:59:59
      System.out.println(humanReadableTimer(86400));// 印出 24:00:00
      System.out.println(humanReadableTimer(359999)); // 印出 99:59:59
  }

  static String humanReadableTimer(int second){
      // 實作寫在這裡
      return result;
  }
}