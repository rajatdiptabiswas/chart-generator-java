/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertChart;

public class Project {
    // user input
    private String durationInterval;
    private double resources;

    private double completionTime;
    private double probabilityByDeadline;
    private float totalMinSlack;
    
    private double specifiedDeadline;
    private double probabilityOnTime;
    private double expectedDuration;
    private double expectedDurationStandardDeviation;
    
    private double averageCompletionTime;
    
    Project(String di, double resources) {
        this.resources = resources;
        this.durationInterval = di;
    }
    
    
    public double getResources() {
        return resources;
    }

    public void setResources(double resources) {
        this.resources = resources;
    }
    
    public String getDurationInterval() {
        return durationInterval;
    }

    public void setDurationInterval(String durationInterval) {
        this.durationInterval = durationInterval;
    }
    
    public Double getCompletionTime() {
        return this.completionTime;
    }
    
    public void setCompletionTime(Double t) {
        this.completionTime = t;
    }
    
    public Double getProbabilityOnTime() {
        return this.probabilityOnTime;
    }
    
    public void setProbabilityOnTime(Double t) {
        this.probabilityOnTime = t;
    }
    
    public Double getProbabilityByDeadline() {
        return this.probabilityByDeadline;
    }
    
    public void setProbabilityByDeadline(Double t) {
        this.probabilityByDeadline = t;
    }
    
    public Float getTotalMinSlack() {
        return this.totalMinSlack;
    }
    
    public void setTotalMinSlack(Float s) {
        this.totalMinSlack = s;
    }
    
    public Double getSpecifiedDeadline() {
        return this.specifiedDeadline;
    }
    
    public void setSpecifiedDeadline(Double t) {
        this.specifiedDeadline = t;
    }
    
    public Double getExpectedDuration() {
        return this.expectedDuration;
    }
    
    public void setExpectedDuration(Double t) {
        this.expectedDuration = t;
    }
    
    public Double getExpectedDurationStandardDeviation() {
        return this.expectedDurationStandardDeviation;
    }
    
    public void setExpectedDurationStandardDeviation(Double t) {
        this.expectedDurationStandardDeviation = t;
    }
            
    public Double getAverageCompletionTime() {
        return this.averageCompletionTime;
    }
    
    public void setAverageCompletionTime(Double t) {
        this.averageCompletionTime = t;
    }
}
