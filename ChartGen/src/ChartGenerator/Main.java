package ChartGenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage MainStage, ChooseChartStage, GanttChartStage, PertChartStage, WorkBreakdownStage;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));

        MainStage = primaryStage;
        primaryStage.setTitle("ChartGen");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void showGanttChart() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("GanttChart.fxml"));

            GanttChartStage = new Stage();
            GanttChartStage.setTitle("Gantt Chart");
            GanttChartStage.setResizable(false);
            GanttChartStage.setScene(new Scene(root));
            GanttChartStage.show();
        }
        catch (Exception e) {}
    }

    public void showPERTChart() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("PERTChart.fxml"));

            PertChartStage = new Stage();
            PertChartStage.setTitle("PERT Chart");
            PertChartStage.setResizable(false);
            PertChartStage.setScene(new Scene(root));
            PertChartStage.show();
        }
        catch (Exception e) {}
    }

    public void showWBS() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("WorkBreakdown.fxml"));

            WorkBreakdownStage = new Stage();
            WorkBreakdownStage.setTitle("Work Breakdown Structure");
            WorkBreakdownStage.setResizable(false);
            WorkBreakdownStage.setScene(new Scene(root));
            WorkBreakdownStage.show();
        }
        catch (Exception e) {}
    }

    public void showChooseChart() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("ChooseChart.fxml"));

            ChooseChartStage = new Stage();
            ChooseChartStage.setTitle("Choose Chart");
            ChooseChartStage.setResizable(false);
            ChooseChartStage.setScene(new Scene(root));
            ChooseChartStage.show();
        }

        catch (Exception e) {}
    }


    public static void main(String[] args) {
        launch(args);
    }
}
