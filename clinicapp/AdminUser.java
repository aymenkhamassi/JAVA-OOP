package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    // Constructor
    public AdminUser(Integer id, String role) {
        super(id);
        this.role = role;
        this.securityIncidents = new ArrayList<>(); 
    }

    // Implement HIPAACompliantUser interface
    @Override
    public boolean assignPin(int pin) {
        String pinStr = String.valueOf(pin);
        if (pinStr.length() < 6) {
            return false;
        }
        this.pin = pin;
        return true;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (!this.id.equals(confirmedAuthID)) {
            authIncident();
            return false;
        }
        return true;
    }

    // Implement HIPAACompliantAdmin interface
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }

    public void newIncident(String notes) {
        String report = String.format("Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", new Date(), this.id,
                notes);
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format("Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", new Date(), this.id,
                "AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        securityIncidents.add(report);
    }

    // Getters and setters
    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }
}

