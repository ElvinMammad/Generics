public class Pair <K,V>{
    //Pair<K, V>
    //
    //Generic Pair<K, V> sinfi yaz:
    //
    //getKey(), getValue()
    //toString() metodu (açar = dəyər) formatında qaytarsın

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" + key + "=" +
                 value
               + "}" ;
    }
}
