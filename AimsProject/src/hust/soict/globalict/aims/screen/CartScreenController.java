package hust.soict.globalict.aims.screen;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.media.Media;
import hust.soict.globalict.media.Playable;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.function.Predicate;

public class CartScreenController {

    private Cart cart;
    private FilteredList<Media> filteredMediaList;
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableView<Media> tblMedia;
    @FXML
    private Label tfFilter;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;
    @FXML
    private Label lblTotalCost;
    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }
    private void initialize() {
        colMediaTitle.setCellFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellFactory(
                new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrder());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    public void changed(ObservableValue<? extends Media> observableValue,Media oldValue, Media newValue) {
                        if(newValue!=null) {
                            updateButtonBar(newValue);
                        }
                    }
                }
        );
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                showFilteredMedia(newValue);
            }
        });
        filteredMediaList = new FilteredList<>(cart.getItemsOrder(), null);

        tblMedia.setItems(filteredMediaList);

        lblTotalCost.textProperty().bind(Bindings.format("$%.2f", cart.totalCost()));
    }
    void showFilteredMedia(String filter) {
        filteredMediaList.setPredicate(new Predicate<Media>() {
            @Override
            public boolean test(Media media) {
                if (filter == null || filter.isEmpty()) {
                    return true;
                }

                if (radioBtnFilterId.isSelected()) {
                    return String.valueOf(media.getId()).contains(filter);
                } else {
                    return media.getTitle().toLowerCase().contains(filter.toLowerCase());
                }
            }
        });
    }

     void updateButtonBar(Media newValue) {
        btnRemove.setVisible(true);
        if(newValue instanceof Playable) {
            btnPlay.setVisible(true);
        } else btnPlay.setVisible(false);
    }
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }


}


