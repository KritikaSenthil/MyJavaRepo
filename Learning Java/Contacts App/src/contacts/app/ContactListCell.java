/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts.app;

import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;

/**
 *
 * @author kritikasenthil
 */
public class ContactListCell extends ListCell<Contact> {

    @Override
    protected void updateItem(Contact item, boolean empty) {
        super.updateItem(item, empty);

        if (empty || item == null) {
            setText(null);
            setGraphic(null);
        } else {
            setText(item.getFullName());
            this.setContentDisplay(ContentDisplay.TOP);
            if (item.getImage() != null) {
                ImageView iv = new ImageView(item.getImage());
                iv.setFitWidth(110);
                iv.setFitHeight(80);
                iv.setPreserveRatio(true);
                setGraphic(iv);
            } else {
                setGraphic(null);
            }
        }
    }

}
