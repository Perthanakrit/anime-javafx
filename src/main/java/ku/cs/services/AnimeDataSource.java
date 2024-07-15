package ku.cs.services;

import ku.cs.models.Anime;
import ku.cs.models.AnimeList;
import ku.cs.models.Student;

public class AnimeDataSource {
    public AnimeList readData() {
        AnimeList animeList = new AnimeList();
        animeList.addAnime(new Anime("Naruto", "A ninja's journey", "TV", "Action", "2002", "2017"));
        animeList.addAnime(new Anime("One Piece", "Pirate adventures", "TV", "Adventure", "1999", "Ongoing"));
        animeList.addAnime(new Anime("Attack on Titan", "Humans vs Titans", "TV", "Action", "2013", "2023"));
        animeList.addAnime(new Anime("Death Note", "Supernatural thriller", "TV", "Mystery", "2006", "2007"));
        animeList.addAnime(new Anime("My Hero Academia", "Superheroes", "TV", "Action", "2016", "Ongoing"));
        animeList.addAnime(new Anime("Fullmetal Alchemist", "Alchemy adventures", "TV", "Action", "2003", "2004"));
        animeList.addAnime(new Anime("Dragon Ball Z", "Saiyan warriors", "TV", "Action", "1989", "1996"));
        animeList.addAnime(new Anime("Sword Art Online", "Virtual reality", "TV", "Adventure", "2012", "Ongoing"));
        animeList.addAnime(new Anime("Tokyo Ghoul", "Ghoul conflicts", "TV", "Horror", "2014", "2018"));
        animeList.addAnime(new Anime("Demon Slayer", "Demon hunting", "TV", "Action", "2019", "Ongoing"));

        return animeList;
    }
}
