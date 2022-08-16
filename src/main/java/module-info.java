module org.fitznet.doomdns.laugendesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires unirest.java;


    opens org.fitznet.doomdns.laugendesktop to javafx.fxml;
    exports org.fitznet.doomdns.laugendesktop;
}