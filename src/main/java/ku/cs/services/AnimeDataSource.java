package ku.cs.services;

import ku.cs.models.Anime;
import ku.cs.models.AnimeList;
import ku.cs.models.Student;

public class AnimeDataSource {
    public AnimeList readData() {
        AnimeList animeList = new AnimeList();
        animeList.addAnime(new Anime(
                "Naruto",
                "Naruto Uzumaki, a young ninja with a sealed demon fox spirit, seeks recognition and dreams of becoming the Hokage, the village leader. Along with his friends and fellow ninjas, he faces various enemies and personal challenges, growing stronger and wiser throughout his journey.",
                "TV",
                "Action",
                "2002",
                "2017"
        ));
        animeList.addAnime(new Anime(
                "One Piece",
                "Monkey D. Luffy, a young pirate with the ability to stretch his body like rubber after eating a Devil Fruit, sets out on a journey to find the ultimate treasure, One Piece, and become the Pirate King. Along the way, he gathers a diverse crew and faces numerous adventures and powerful foes.",
                "TV",
                "Adventure",
                "1999",
                "Ongoing"
        ));
        animeList.addAnime(new Anime(
                "Attack on Titan",
                "In a world where humanity resides within massive walled cities to protect themselves from giant humanoid Titans, Eren Yeager, along with his friends Mikasa and Armin, join the military to fight against the Titans and uncover the dark secrets behind their existence.",
                "TV",
                "Action",
                "2013",
                "2023"
        ));
        animeList.addAnime(new Anime(
                "Death Note",
                "Light Yagami, a high school student, stumbles upon a mysterious notebook called the Death Note, which grants the ability to kill anyone whose name is written in it. Using the Death Note, Light aims to create a new world free of crime, but his actions attract the attention of the genius detective known as L.",
                "TV",
                "Mystery",
                "2006",
                "2007"
        ));
        animeList.addAnime(new Anime(
                "My Hero Academia",
                "In a world where nearly everyone possesses superpowers called Quirks, Izuku Midoriya, a Quirkless boy, dreams of becoming the greatest hero. After a chance encounter with his idol, All Might, Izuku inherits All Might's Quirk and begins his training at U.A. High School to become a professional hero.",
                "TV",
                "Action",
                "2016",
                "Ongoing"
        ));
        animeList.addAnime(new Anime(
                "Fullmetal Alchemist",
                "Brothers Edward and Alphonse Elric use alchemy to try to resurrect their deceased mother, but the attempt fails disastrously. Edward loses an arm and a leg, while Alphonse's soul is bound to a suit of armor. The brothers set out to find the Philosopher's Stone, which they believe can restore their bodies.",
                "TV",
                "Action",
                "2003",
                "2004"
        ));
        animeList.addAnime(new Anime(
                "Dragon Ball Z",
                "Goku, a Saiyan warrior, protects Earth from various powerful foes, including alien invaders, androids, and magical creatures. Alongside his friends and family, Goku undergoes rigorous training and engages in epic battles to save the planet and the universe.",
                "TV",
                "Action",
                "1989",
                "1996"
        ));
        animeList.addAnime(new Anime(
                "Sword Art Online",
                "In the near future, players of a virtual reality MMORPG called Sword Art Online find themselves trapped in the game, with death in the game resulting in death in real life. Kirito, a skilled player, navigates through the game's challenges to free himself and the other players.",
                "TV",
                "Adventure",
                "2012",
                "Ongoing"
        ));
        animeList.addAnime(new Anime(
                "Tokyo Ghoul",
                "Kaneki Ken, a college student, becomes a half-ghoul after a near-fatal encounter with a ghoul. Struggling with his new identity, he must navigate the dangerous world of ghouls and humans while trying to maintain his humanity.",
                "TV",
                "Horror",
                "2014",
                "2018"
        ));
        animeList.addAnime(new Anime(
                "Demon Slayer",
                "Tanjiro Kamado, a kind-hearted boy, becomes a demon slayer after his family is slaughtered by demons and his sister, Nezuko, is turned into a demon. He sets out on a journey to avenge his family and cure his sister, encountering powerful demons and forming bonds with other demon slayers.",
                "TV",
                "Action",
                "2019",
                "Ongoing"
        ));

        return animeList;
    }
}
