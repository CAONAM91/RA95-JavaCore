//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student<Integer> studentint = new Student<>(1, "Nguyen Van A");
        Student<Float> studentFloat = new Student<>(1.5f, "Nguyen Van B");
        Student<Double> studentDouble = new Student<>(1.999d, "Nguyen Van C");
        System.out.println(studentint);
        System.out.println(studentFloat);
        System.out.println(studentDouble);


        print("4.0");

        //    Tạo 1 array int, 1 array float, 1 array long, 1 array double
        Integer[] arrInt = {1, 2, 3};
        Float[] arrFloat = {1.1f, 2.2f, 3.3f, 4.4f};
        Long[] arrLong = {999999999L, 8888888L};
        Double[] arrDouble = {1.2258, 2.3366, 3.9999, 4.8888};
        printArray(arrInt);
        printArray(arrFloat);
        printArray(arrLong);
        printArray(arrDouble);



//        Hãy tạo chương trình demo với Employee có salaries là datatype int
//        Hãy tạo chương trình demo với Employee có salaries là datatype float
//        Hãy tạo chương trình demo với Employee có salaries là datatype double

        Integer[] salaries1 = {50000, 45000, 60000};
        Float[] salaries2 = {50000.594f, 45000.366f, 60000.365f};
        Double[] salaries3 = {50000.365, 45000.3455, 60000.365};


        Employee<Integer> emInt = new Employee<>(1, "Nguyen Van A", salaries1);
        Employee<Float> emFloat = new Employee<>(1, "Nguyen Van A", salaries2);
        Employee<Double> emDouble = new Employee<>(1, "Nguyen Van A", salaries3);


//    Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên và value là tên của sinh viên đó
        System.out.println("=================MyMap==========================");
        MyMap<Integer, String> map = new MyMap<>(studentint.getId(), studentint.getName());
        System.out.println(map.toString());


//        K & V generic
//        Tạo 1 class có tên là Phone, lưu dữ liệu theo dạng key, value (extends MyMap)
//
//        key là email
//        key là số thứ tự
//        key là tên của người sử dụng

        Phone<String, Integer> emailPhone = new Phone<>("NguyenVanA@gmail.com", "09123456789");
        Phone<Integer, Integer> sttPhone = new Phone<>(1, "09123456789");
        Phone<String, Integer> namePhone = new Phone<>("Nguyen Van A", "09123456789");
        System.out.println("================Phone===============");
        System.out.println(emailPhone);
        System.out.println(sttPhone);
        System.out.println(namePhone);

    }

    //        Question 2: T generic (method)
//         Tạo method để in ra thông tin nhập vào (parameter)
//         (parameter có thể là họ và tên, hoặc student, hoặc int)
//
//        Gợi ý: tạo method print(T a) và cài đặt system out (a) ra
//
//        Demo chương trình với print(student), print(4), print(4.0)

    public static <T> void print(T a) {
        System.out.println(a);

    }
//    Question 4: E generic

    //    Tạo 1 method có parameter là array và in ra các số trong array đó
    public static <T> void printArray(T[] arr) {
        for (T e : arr) {
            System.out.println(e);
        }
    }


}
