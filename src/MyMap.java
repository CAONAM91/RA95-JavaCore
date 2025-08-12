public class MyMap<K, V> {
//    Question 6: K & V generic
//    Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
//    Tạo các method
//    GetValue()
//    getKey ()


    private K key;
    private V values;

    public MyMap(K key, V value) {
        this.key = key;
        this.values = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return values;
    }

    @Override
    public java.lang.String toString() {
        return "MyMap{" +
                "key=" + key +
                ", values=" + values +
                '}';
    }
}
