package ui;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

	ArrayList<String> historial;

	public MainController() {

		historial = new ArrayList<String>();

	}

	@FXML
	private Button additionBTN;

	@FXML
	private Button calculateBTN;

	@FXML
	private Button eightBTN;

	@FXML
	private Button fiveBTN;

	@FXML
	private Button fourBTN;

	@FXML
	private TextArea historialTA;

	@FXML
	private Button multBTN;

	@FXML
	private Button nineBTN;

	@FXML
	private Button oneBTN;

	@FXML
	private TextField operationBTN;

	@FXML
	private TextField reasultTF;

	@FXML
	private Button sevenBTN;

	@FXML
	private Button sixBTN;

	@FXML
	private Button substractionBTN;

	@FXML
	private Button threeBTN;

	@FXML
	private Button twoBTN;

	@FXML
	private Button zeroBTN;

}
