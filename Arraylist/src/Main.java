import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
//        Question 1: List
//        Tạo 1 student có property id, name (trong đó có 3 student có name trùng nhau, id sẽ là auto increment)
//
//        Khai báo 1 ArrayList students, sau đó
//        In ra tổng số phần tử của students
//        Lấy phần tử thứ 4 của students
//        In ra phần tử đầu và phần tử cuối của students
//        Thêm 1 phần tử vào vị trí đầu của students
//        Thêm 1 phần tử vào vị trí cuối của students


        Student stu1 = new Student("Nguyen Van A");
        Student stu2 = new Student("Nguyen Van A");
        Student stu3 = new Student("Nguyen Van A");
        Student stu4 = new Student("Nguyen Van B");
        Student stu5 = new Student("Nguyen Van B");

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);

        System.out.println(students.toArray().length);
        // System.out.println(students.get(4));
        System.out.println(students.getFirst());
        System.out.println(students.getLast());
//        Thêm 1 phần tử vào vị trí đầu của students
//        Thêm 1 phần tử vào vị trí cuối của students
        students.add(0, new Student("Tran Van Đầu"));
        students.add(students.toArray().length, new Student("Nguyen Van Cuối"));
        System.out.println(students.toString());
        //Đảo ngược vị trí của students

        Collections.reverse(students);
        System.out.println(students.toString());

//        Tạo 1 method tìm kiếm student theo id
//        Tạo 1 method tìm kiếm student theo name


        // ex01();
//        System.out.println(searchStudentById(1));
//        System.out.println(searchStudentByName("Nguyen Van A"));
        System.out.println("<===========================================>");
        printSameNameGroups(students);
        deleteStuID2();
        deleteStuID2();
        System.out.println(students.toString());

        //Question 3 (Optional): Set
        //Tạo 1 student có property id, name
        //Tạo 1 danh sách có chứa name của các student không trùng nhau.

        System.out.println("<===========================================>");
        HashSet<String> hashsetStudent = new HashSet<>();

        for (Student stu : students) {
            hashsetStudent.add(stu.getName());
        }
        System.out.println(hashsetStudent);
        //Sắp xếp theo name và in ra set đó
        TreeSet<String> treeSet = new TreeSet<>(hashsetStudent);
        System.out.println("Sap xe the treeset :" + treeSet);
        // Để thay thế 1 object ta có thể tạo 1 map tên là students có key = id của student , value là name của student

        HashMap<Integer, String> hashMapStudent = new HashMap<>();
        for (Student stu : students) {
            hashMapStudent.put(stu.getId(), stu.getName());
        }
        System.out.println(hashMapStudent);

//        Thực hiện các chức năng sau:
//        In ra các key của students
        for (Integer key : hashMapStudent.keySet()) {
            System.out.println("Id la :" + key);
        }
        ;


//        In ra value của students

        for (String string : hashMapStudent.values()) {
            System.out.println("Value cua Student :" + string);
        }
//        In ra danh sách students được sắp xếp theo tên của student
        System.out.println("------==========================-----------------");
        students.sort(Comparator.comparing(Student::getName));
        students.forEach(System.out::println);


        TreeMap<String, List<Student>> treeMapStudent = new TreeMap<>();
        for (Student stu : students) {

            treeMapStudent.computeIfAbsent(stu.getName(), v -> new ArrayList<>()).add(stu);
        }
        System.out.println(treeMapStudent);
//        Chuyển đổi map students sang set
        Set<Map.Entry<String, List<Student>>> entrySetMap = treeMapStudent.entrySet();
        entrySetMap.stream().map(Map.Entry::getValue).forEach(System.out::println);
    }


    public static void ex01() {
        Stack<String> stack = new Stack<>();
        stack.push("Nguyen Van Nam");
        stack.push("Nguyen Van Huyen");
        stack.push("Tran Van Nam");
        stack.push("Nguyen Van A");
        Iterator<String> iteratorStu = stack.iterator();
        while (iteratorStu.hasNext()) {
            System.out.println(stack.pop());
        }

    }

    static void reverse(ArrayList<Student> array) {
        Collections.reverse(Collections.singletonList(array));


    }

    public static Student searchStudentById(int id) {
        for (Student stu : students) {
            if (stu.getId() == id) {
                return stu;
            }
        }
        return null;
    }

    public static List<Student> searchStudentByName(String name) {
        ArrayList<Student> studentName = new ArrayList<>();
        for (Student stu : students) {
            if (stu.getName().equals(name)) {
                studentName.add(stu);

            }
        }
        return studentName;
    }

//    Tạo 1 method để in ra các student có trùng tên

    public static void printSameNameGroups(List<Student> students) {
        Map<String, List<Student>> mapByName = new HashMap<>();

        // Gom sinh viên theo tên
        for (Student student : students) {
            mapByName
                    .computeIfAbsent(student.getName(), k -> new ArrayList<>())
                    .add(student);
        }

        // In ra nhóm tên trùng
        System.out.println("Các nhóm sinh viên trùng tên:");
        for (Map.Entry<String, List<Student>> entry : mapByName.entrySet()) {
            List<Student> group = entry.getValue();
            if (group.size() > 1) { // chỉ in nhóm có hơn 1 sinh viên
                System.out.println("Tên: " + entry.getKey());
                for (Student s : group) {
                    System.out.println(" - " + s);
                }
                System.out.println();
            }
        }
    }

    // Xóa name của student có id = 2;
    public static void deleteStuID2() {
        if (students.removeIf(a -> a.getId() == 2)) {
            System.out.println("Xoa thanh cong id =2");
        } else {
            System.out.println("Ko tim thay id =2");
        }


    }


}