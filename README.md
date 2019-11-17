# ChartGen
A chart generator tool to create Gantt charts and find PERT chart time estimations

*This was made for the **CS-1606 Software Engineering** project at **MNNIT Allahabad***

*The documentations made for the project can be found in the `docs` branch*


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Download or clone the repository onto your local machine.

Download the latest version of [IntelliJ IDEA](https://www.jetbrains.com/idea/) from [here](https://www.jetbrains.com/idea/download). The free Community Edition will suffice.

Will need to install the latest version of Java need to be downloaded as well (if it is not already installed). This can be done so from [here](https://www.java.com/en/download/). Set up the Java path and complete all installation prerequisites. 

Go through the IntelliJ IDEA first time setup process. It is recommended to skip everything and leave all the settings the their default values.

Scene Builder needs to be installed from [here](https://gluonhq.com/products/scene-builder/), if the `.fxml` files need to opened or edited.

All the `.jar` libraries need to be downloaded as well.

## Deployment

Import the ChartGen project into IntelliJ IDEA.

Add all the required JAR library files to the `File > Project Structure`. They are all located under the `src` folder.

Navigate to `Main.java` and then right click on the file and click on `Run Main`. This will run the whole application from the default starting screen.

The PERT chart module can also be run as a standalone module by right clicking on `PertChart.java` and then clicking on `Run PertChart.main()`.

## Status of the project

#### Things that work
* Gantt chart visualisation when data is fed
* PERT project completion time estimation

#### Things that don't
* Work Breakdown Structure could not be implemented
* No visual representation of the PERT chart could be created

## Screenshots

<p align="center">
  <img src="https://github.com/rajatdiptabiswas/chart-generator-java/blob/screenshots/start.png">
  <em> Start page of the application </em>
</p>
<p align="center">
  <img src="https://github.com/rajatdiptabiswas/chart-generator-java/blob/screenshots/chart-choose.png">
  <em> Chart choosing window </em>
</p>
<p align="center">
  <img src="https://github.com/rajatdiptabiswas/chart-generator-java/blob/screenshots/gantt-1-in.png">
  <em> Gantt chart data input screen </em>
  <img src="https://github.com/rajatdiptabiswas/chart-generator-java/blob/screenshots/gantt-1-out.png">
  <em> Gantt chart output </em>
</p>
<p align="center">
  <img src="https://github.com/rajatdiptabiswas/chart-generator-java/blob/screenshots/pert-2-in.png">
  <em> PERT data input screen </em>
  <img src="https://github.com/rajatdiptabiswas/chart-generator-java/blob/screenshots/pert-2-out.png">
  <em> PERT data output </em>
</p>


## Built With

* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - A Java integrated development environment for developing computer software. It is developed by JetBrains.
* [JFreeChart](www.jfree.org/jfreechart/) - An open-source framework for the programming language Java, which allows the creation of a wide variety of both interactive and non-interactive charts.
* [JFoeniX](http://www.jfoenix.com) - An open source Java library, that implements Google Material Design using Java components.
* [Scene Builder](https://gluonhq.com/products/scene-builder/) - A visual layout tool that lets users quickly design JavaFX application user interfaces, without coding.



## Authors

* **Rajat Dipta Biswas** - *Lead Developer and Designer*
* **Raman Sehgal** - *Developer*
* **Rahul Singh Adhikari** - *Tester*
* **Rakesh Singh** - *Technical lead*
* **Rahul Kumar** - *Project manager*

See also the list of [contributors](https://github.com/rajatdiptabiswas/chart-generator-java/contributors) who participated in this project.


## Acknowledgements

* [JFreeChart API Documentation](http://www.jfree.org/jfreechart/api/javadoc/index.html)
* [JavaFX Documentation](https://docs.oracle.com/javafx/2/)
* [JFoenix Documentation](http://jfoenix.com/documentation.html)
* [Javatpoint | JFreeChart Gantt Chart](https://www.javatpoint.com/jfreechart-gantt-chart)
* [Github | Delliardo/Pert-Chart-Code](https://github.com/Delliardo/Pert-Chart-Code)
* [StackOverflow](https://stackoverflow.com)
