package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

import java.io.File;



public class Controller {
    public ImageView Kartinka;
    public TextField Pyt;



    public void OtvetOkClicked(ActionEvent otvetok) {
        try {
            File txt = new File(Pyt.getText());
            Image kart = new Image(txt.toURI().toURL().toString());

            Kartinka.setImage(kart);
        }catch (Exception ex){
            System.out.println("Путь не тот");
        }
    }
}
