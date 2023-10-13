package application.fx5.gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import application.fx4.gui.util.Alerts;
import application.fx5.gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class View5Controller implements Initializable{
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldDouble(txtN1);
		Constraints.setTextFieldDouble(txtN2);
		
	}
}