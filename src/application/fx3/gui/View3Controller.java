package application.fx3.gui;

import application.fx3.gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class View3Controller {
	@FXML
	private Button btnClick;
	
	@FXML
	public void onBtClickAction() {
		Alerts.showAlert("Titulo", 
				"cabeçalho",
				"Mensagem",
				AlertType.INFORMATION);
	}
}
