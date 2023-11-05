// 編號：CANDY-021
// 程式語言：Java
// 題目：實作 Stack 資料結構

class Candy21{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(123);
        stack.push(456);
        stack.push();
        System.out.println(stack.size);// 印出 2

        Object item = stack.pop() //取出元素
        System.out.println(item);// 印出 456

        stack.pop(); //繼續取出元素
        System.out.println(stack.size);// 印出 0
    }


}

class Stack{
    //實作在這裡
}