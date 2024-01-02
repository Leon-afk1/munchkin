import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CarteGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Charger l'image de la carte
        Image imageCarte = new Image("file:/chemin/vers/votre/carte.png");

        // Créer une vue d'image avec l'image de la carte
        ImageView imageView = new ImageView(imageCarte);

        // Créer une mise en page et ajouter l'image
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        // Créer la scène
        Scene scene = new Scene(root, 400, 400);

        // Configurer la fenêtre principale
        primaryStage.setTitle("Affichage de carte");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
