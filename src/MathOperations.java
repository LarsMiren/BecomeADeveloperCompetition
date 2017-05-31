import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmytro Laukhin on 31.05.17.
 */
public class MathOperations {
    private List<Long> list = new ArrayList<>();

    public List<Long> getList() {
        return list;
    }

    public void setList(ArrayList<Long> list) {
        this.list = list;
    }

    public long getMax(){
        long maxVal = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if( maxVal < list.get(i)) maxVal = list.get(i);
        }
        return maxVal;
    }

    public long getMin(){
        long minVal = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if( minVal > list.get(i)) minVal = list.get(i);
        }
        return minVal;
    }

    public double getAverage(){
        double average = 0;
        for (Long aList : list) {
            average += aList;
        }
        return average/list.size();
    }

    public double getMedian(){
        list.sort(Long::compare);
        if( list.size() % 2 == 0 ) return getMedianForEven();
        else return getMedianForOdd();
    }

    private double getMedianForOdd(){
        return list.get(
                (list.size() - 1) / 2 + 1
        );
    }

    private double getMedianForEven(){
        return 0.5*(
                list.get(list.size() / 2) +
                list.get(list.size() / 2 + 1)
        );
    }
}
