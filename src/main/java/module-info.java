module github.onerelax.shovelrequests {
    requires javafx.controls;
    requires javafx.fxml;


    opens github.onerelax.shovelrequests to javafx.fxml;
    opens github.onerelax.shovelrequests.viewelements to javafx.fxml;
    exports github.onerelax.shovelrequests;
}