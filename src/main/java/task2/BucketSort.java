package task2;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static int[] sort(int[] arr) {

        int countOfBuckets = arr.length;

        ArrayList<Integer>[] buckets = new ArrayList[countOfBuckets];

        for (int i = 0; i < countOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        double max = 0;
        for (int el : arr) {
            max = Math.max(max, el);
        }

        for (int k : arr) {
            int index = (int) Math.floor(k * (countOfBuckets - 1) / max);
            buckets[index].add(k);
        }

        for (int i = 0; i < countOfBuckets; i++) {
            Collections.sort((buckets[i]));
        }

        int counter = 0;

        for (int i = 0; i < countOfBuckets; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[counter++] = buckets[i].get(j);
            }
        }
        return arr;
    }
}
