package ku.cs.models;

import java.util.UUID;

public class Anime {
    private String id;
    private String title;
    private String desc;
    private String type;
    private String genre;
    private String started;
    private String finished;

    public Anime(String title, String desc, String type, String genre, String started, String finished) {
        this.id = getRandomString();
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.genre = genre;
        this.started = started;
        this.finished = finished;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }

    public String getStarted() {
        return started;
    }

    public String getFinished() {
        return finished;
    }

    public String getTitleType ()
    {
        return title + " " + type;
    }

    @Override
    public String toString() {
        return  "{ " + " id: '" + id +  '\'' +
                ", title: '" + title + '\'' +
                ", type: '" + type + '\'' +
                ", genre: '" + genre + '\'' +
                ", started: '" + started + '\'' +
                ", finished: '" + finished + '\'' +
                ", genre: '" + genre + '\''
                + " }";
    }

    private String getRandomString()
    {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
