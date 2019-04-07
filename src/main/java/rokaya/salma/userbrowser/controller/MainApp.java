package rokaya.salma.userbrowser.controller;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rokaya.salma.userbrowser.view.FXMLController;


public class MainApp extends Application {
    
    Controller controller;
    
    @Override
    public void start(Stage stage) throws Exception {
        controller = new Controller();
        FXMLLoader loader = new FXMLLoader();
        FXMLController fXMLController = new FXMLController(controller);
        loader.setController(fXMLController);
        Parent root = loader.load(fXMLController.getClass().getResource("/fxml/Scene.fxml").openStream());
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles/Styles.css").toExternalForm());
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    //salma
    
    //rokaya
      

}
