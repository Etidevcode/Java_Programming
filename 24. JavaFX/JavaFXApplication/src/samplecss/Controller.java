package samplecss;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
//import javafx.scene.web.WebEngine;
//import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;


public class Controller {

	@FXML
	private Label label;
	@FXML
	private Button button4;
	@FXML
	private GridPane gridPane;
	/*@FXML
	private WebView  webView;*/


	@FXML
	public void initialize() {
		//label.setScaleX(2.0);
		//label.setScaleY(2.0);
		button4.setEffect(new DropShadow());
	}

	@FXML
	public void handleMouseEnter() {
		label.setScaleX(2.0);
		label.setScaleY(2.0);
	}

	@FXML
	public void handleMouseExit() {
		label.setScaleX(1.0);
		label.setScaleY(1.0);
	}

	@FXML
	public void handleClick() {
		FileChooser chooser = new FileChooser();

		chooser.setTitle("Save Application File");
		chooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("Zip", "*.zip"),
				new FileChooser.ExtensionFilter("Text", "*.txt"),
				new FileChooser.ExtensionFilter("PDF", "*.pdf"),
				new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.pngf", "*.gif"),
				new FileChooser.ExtensionFilter("All Files", "*.*")
		);

		//DirectoryChooser chooser = new DirectoryChooser();
		// File file = chooser.showSaveDialog(gridPane.getScene().getWindow());
		List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
		if (file != null) {
			for (int i = 0; i < file.size(); i++) {
				System.out.println(file.get(i));
			}
			// System.out.println(file.getPath());
		} else {
			System.out.println("Choose was cancelled");
		}
	}

	@FXML
	public void handleLinkClick() {
		// System.out.println("The link was clicked");

		/*try {
			Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}*/

		/*WebEngine engine = webView.getEngine();
		engine.load("http://www.javafx.com");*/
	}
}
