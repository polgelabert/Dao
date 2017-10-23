public class Singer extends Dao{

    String name;
    String band;
    int birthYear;

    public Singer(String name, String band, int birthYear)  {
        this.setName(name);
        this.setBand(band);
        this.setBirthYear(birthYear);
    }

    public String getName() { return name; }

    public String getBand() { return band; }

    public int getBirthYear() { return birthYear; }

    public void setName(String name) { this.name = name; }

    public void setBand(String band) { this.band = band; }

    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public static void main (String[] args) {

        Singer s = new Singer ("the title", "the singer", 1960);
        s.insert();
    }
}

