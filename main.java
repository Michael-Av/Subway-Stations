import java.util.ArrayList;

public class main {

  static String numberOfNumbersName = "MTA_Subway_Stations_20250809.csv";
  static String alphabet = "abcdefghijklmnopqrstuvwxyz";
  static int[] scrabblePoints = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

  public static void main(String[] args) {
    ArrayList<Station> stationList = FileHandler.getStationList(numberOfNumbersName);
    for (int i = 0; i < stationList.size(); i++) {
      System.out.println(stationList.get(i));
      System.out.println("averagePointVal: " + getAveragePointValue(stationList.get(i).getName()));
      System.out.println("-----------");
    }
  }

  public static int getPointValue(String word) {
    int points = 0;
    for (int i = 0; i < word.length(); i++) {
      int index = alphabet.indexOf(Character.toLowerCase(word.charAt(i)));
      if (index != -1) points += scrabblePoints[index];
    }
    return points;
  }

  public static int getScrabbleLength(String word) { // including only Scrabble valid letters
    int length = 0;
    for (int i = 0; i < word.length(); i++) {
      int index = alphabet.indexOf(Character.toLowerCase(word.charAt(i)));
      if (index != -1) length++;
    }
    return length;
  }

  public static double getAveragePointValue(String word) {
    int totalPoints = getPointValue(word);
    int ScrabbleLength = getScrabbleLength(word);
    return (double) totalPoints / ScrabbleLength;
  }
}
