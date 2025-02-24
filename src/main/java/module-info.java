module de.onerelax.shovelrequests {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.onerelax.shovelrequests to javafx.fxml;
    exports de.onerelax.shovelrequests;
}