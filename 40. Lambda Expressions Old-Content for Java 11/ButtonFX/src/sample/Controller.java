package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
	@FXML
	private Button clickMeButton;

	public void initialize() {

		// Without Lambdas
		/*clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				System.out.println("You clicked me!");
			}
		});*/

		clickMeButton.setOnAction(event -> System.out.println("You clicked Me!"));
	}

}
