// 編號：CANDY-009
// 程式語言：Java
// 題目：移除網址中的錨點（Anchor）

class Candy09{
    public static void main(String[] args){
        String str1 = "Java.tw";
        String str2 = "Java.tw/#about";
        String str3 = "Java.tw/courses/?page=1#about";

        System.out.println(removeAnchor(str1)); // 印出 Java.tw
        System.out.println(removeAnchor(str2)); // 印出 Java.tw/
        System.out.println(removeAnchor(str3)); // 印出 Java.tw/courses/?page=1
    }

    static String removeAnchor(String url) {
        // 實作寫在這裡
        return result;
    }
}