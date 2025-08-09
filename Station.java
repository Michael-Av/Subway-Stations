public class Station {
    private String name;
    private String borough;
    private String lines;
    private double latitude;
    private double longitude;

    public Station(String name, String borough, String lines, double lat, double longit){
        this.name = name;
        this.borough = borough;
        this.lines = lines;
        this.latitude = lat;
        this.longitude = longit;
    }

    public String toString(){
        String s = "Station Name: " + name + "\n";
        s +=       "Borough:      " + borough + "\n";
        s +=       "Train Lines:  " + lines;

        return s;
    }

    public String getName(){
        return this.name;
    }

    public double getLat(){
        return this.latitude;
    }

    public double getLong(){
        return this.longitude;
    }

    public void approxDist(Station other){

    }

}