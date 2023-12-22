package com.kenzie.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;

public class MedicationCreateRequest {
    @NotEmpty
    @JsonProperty("name")
    private String name;
    @NotEmpty
    @JsonProperty("timeOfDay")
    private String timeOfDay;
    @NotEmpty
    @JsonProperty("dosage")
    private String dosage;
    @NotEmpty
    @JsonProperty("alertTime")
    private String alertTime;
    @NotEmpty
    @JsonProperty("alertDays")
    private List<String> alertDays;


    // Emily S. 12/21 - saving in case we revert back to using the LocalDateTime
//    @NotEmpty
//    @JsonProperty("alertDays")
//    private List<LocalDateTime> alertDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(String alertTime) {
        this.alertTime = alertTime;
    }

    public List<String> getAlertDays() {
        return alertDays;
    }

    public void setAlertDays(List<String> alertDays) {
        this.alertDays = alertDays;
    }



// Emily S. 12/21 - saving in case we revert back to using the LocalDateTime
//    public List<LocalDateTime> getAlertDays() {
//        return alertDays;
//    }
//
//    public void setAlertDays(List<LocalDateTime> alertDays) {
//        this.alertDays = alertDays;
//    }
}
