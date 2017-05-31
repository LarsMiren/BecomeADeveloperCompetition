import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dmytro Laukhin on 31.05.17.
 */
public class FileHelper {

    private String filePath;
    private Scanner scanner;

    public FileHelper(String filePath){
        this.filePath = filePath;
        init();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private void init(){
        try {
            scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Long> readAll(){
        ArrayList<Long> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()){
            arrayList.add(readNextLine());
        }
        scanner.close();
        return arrayList;
    }

    private long readNextLine(){
        return new Long(scanner.nextLine());
    }
}
