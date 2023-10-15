package application.fx6.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.fx6.model.entities.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class View6Controller implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerxon;
	@FXML
	private Button btnAll;

	private ObservableList<Person> obsList;

	@FXML
	public void onComboBoxPersonAction() {
		Person person = comboBoxPerxon.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	@FXML
	public void onButtonBtnAllAction() {
		for(Person person : comboBoxPerxon.getItems()){
			System.out.println(person);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Alex", "Alex@gmail.com"));
		list.add(new Person(2, "Bob", "Bob@gmail.com"));
		list.add(new Person(3, "Ana", "Ana@gmail.com"));

		obsList = FXCollections.observableArrayList(list);
		comboBoxPerxon.setItems(obsList);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		comboBoxPerxon.setCellFactory(factory);
		comboBoxPerxon.setButtonCell(factory.call(null));
	}
}