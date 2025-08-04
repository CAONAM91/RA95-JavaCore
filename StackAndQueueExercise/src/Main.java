//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Khai báo 1 danh sách lưu các tên học sinh tới tham dự phỏng vấn, thứ tự tới của các học sinh như sau:
//        Nguyễn Văn Nam, Nguyễn Văn Huyên, Trần Văn Nam,
//        Nguyễn Văn A
//        Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ muộn nhất tới sớm nhất (gợi ý dùng Stack)
//        Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự sớm nhất tới muộn nhất (gợi ý dùng Queue)

        Stack stack = new Stack();
        stack.push("Nguyễn Văn Nam");
        stack.push("Nguyễn Văn Huyên");
        stack.push("Trần Văn Nam");
        stack.push("Nguyễn Văn A");
        System.out.println(stack.print());
        for (int i = 0; i < stack.stack.length; i++) {
            System.out.print("Nguoi den muon thu " + (i + 1) + " la :");
            System.out.println(stack.pop());
        }


        System.out.println("=======================");
        Queue queue = new Queue(4);
        queue.enQueue("Nguyễn Văn Nam");
        queue.enQueue("Nguyễn Văn Huyên");
        queue.enQueue("Trần Văn Nam");
        queue.enQueue("Nguyễn Văn A");
        System.out.println(queue.print());
        for (int i = 0; i < queue.queue.length; i++) {
            System.out.print("Nguoi den som thu " + (i + 1) + " la :");
            System.out.println(queue.deQueue());


        }
    }
}