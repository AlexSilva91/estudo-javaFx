package application.fx4.gui;

import java.util.Locale;

import application.fx4.gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class View4Controller {
	@FXML
	private TextField txtN1;
	@FXML
	private TextField txtN2;
	@FXML
	private Label txtSoma;
	@FXML
	private Button btnSoma;

	@FXML
	public void onBtSomaAction() {
		try {
			// Leitura com ponto e não vírgula
			Locale.setDefault(Locale.US);
			double num1 = Double.parseDouble(txtN1.getText());
			double num2 = Double.parseDouble(txtN2.getText());
			double soma = num1 + num2;
			String sum = new String(String.format("%.2f", soma));
			txtSoma.setText(sum);
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error",
					e.getMessage(), AlertType.ERROR);
		}
	}
}