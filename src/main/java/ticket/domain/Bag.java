package ticket.domain;

public class Bag {
    private Long amount;
    private Invitation invitaion;
    private Ticket ticket;

    public Bag(Invitation invitaion, Long amount) {
        this.amount = amount;
        this.invitaion = invitaion;
    }

    public Bag(Long amount) {
        this(null, amount);
    }

    public boolean hasInvitation() {
        return invitaion != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
