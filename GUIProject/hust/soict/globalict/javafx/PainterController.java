package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton eraser;

    @FXML
    private RadioButton pen;

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY() ,4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
    @FXML
    void clearButtonPressed(ActionEvent event) {

        drawingAreaPane.getChildren().clear();
    }

}

