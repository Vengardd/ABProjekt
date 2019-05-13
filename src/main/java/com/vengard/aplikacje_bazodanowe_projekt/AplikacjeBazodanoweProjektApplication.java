package com.vengard.aplikacje_bazodanowe_projekt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AplikacjeBazodanoweProjektApplication extends Application {

    private ConfigurableApplicationContext context;
    private Parent root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AplikacjeBazodanoweProjektApplication.class);
        context = builder.run(getParameters().getRaw().toArray(new String[0]));
        javafx.fxml.FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample.fxml"));
        fxmlLoader.setControllerFactory(context::getBean);
        root = fxmlLoader.load();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello World");
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
}
