package org.fitznet.doomdns.laugendesktop;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label version;
    @FXML
    private Label responseLabel;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void mousePressOnAPIButton(){
        // Call API and save response
        String response = callAPI(System.getenv("API_URL")+ "/daily");
    }
    @FXML
    protected void getVersion(){
        // Call API and save response
        String response = callAPI(System.getenv("API_URL"));
    }
    private String callAPI(String url) {
        System.out.println("Calling API at " + url);
        // Make get request to API and return response
        HttpResponse<String> response = Unirest.get(url)
                .asString();
        //update response label
        responseLabel.setText(response.getBody().toString());
        return response.getBody().toString();
    }
}