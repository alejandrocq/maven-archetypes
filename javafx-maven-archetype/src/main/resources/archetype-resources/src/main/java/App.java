package ${groupId};

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) { launch(args); }

    @Override public void start(Stage stage) throws Exception {
        VBox box = new VBox(); Scene scene = new Scene(box, 200., 200.);
        box.setAlignment(Pos.CENTER);

        Button btn = new Button("Click here!"); box.getChildren().add(btn);
        Label clickInfo = new Label("You did it!"); box.getChildren().add(clickInfo);
        clickInfo.setVisible(false);
        btn.setOnMouseClicked(event -> clickInfo.setVisible(true));

        stage.setTitle("JavaFX application");
        stage.setScene(scene);
        stage.show();
    }
}
