package github.onerelax.shovelrequests.viewelements;

import github.onerelax.shovelrequests.util.HttpRequestType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class RequestTypeAndUrlField extends HBox {
    private final ChoiceBox<HttpRequestType> requestTypeChoiceBox = new ChoiceBox<>();
    private final TextField urlTexfield = new TextField();

    public RequestTypeAndUrlField() {
        this.requestTypeChoiceBox.getItems().addAll(HttpRequestType.GET,HttpRequestType.POST,HttpRequestType.PUT,HttpRequestType.DELETE);
        this.requestTypeChoiceBox.setValue(HttpRequestType.GET);
        this.urlTexfield.setPromptText("Enter URL here");
        this.getChildren().addAll(this.requestTypeChoiceBox,this.urlTexfield);
    }

    public void setHttpRequestType(HttpRequestType type) {
        this.requestTypeChoiceBox.setValue(type);
    }

    public HttpRequestType getHttpRequestType() {
        return this.requestTypeChoiceBox.getValue();
    }

    public void setUrl(String url){
        this.urlTexfield.setText(url);
    }

    public String getUrl(){
        return this.urlTexfield.getText();
    }
}
