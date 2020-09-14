package collection;

import java.util.ArrayList;
import java.util.Collection;

import java.util.HashSet;
import java.util.Set;

public class RealCollecnionUtils implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;

    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> integers= new ArrayList<>();
        for (Integer num:a){
            if(b.contains(num)){
                integers.add(num);

            }

        }
        for (Integer num:b){
            if(a.contains(num)){
                integers.add(num);

            }

        }
        return integers;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> crossing = new HashSet<>();
        crossing.addAll(a);
        crossing.addAll(b);
        return crossing;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> integers= new HashSet<>();
        for (Integer num:a){
            if(b.contains(num)){
                integers.add(num);

            }

        }
        for (Integer num:b){
            if(a.contains(num)){
                integers.add(num);

            }

        }
        return integers;

    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> integers= new HashSet<>();
        for (Integer num:a){
            if(!b.contains(num)){
                integers.add(num);

            }

        }
        for (Integer num:b){
            if(!a.contains(num)){
                integers.add(num);

            }

        }
        return integers;

    }
}
