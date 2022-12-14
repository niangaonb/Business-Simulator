package com.niangaoa.YingYe.App;

import com.niangaoa.YingYe.YingYeMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class YingYeMessage extends Application {
    @Override
    public void start(Stage messageStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(YingYeMain.class.getResource("Fxml/YingYeMessage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        messageStage.setResizable(false);
        messageStage.setScene(scene);
        messageStage.setTitle("营业模拟器");
        messageStage.getIcons().add(new Image(String.valueOf(YingYeMain.class.getResource("Img/icon.png"))));
        messageStage.show();
    }
}
