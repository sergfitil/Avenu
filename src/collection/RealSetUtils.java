package collection;

import java.util.*;

public class RealSetUtils implements SetUtils {

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        TreeSet<String> result = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        result.addAll(set2);
        for (Integer n : collection1) {
            result.add(n + "");
        }

        return result;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(val1);
        set.add(val2);
        set.add(val3);
        set.add(val4);
        set.add(val5);
        return set;
    }
}
