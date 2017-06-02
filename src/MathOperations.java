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
        list.sort(Long::compare);
    }

    public long getMax(){
        return list.get(list.size()-1);
    }

    public long getMin(){
        return list.get(0);
    }

    public double getAverage(){
        double average = 0;
        for (Long aList : list) {
            average += aList;
        }
        return average/list.size();
    }

    public double getMedian(){
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
