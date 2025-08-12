public class Student {
    private static int idAuto = 0;
    private int id;
    private String name;

    public Student(String name) {
        id = ++idAuto;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id la :" + id + ", Ten la :" + this.name;

    }


}
