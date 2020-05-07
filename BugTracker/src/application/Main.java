package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	private double x, y = 0;
	
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Layouts/Login.fxml"));
			Scene scene = new Scene(root);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();
			
			// controller for moving the window
			root.setOnMousePressed(event -> {
				x = event.getSceneX();
				y = event.getSceneY();
			}); 
			
			root.setOnMouseDragged(event -> {
				stage.setX(event.getScreenX() - x);
				stage.setY(event.getScreenY() - y);
			});
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
