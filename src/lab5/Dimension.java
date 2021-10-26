package lab5;

public class Dimension {
    private String lungime;
    private String inaltime;

    public Dimension(String lungime, String inaltime) {
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public String getLungime() {
        return lungime;
    }

    public void setLungime(String lungime) {
        this.lungime = lungime;
    }

    public String getInaltime() {
        return inaltime;
    }

    public void setInaltime(String inaltime) {
        this.inaltime = inaltime;
    }
}
