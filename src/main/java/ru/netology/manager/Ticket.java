package ru.netology.manager;

import java.util.Objects;

public class Ticket implements Comparable<Ticket>{

    private int id;
    private int cost;
    private String departureAirport;
    private String arrivalAirport;
    private int travelTime;

    public Ticket(int id, int cost, String departureAirport,String arrivalAirport,int travelTime) {
        this.id = id;
        this.cost=cost;
        this.departureAirport=departureAirport;
        this.arrivalAirport=arrivalAirport;
        this.travelTime=travelTime;
    }
    @Override
    public String toString(){
        return departureAirport;
    }

    @Override
    public int compareTo(Ticket otherTicket) {
        if (cost < otherTicket.cost){
            return -1;
        }
        if (cost > otherTicket.cost){
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && cost == ticket.cost && travelTime == ticket.travelTime && Objects.equals(departureAirport, ticket.departureAirport) && Objects.equals(arrivalAirport, ticket.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cost, departureAirport, arrivalAirport, travelTime);
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
