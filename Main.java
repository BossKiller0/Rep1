
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	Frm1Controller frm1Controller = new Frm1Controller();
	@Override
	public void start(Stage primaryStage) {
		try {
			frm1Controller.Load();
		} catch(Exception e) {
			System.out.println("Main " +e);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
