public class Track extends Dao {

    String title;
    String singer;

    public Track(String title, String singer)  {
        this.setTitle(title);
        this.setSinger(singer);
    }
    public String getTitle(){ return title; }

    public String getSinger() { return singer; }

    public void setTitle(String title) { this.title = title; }

    public void setSinger(String singer) { this.singer = singer; }

    public static void main (String[] args) {

        Track t = new Track ("the title", "the singer");
        t.insert();
    }

}


