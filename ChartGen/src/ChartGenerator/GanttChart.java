package ChartGenerator;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;

public class GanttChart extends JFrame {

    public GanttChart(String title, int n, String xLabel, String yLabel, String[] yAxisItems, String[] scenarios, int[] start1, int[] end1, int[] start2, int[] end2) {
        super(title);

        IntervalCategoryDataset dataset = getCategoryDataset(n, yAxisItems, scenarios, start1, end1, start2, end2);

        // Create chart
        JFreeChart chart = ChartFactory.createGanttChart(
                "Gantt Chart", // Chart title
                yLabel,
                xLabel,
                dataset);

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private IntervalCategoryDataset getCategoryDataset(int n, String[] yAxisItems, String[] scenarios, int[] start1, int[] end1, int[] start2, int[] end2) {

        TaskSeries series1 = new TaskSeries(scenarios[0]);

        for(int i = 0; i<n; i++) {
            series1.add(new Task(yAxisItems[i],
                    Date.from(LocalDate.of(2019,3,start1[i]).atStartOfDay().toInstant(ZoneOffset.UTC)),
                    Date.from(LocalDate.of(2019, 3,end1[i]).atStartOfDay().toInstant(ZoneOffset.UTC))
            ));
        }

        TaskSeries series2 = new TaskSeries(scenarios[1]);

        for(int i = 0; i<n; i++) {
            series2.add(new Task(yAxisItems[i],
                    Date.from(LocalDate.of(2019,3,start2[i]).atStartOfDay().toInstant(ZoneOffset.UTC)),
                    Date.from(LocalDate.of(2019, 3,end2[i]).atStartOfDay().toInstant(ZoneOffset.UTC))
            ));
        }

        TaskSeriesCollection dataset = new TaskSeriesCollection();
        dataset.add(series1); dataset.add(series2);

        return dataset;
    }

}
