package multyMap;

import java.util.*;

public class MultyMapImpl<K, V> implements MultiMap<K, V> {
    private HashMap<K, List<V>> hashMap = new HashMap<>();


    @Override
    public int countValues(K key) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        Collection<List<V>> vallues = hashMap.values();
        for (List<V> list : vallues) {
            if (list.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (hashMap.containsKey(key)) {
            List<V> vallues = hashMap.get(key);
            vallues.add(value);
            hashMap.put(key, vallues);
            return vallues.get(vallues.size()-2);
        } else {
            ArrayList<V> vallues = new ArrayList<>();
            vallues.add(value);
            hashMap.put(key, vallues);

        }
        return null;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
