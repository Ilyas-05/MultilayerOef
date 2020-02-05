package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Werknemer jan = new Werknemer("Jan", 30, 4000);
        System.out.println(jan.printInfo());
        if (jan instanceof programmeur){
            System.out.println("werknemer piet is wel degelijk een programmeur");
        } else {
            System.out.println("werknemer jan is GEEN programmeur");
        }
        programmeur pol = new programmeur("Pol", 28, 5000, "Java");
        System.out.println(pol.printInfo());

        Werknemer piet = new programmeur("Piet", 26, 3000, "visual basic");
        // lukt niet : programmeur Geert = new Werknemer("Geert", 30, 3000);
        System.out.println(piet.printInfo());
        //piet.programmeer();
        programmeur pietAlsProgrammeur = (programmeur) piet;
        pietAlsProgrammeur.programmeer();
        if (piet instanceof programmeur){
            System.out.println("werknemer piet is wel degelijk een programmeur");
        }
        if (piet instanceof programmeur){
            System.out.println("werknemer piet is wel degelijk een werknemer");
        }


    }


    public static void main(String[] args) {
        launch(args);
    }
}
