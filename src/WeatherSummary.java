
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner scan = new Scanner(System.in);
        List<Double> tempList = new ArrayList<>();
        
        while (scan.hasNextDouble()) {
            tempList.add(scan.nextDouble());
            
        }
        Double max = Collections.max(tempList);
        Double min = Collections.min(tempList);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }  
}
