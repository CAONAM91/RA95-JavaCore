public class Staff<K, V> extends MyMap {
    public Staff(Object key, Object value) {
        super(key, value);
    }
    //    Tạo 1 class có tên là Staff, lưu dữ liệu theo dạng key, value (extends MyMap)
    //    Với key là id của Staff (ID có thể là int, long)
    //    Với value là tên của Staff
    K id;
    V name;

    public K getId() {
        return id;
    }

    public V getName() {
        return name;
    }
}
