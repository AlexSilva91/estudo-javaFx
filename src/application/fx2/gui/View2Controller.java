package application.fx2.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class View2Controller {
	@FXML
	private Button btnClick;
	
	@FXML
	public void onBtClickAction() {
		System.out.println("Click");
	}
}
