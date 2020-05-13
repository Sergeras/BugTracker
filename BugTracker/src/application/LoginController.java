package application;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class LoginController {
	private Stage stage;
	private double x, y = 0;
	/*
	@FXML
	private void getStageXY () {
		x = stage.getX();
		y = stage.getY();	
		
	}
	
	@FXML 
	private void setStageXY () {
		stage.setX(stage.getX() - x);
		stage.setY(stage.getY() - y);
	}
	*/
	@FXML
	private void dragAndMove () {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Layouts/Login.fxml"));
			root.setOnMousePressed(event -> {
				x = event.getSceneX();
				y = event.getSceneY();
			}); 
			
			root.setOnMouseDragged(event -> {
				stage.setX(event.getScreenX() - x);
				stage.setY(event.getScreenY() - y);
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	private void close () {
		javafx.application.Platform.exit();
	}
	
	public void setStage (Stage stage) {
		this.stage = stage;
	}

}
