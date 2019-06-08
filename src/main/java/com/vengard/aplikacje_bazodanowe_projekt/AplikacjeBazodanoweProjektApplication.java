package com.vengard.aplikacje_bazodanowe_projekt;

import com.vengard.aplikacje_bazodanowe_projekt.front.Window;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AplikacjeBazodanoweProjektApplication extends Application {

    private ConfigurableApplicationContext context;
    private Parent root;

    private Window window;

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
        window = context.getBean("loggingWindow", Window.class);
    }

    @Bean
    public ConfigurableApplicationContext getContext() {
        return context;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("a");
        window.showWindow(primaryStage);
    }

    @Override
    public void stop() throws Exception {
        context.stop();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
