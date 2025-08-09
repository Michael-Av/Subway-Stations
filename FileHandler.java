import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

// String stop name - 5
// String borough - 6
// String daytime routes - 8
// double latitude - 10
// double longitude - 11

public class FileHandler {

  public static ArrayList<Station> getStationList(String inputFilename) {
    Scanner inputScanner = null;
    try {
      File inputFile = new File(inputFilename);
      inputScanner = new Scanner(inputFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    inputScanner.nextLine();

    ArrayList<Station> stationList = new ArrayList<Station>();

    while (inputScanner.hasNextLine()) {
      String[] station = inputScanner.nextLine().split(",");
      Station newStation = new Station(station[5], station[6], station[8].replace("SIR","s").replace(" ",""), Double.parseDouble(station[10]), Double.parseDouble(station[11]));
      stationList.add(newStation);
    }

    return stationList;
  }
}
