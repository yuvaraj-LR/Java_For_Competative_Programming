package CodingNinja.Maps.Lectures;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int size;
    int numBuckets;

    public Map() {
        numBuckets = 20;
        buckets = new ArrayList<>();

        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hc = key.hashCode();
        return hc % numBuckets;
    }

    private void reHash() {
        ArrayList<MapNode<K,V>>  temp = buckets;
        buckets = new ArrayList<>();
        numBuckets *= 2;
        size = 0;

        for (int i = 0; i < numBuckets ; i++) {
            buckets.add(null);
        }

        for (MapNode<K, V> head : temp) {
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }

    public double loadFactor() {
        return (1.0 * size) / numBuckets;
    }
    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);

        MapNode<K, V> head = buckets.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = buckets.get(bucketIndex);

        MapNode<K, V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
        size++;

        double loafFactor = (1.0 * size) / numBuckets;
        if(loafFactor > 0.7) {
            reHash();
        }


    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);

        while (head != null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    public V delete(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;

        while (head != null) {
            if(head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    buckets.set(bucketIndex, head.next);
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        
        return null;
    }
}
