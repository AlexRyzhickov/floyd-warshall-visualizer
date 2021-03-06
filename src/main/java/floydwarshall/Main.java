package floydwarshall;

import floydwarshall.executor.ExecutorInterface;
import floydwarshall.executor.Executor;
import floydwarshall.gui.Gui;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Gui gui = new Gui();
        ExecutorInterface executor = new Executor();
        gui.setExecutor(executor);
        gui.start(primaryStage);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
