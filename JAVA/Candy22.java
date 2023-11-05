// 編號：CANDY-022
// 程式語言：Java
// 題目：實作 Queue 資料結構

class Candy22{
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(123);
        queue.enqueue(456);
        queue.enqueue();
        System.out.println(queue.length); //印出2

        Object item = queue.dequeue() // 取出元素
        System.out.println(item); //印出123
        queue.dequeue() // 繼續取出元素
        System.out.println(queue.length); //印出8
    }
}

class Queue {
    // 實作寫在這裡
}