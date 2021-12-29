import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVTest {

    @Test
    public void testCSVSplit(){
        List<String> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("test/Book1.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                for (String val : values) {
                    records.add(val);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String r : records){
            System.out.println(r);
        }
    }
}
