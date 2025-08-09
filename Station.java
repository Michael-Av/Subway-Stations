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

    private String fixBorough(){
        String boroughName = "";
        switch (borough) {
            case "Q": boroughName = "Queens"; break;
            case "M": boroughName = "Manhattan"; break;
            case "Bk": boroughName = "Brooklyn"; break;
            case "Bx": boroughName = "Bronx"; break;
            case "SI": boroughName = "Staten Island"; break;
        } 

        return boroughName;
    }

    public String toString(){
        String s = "Station Name: " + name + "\n";
        s +=       "Borough:      " + fixBorough() + "\n";
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

    public double approxDist(Station other){
        int r = 6357; // In miles

        double latDiff = 6.28 * Math.abs(this.getLat() - other.getLat()) / 360.0;
        double longDiff = 6.28 * Math.abs(this.getLong() - other.getLong()) / 360.0;

        double dist = Math.sqrt(Math.pow(latDiff * r, 2) + Math.pow(longDiff * r, 2));
        return dist;
    }

}