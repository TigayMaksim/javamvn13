package ru.netology.manager;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TicketManager {
    private Ticket[] tickets = new Ticket[0];

    public void addTicket(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Ticket[] findTicket(String from, String to) {
        Ticket[] ans = new Ticket[0];
        for (Ticket ticket : tickets) {
            if (ticket.getDepartureAirport() == from && ticket.getArrivalAirport() == to) {
                Ticket[] tmp = new Ticket[ans.length + 1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans[i];

                }
                tmp[tmp.length - 1] = ticket;
                ans = tmp;
            }

        }
        Arrays.sort(ans);
        return ans;


    }

}
