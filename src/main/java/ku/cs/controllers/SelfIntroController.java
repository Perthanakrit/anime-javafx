package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;
import ku.cs.services.FXRouter;
import ku.cs.services.StudentDataSource;

import java.io.IOException;

public class SelfIntroController {
    @FXML
    private Label studentIdLabel;
    @FXML
    private Label studentNameLabel;
    @FXML
    private Label stdNicknameLabel;

    @FXML
    public void initialize() {
        StudentDataSource dataSource = new StudentDataSource();
        showData(dataSource.readDatum());
    }

    @FXML
    protected void onNextPageButton()
    {
        try {
            FXRouter.goTo("student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showData(Student student)
    {
        studentIdLabel.setText(student.getId());
        studentNameLabel.setText(student.getName());
        stdNicknameLabel.setText(student.getNickName());
    }
}
