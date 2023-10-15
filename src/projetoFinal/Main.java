package projetoFinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	String caminho = "/projetoFinal/gui/MainView.fxml";
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader
					.load(getClass()
					.getResource(caminho));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Projeto JavaFx Simples");
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
