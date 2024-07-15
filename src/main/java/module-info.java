module ku.cs.animejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    exports ku.cs.animejavafx;
    opens ku.cs.animejavafx to javafx.fxml;

    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;

    exports ku.cs.services;
    opens ku.cs.services;
}