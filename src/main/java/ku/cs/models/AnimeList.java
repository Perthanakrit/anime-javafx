package ku.cs.models;

import java.util.ArrayList;

public class AnimeList {
    private ArrayList<Anime> animeList;

    public AnimeList() {
        animeList = new ArrayList<>();
    }

    public void addAnime(Anime anime) {
        animeList.add(anime);
    }

    public ArrayList<Anime> getAnimes()
    {
        return animeList;
    }

    public ArrayList<String> getAnimesWithTitle()
    {
        ArrayList<String> animesTitle = new ArrayList<>();

        for (Anime anime : animeList) {
            animesTitle.add(anime.getTitle());
        }

        return animesTitle;
    }
}
