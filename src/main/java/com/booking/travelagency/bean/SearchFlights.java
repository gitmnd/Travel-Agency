package com.booking.travelagency.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by MACHUNAGENDRADURGP on 01/06/2018.
 */
public class SearchFlights {

    @NotNull
    @Size(min=3, max=10)
    private String from;

    private String to;

    private String depart;

    private String passengerclass;

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

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getPassengerclass() {
        return passengerclass;
    }

    public void setPassengerclass(String passengerclass) {
        this.passengerclass = passengerclass;
    }
}
