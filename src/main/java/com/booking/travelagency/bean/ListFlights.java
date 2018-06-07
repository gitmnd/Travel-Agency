package com.booking.travelagency.bean;

/**
 * Created by MACHUNAGENDRADURGP on 01/06/2018.
 */
public class ListFlights {

    private String from;

    private String to;

    private String travelCode;

    private String route ;

    private String cost;

    private String time;

    private String provider ;
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTravelCode() {
        return travelCode;
    }

    public void setTravelCode(String travelCode) {
        this.travelCode = travelCode;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}


