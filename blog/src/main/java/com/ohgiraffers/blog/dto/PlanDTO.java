package com.ohgiraffers.blog.dto;


public class PlanDTO {

    private String id;

    private String plan_name;

    private String plan_description;

    private int startDate;

    private int endDate;

    private String user;

    public PlanDTO() {
    }

    public PlanDTO(String id, String plan_name, String plan_description, int startDate, int endDate, String user) {
        this.id = id;
        this.plan_name = plan_name;
        this.plan_description = plan_description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getPlan_description() {
        return plan_description;
    }

    public void setPlan_description(String plan_description) {
        this.plan_description = plan_description;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PlanDTO{" +
                "id='" + id + '\'' +
                ", plan_name='" + plan_name + '\'' +
                ", plan_description='" + plan_description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", user='" + user + '\'' +
                '}';
    }
}
