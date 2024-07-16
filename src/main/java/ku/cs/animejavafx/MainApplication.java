package ku.cs.animejavafx;

import javafx.application.Application;
import javafx.stage.Stage;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Anime Info");
        configRoute();
        FXRouter.goTo("self-intro");
    }

    public static void configRoute()
    {
        String viewPath = "ku/cs/views/";
        FXRouter.when("self-intro", viewPath + "self-intro.fxml");
        FXRouter.when("anime-list", viewPath + "anime-list.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}