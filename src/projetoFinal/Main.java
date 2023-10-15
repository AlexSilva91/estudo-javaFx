package projetoFinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	String caminho = "/projetoFinal/gui/MainView.fxml";
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			ScrollPane root = FXMLLoader
					.load(getClass()
					.getResource(caminho));
			
			root.setFitToHeight(true);
			root.setFitToWidth(true);
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Projeto JavaFx Simples");
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
