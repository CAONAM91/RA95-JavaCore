public class Phone<K, V> extends MyMap {
    K contactAdress;
    V telephoneNum;

    public Phone(Object key, Object value) {
        super(key, value);
        this.contactAdress= (K) key;
        this.telephoneNum= (V) value;

    }


    public K getContactAdress() {
        return contactAdress;
    }

    public V getTelephoneNum() {
        return telephoneNum;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "contactAdress=" + contactAdress +
                ", telephoneNum=" + telephoneNum +
                '}';
    }
}
