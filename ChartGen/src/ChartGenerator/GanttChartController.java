package ChartGenerator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javax.swing.*;

public class GanttChartController {

    @FXML private JFXTextField yAxisNumber;
    @FXML private JFXTextField xAxisLabel;
    @FXML private JFXTextField yAxisLabel;
    @FXML private JFXTextField yAxisItemNames;
    @FXML private JFXTextField scenarioNames;
    @FXML private JFXTextField firstStartTimes;
    @FXML private JFXTextField firstEndTimes;
    @FXML private JFXTextField secondStartTimes;
    @FXML private JFXTextField secondEndTimes;
    @FXML private JFXButton confirmInputs;

    @FXML
    void confirmInputOnClick(ActionEvent event) {

        int n = Integer.parseInt(yAxisNumber.getText());
        String xLabel = xAxisLabel.getText();
        String yLabel = yAxisLabel.getText();

        String[] yAxisItems = yAxisItemNames.getText().split(" ");
        String[] scenarios = scenarioNames.getText().split(" ");

        String[] temp = new String[16];

        temp = firstStartTimes.getText().split(" ");
        int[] start1 = new int[temp.length];

        for(int i = 0; i < temp.length; i++) {
            start1[i] = Integer.parseInt(temp[i]);
        }

        temp = firstEndTimes.getText().split(" ");
        int[] start2 = new int[temp.length];

        for(int i = 0; i < temp.length; i++) {
            start2[i] = Integer.parseInt(temp[i]);
        }

        temp = secondStartTimes.getText().split(" ");
        int[] end1 = new int[temp.length];

        for(int i = 0; i < temp.length; i++) {
            end1[i] = Integer.parseInt(temp[i]);
        }

        temp = secondEndTimes.getText().split(" ");
        int[] end2 = new int[temp.length];

        for(int i = 0; i < temp.length; i++) {
            end2[i] = Integer.parseInt(temp[i]);
        }

        GanttChart example = new GanttChart("Gantt Chart", n, xLabel, yLabel, yAxisItems, scenarios, start1, start2, end1, end2);
        example.setSize(800, 400);
        example.setLocationRelativeTo(null);
        example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        example.setVisible(true);

    }

}