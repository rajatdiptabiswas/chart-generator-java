package ChartGenerator;

import PertChart.PertChartGUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ChooseChartController {

    @FXML
    void chooseGantt(ActionEvent event) {
        new Main().showGanttChart();

        Main.ChooseChartStage.close();
    }

    @FXML
    void choosePERT(ActionEvent event) {
        new PertChartGUI();
        Main.ChooseChartStage.close();
    }

    @FXML
    void chooseWBS(ActionEvent event) {
        new Main().showWBS();
        Main.ChooseChartStage.close();
    }

}
