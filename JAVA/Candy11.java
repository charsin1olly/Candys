// 編號：CANDY-011
// 程式語言：Java
// 題目：找出一個數字陣列裡，出現奇數次數的數字
// 範例：[1, 1, 0]，`0` 只有出現 1 次
//      [5, 5, 8, 8, 8, 4, 4]，`8` 出現了 3  次

class Candy11{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 1, 2};
        int[] arr2 = new int[]{5, 4, 2, 1, 5, 4, 2, 10, 10};
        int[] arr3 = new int[]{0, 1, 0, 1, 0};
        int[] arr4 = new int[]{1, 1, 2, -2, 5, 2, -1, -2, 5};
        int[] arr5 = new int[]{20, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};

        System.out.println(findOddElm(arr1));// 印出 2
        System.out.println(findOddElm(arr2));// 印出 1
        System.out.println(findOddElm(arr3));// 印出 0
        System.out.println(findOddElm(arr4));// 印出 -1
        System.out.println(findOddElm(arr5));// 印出 5
    }

    static int findOddElm(int[] numbers) {
        // 實作寫在這裡
        return result;
    }
}