public class Placement {
    private String cityName;
    private int umk;

    public Placement(String cityName, int umk) {
        this.cityName = cityName;
        this.umk = umk;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getUmk() {
        return umk;
    }

    public void setUmk(int umk) {
        this.umk = umk;
    }
}
