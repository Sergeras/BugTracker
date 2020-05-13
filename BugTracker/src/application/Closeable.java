package application;

import javafx.fxml.FXML;

public interface Closeable {
	
	@FXML
	private void close () {
		javafx.application.Platform.exit();
	}
}
