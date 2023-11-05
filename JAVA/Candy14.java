// 編號：CANDY-014
// 程式語言：Java
// 題目：把鄰近的重複值去除，但仍照原本的順序排序
// 範例："AAABBBDDDAABBBCC" -> ['A', 'B', 'D', 'A', 'B', 'C']

class Candy14{
    public static void main(String[] args){
        System.out.println(uniqueOrder("AABCC"));// [ 'A', 'B', 'C']
        System.out.println(uniqueOrder("AAABBBCCBCC"));// [ 'A', 'B', 'C', 'B', 'C']
        System.out.println(uniqueOrder(new int[]{1, 2, 1, 2, 1}));// [ 1, 2, 1, 2, 1 ]
        System.out.println(uniqueOrder(new int[]{1, 1, 1, 2, 2, 2, 1}));// [1, 2, 1]
    }

    static String uniqueOrder(Object sequence) {
        // 實作寫在這裡
        return result;
    }
}