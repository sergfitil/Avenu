package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RealListUtils implements ListUtils {

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            list.add(s);

        }
        return list;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.addAll(data);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        return numbers;
    }
}
