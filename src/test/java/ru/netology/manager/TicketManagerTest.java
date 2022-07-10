package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    Ticket ticket1 = new Ticket(101, 3500, "MOW", "KZN", 95);
    Ticket ticket2 = new Ticket(103, 2800, "MOW", "GOJ", 70);
    Ticket ticket3 = new Ticket(201, 6800, "MOW", "OGZ", 215);
    Ticket ticket4 = new Ticket(422, 4300, "MOW", "KUF", 115);
    Ticket ticket5 = new Ticket(463, 8940, "MOW", "FRU", 259);
    Ticket ticket6 = new Ticket(686, 4150, "MOW", "KZN", 105);
    Ticket ticket7 = new Ticket(967, 4080, "MOW", "KZN", 110);
    Ticket ticket8 = new Ticket(567, 3120, "MOW", "GOJ", 75);
    Ticket ticket9 = new Ticket(654, 9450, "MOW", "FRU", 245);
    Ticket ticket10 = new Ticket(698, 3716, "MOW", "KZN", 99);
    Ticket ticket11 = new Ticket(384, 7120, "MOW", "OGZ", 220);
    Ticket ticket12 = new Ticket(745, 3640, "MOW", "KZN", 97);

    @Test
    public void addAndFind() {
        TicketManager manager = new TicketManager();
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);
        manager.addTicket(ticket7);
        manager.addTicket(ticket8);
        manager.addTicket(ticket9);
        manager.addTicket(ticket10);
        manager.addTicket(ticket11);
        manager.addTicket(ticket12);

        Ticket[] actual = manager.findTicket("MOW", "KZN");
        Ticket[] expected = {ticket1, ticket12, ticket10, ticket7, ticket6};

        Assertions.assertArrayEquals(expected, actual);


    }
}
