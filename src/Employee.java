public class Employee<T> {
    private int id;
    private String name;
    private T[] salaries;

    public void print() {
        System.out.println("id la :" + this.id + "Ten la :" + this.name + "Luong la :" + salaries);
    }

    public Employee(int id, String name, T[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }
}
