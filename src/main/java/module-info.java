module com.example.qa_first {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.qa_first to javafx.fxml;
    exports com.example.qa_first;
}