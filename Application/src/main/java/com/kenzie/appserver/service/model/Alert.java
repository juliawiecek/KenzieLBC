package com.kenzie.appserver.service.model;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Alert {
    private String medicationName;
    private String alertId;
    private String dosage;
    private String alertTime;
    private List<DayOfWeek> alertDays;

    public Alert() {
    }
    public Alert(String medicationName, String alertId, String dosage, String alertTime, List<DayOfWeek> alertDays) {
        this.medicationName = medicationName;
        this.alertId = alertId;
        this.dosage = dosage;
        this.alertTime = alertTime;
        if(alertDays != null) {
            this.alertDays = alertDays;
        } else {
            this.alertDays = new ArrayList<>();
        }
    }
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(String alertTime) {
        this.alertTime = alertTime;
    }

    public List<DayOfWeek> getAlertDays() {
        return alertDays;
    }

    public void setAlertDays(List<DayOfWeek> alertDays) {
        this.alertDays = alertDays;
    }
}
