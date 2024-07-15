module ku.cs.animejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.animejavafx to javafx.fxml;
    exports ku.cs.animejavafx;
}