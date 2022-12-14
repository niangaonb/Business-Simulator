package com.niangaoa.YingYe.Ctrller;

import com.niangaoa.YingYe.App.YingYeMenu;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.net.URL;
import java.util.ResourceBundle;

public class YingYeAnnouncementCtrl implements Initializable {
    @FXML
    private Button Next1 = new Button();

    @FXML
    private Pane pane = new Pane();

    @FXML
    private void onChick() throws Exception {
        Stage stage = (Stage)Next1.getScene().getWindow();
        stage.close();
        new YingYeMenu().start(new Stage());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pane.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        Next1.getStyleClass().setAll("btn", "btn-info");
    }
}
