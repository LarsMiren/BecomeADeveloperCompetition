/**
 * Created by Dmytro Laukhin on 31.05.17.
 */
public class Runner {
    public static void main(String[] args) {
        FileHelper fileHelper = new FileHelper("res/10m.txt");
        MathOperations mathOperations = new MathOperations();
        mathOperations.setList(fileHelper.readAll());
        System.out.println("Max value = " + mathOperations.getMax());
        System.out.println("Min value = " + mathOperations.getMin());
        System.out.println("Averange = " + mathOperations.getAverage());
        System.out.println("Median = " + mathOperations.getMedian());
    }
}
