/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts.app;

import java.awt.Desktop;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.util.Callback;

/**
 *
 * @author kritikasenthil
 */
public class ContactsAppController implements Initializable {

    ObservableList<Contact> contacts;

    ContactComparator contactComparator = new ContactComparator();

    Contact contact;

    private Desktop desktop = Desktop.getDesktop();

    private final FileChooser fileChooser = new FileChooser();

    @FXML
    private ListView contactsLV;
    @FXML
    private TextField fNameTxt;
    @FXML
    private TextField lNameTxt;

    @FXML
    private TextField emailTxt;

    @FXML
    private TextField phoneTxt;

    @FXML
    private TextField addressTxt;

    @FXML
    private Button saveBtn;
    @FXML
    private Button addBtn;
    @FXML
    private ImageView contactIV = new ImageView();
    @FXML
    private Button deleteBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contactsLV.setCellFactory(new Callback<ListView<Contact>, ListCell<Contact>>() {
            @Override
            public ListCell<Contact> call(ListView<Contact> list) {
                return new ContactListCell();
            }
        });
        contacts = FXCollections.observableArrayList();
        contactsLV.setItems(contacts);
        contactsLV.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Contact>() {

            @Override
            public void changed(ObservableValue<? extends Contact> observable, Contact oldValue, Contact newValue) {
                contact = newValue;
                if (contact != null) {
                    displayContact();
                } else {
                    clear();
                }
            }
        });

        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif", "*bmp"));

        add();

    }

    @FXML
    private void save(ActionEvent event) {
        if (contact == null) {
            add();

        } else {
            if (fNameTxt.getText().equals("") || lNameTxt.getText().equals("")) {
                Alert alert = new Alert(Alert.AlertType.NONE, "First name and last name are required", ButtonType.OK);
                alert.showAndWait();
                return;
            }
            contact = getContact();
            int index = contactsLV.getSelectionModel().getSelectedIndex();
            contacts.set(index, contact);
            sortList();
            contactsLV.getSelectionModel().select(contact);
            System.out.println("Saved");
        }

    }

    private Contact getContact() {
        Contact contact = new Contact();
        contact.setFname(fNameTxt.getText());
        contact.setLname(lNameTxt.getText());
        contact.setEmail(emailTxt.getText());
        contact.setPhoneNumber(phoneTxt.getText());
        contact.setHomeAddress(addressTxt.getText());
        contact.setImage(contactIV.getImage());
        return contact;
    }

    private void displayContact() {
        try {
            fNameTxt.setText(contact.getFname());
            lNameTxt.setText(contact.getLname());
            emailTxt.setText(contact.getEmail());
            phoneTxt.setText(contact.getPhoneNumber());
            addressTxt.setText(contact.getHomeAddress());
            if (contact.getImage() != null) {
                this.contactIV.setImage(contact.getImage());
            } else {
                this.contactIV.setImage(null);
            }
        } catch (Exception e) {

        }
    }

    @FXML
    private void addAction(ActionEvent event) {
        add();
    }

    private void add() {
        if (contact == null) {
            contact = getContact();
            contacts.add(contact);
            contactsLV.getSelectionModel().select(contact);
            sortList();
        } else {
            contact = new Contact();
            contacts.add(contact);
            contactsLV.getSelectionModel().select(contact);
            sortList();
            clear();
        }

    }

    private void sortList() {
        FXCollections.sort(contacts, contactComparator);
    }

    private void clear() {
        fNameTxt.setText("");
        lNameTxt.setText("");
        emailTxt.setText("");
        phoneTxt.setText("");
        addressTxt.setText("");
        contactIV.setImage(null);
    }

    @FXML
    private void delete(ActionEvent event) {
        contacts.remove(contact);

    }

    @FXML
    private void addImage(MouseEvent mouseEvent) {
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            try {
                Image image = new Image(file.toURI().toURL().toString());
                contact.setImage(image);
                contactIV.setImage(image);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

}
