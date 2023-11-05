// 編號：CANDY-010
// 程式語言：Java
// 題目：把數字以 10 進位展開式呈現，數字均為大於 0 的正整數
// 範例：9527 變成 "1000 x 9 + 100 x 5 + 10 x 2 + 7"

class Candy10{
    public static void main(String[] args){
        System.out.println(expandedForm(8)); // 印出 8
        System.out.println(expandedForm(25));// 印出 10 x 2 + 5
        System.out.println(expandedForm(148));// 印出 100 x 1 + 10 x 4 + 8
        System.out.println(expandedForm(1450));// 印出 1000 x 1 + 100 x 4 + 10 x 5
        System.out.println(expandedForm(60308));// 印出 10000 x 6 + 100 x 3 + 8
    }

    static String expandedForm(int num) {
    // 實作寫在這裡
    return result;
    }
}