package vs.test;

import java.util.ArrayList;

public class MyGenericHashMap<K, V> {

    int numOfBuckets = 10;
    ArrayList<GenericEntry<K, V>>[] buckets = null;

    public MyGenericHashMap() {
        buckets = new ArrayList[numOfBuckets];
        for (int i = 0; i < numOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public void put(Object key, Object value) {
        int bucketIndex = key.hashCode() % numOfBuckets;
        GenericEntry entry = new GenericEntry(key, value);
        if (buckets[bucketIndex].contains(entry)) {
            int index = buckets[bucketIndex].indexOf(entry);
            buckets[bucketIndex].set(index, entry);
        } else {
            buckets[bucketIndex].add(entry);
        }
    }

    public Object get(Object key) {
        int bucketIndex = key.hashCode() % numOfBuckets;
        GenericEntry entry = new GenericEntry(key, null);
        if (buckets[bucketIndex].contains(entry)) {
            int index = buckets[bucketIndex].indexOf(entry);
            return buckets[bucketIndex].get(index).value;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (ArrayList<GenericEntry<K, V>> list : buckets) {
            for (GenericEntry<K, V> entry : list) {
                builder.append(entry + " ");
            }
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        MyGenericHashMap map = new MyGenericHashMap();
        map.put("one", "one");
        map.put("two", "two");
        map.put("three", "three");
        map.put("one", "one-duplicate");

        System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));
        System.out.println(map.get("four"));

        System.out.println(map);
    }
}

class GenericEntry<K, V> {
    K key;
    V value;

    public GenericEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(GenericEntry.class)) {
            return false;
        }
        GenericEntry entry = (GenericEntry) obj;
        if (entry.key != null && entry.key.equals(this.key)) {
            return true;
        }
        return false;
    }

}