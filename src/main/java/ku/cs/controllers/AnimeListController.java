package ku.cs.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import ku.cs.models.Anime;
import ku.cs.models.AnimeList;
import ku.cs.services.AnimeDataSource;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class AnimeListController {
    @FXML
    private ListView<Anime> animeListView;
    @FXML private Label animeNameLable;
    @FXML private Label animeTypeLabel;
    @FXML private Label animeGenreLabel;
    @FXML private Label animeStartedLabel;
    @FXML private Label animeFinishedLabel;
    @FXML private TextArea animeDetailLabel;

    private AnimeList animeList;
    private Anime selectedAnime;

    @FXML
    public void initialize() {
        clearAnimeInfo();
        AnimeDataSource datasource = new AnimeDataSource();
        animeList = datasource.readData();
        showList(animeList);
        animeListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Anime>() {
            @Override
            public void changed(ObservableValue<? extends Anime> observable, Anime oldValue, Anime newValue) {
                if (newValue == null) {
                    clearAnimeInfo();
                    selectedAnime = null;
                } else {
                    showAnimeInfo(newValue);
                    selectedAnime = newValue;
                }
            }
        });
    }

    @FXML
    public void onBackToButton()
    {
        try {
            FXRouter.goTo("self-intro");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showList(AnimeList animeList) {
        animeListView.getItems().clear();
        animeListView.getItems().addAll(animeList.getAnimes());
    }

    private void showAnimeInfo(Anime anime) {
        animeNameLable.setText(anime.getTitle());
        animeTypeLabel.setText(anime.getType());
        animeGenreLabel.setText(anime.getGenre());
        animeStartedLabel.setText(anime.getStarted());
        animeFinishedLabel.setText(anime.getFinished());
        animeDetailLabel.setText(anime.getDesc());
    }

    private void clearAnimeInfo() {
        animeNameLable.setText("");
        animeTypeLabel.setText("");
        animeGenreLabel.setText("");
        animeStartedLabel.setText("");
        animeFinishedLabel.setText("");
        animeDetailLabel.setText("");
    }
}
