module com.mycompany.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.QuizApp to javafx.fxml;
    exports com.mycompany.QuizApp;
}
