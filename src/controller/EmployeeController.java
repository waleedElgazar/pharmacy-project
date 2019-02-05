package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmployeeController {

    @FXML
    private TableColumn<?, ?> order_col;

    @FXML
    private TableColumn<?, ?> name_coloum;

    @FXML
    private TableColumn<?, ?> price_col;

    @FXML
    private TableColumn<?, ?> delivered_col;

    @FXML
    private TableColumn<?, ?> adress_col;

    @FXML
    private TableView<?> customer;

}
