package adressbook.part;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javax.inject.Inject;

public class AdbookPart {

	@Inject
	public AdbookPart(BorderPane parent) {
		URL location = getClass().getResource("/adressbook/Adressbook.fxml");

		FXMLLoader fxmlLoader = new FXMLLoader(location);
//		controller = new DetailsViewController();
//		fxmlLoader.setController(controller);

		GridPane root = null;
		try {
		root = (GridPane) fxmlLoader.load();
		} catch (IOException e) {
		e.printStackTrace();
		}

		parent.setCenter(root);
	}
}
