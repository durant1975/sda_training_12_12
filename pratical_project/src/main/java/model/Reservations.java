package model;

import javax.persistence.*;

@Entity
@Table(name = "Reservation")
public class Reservations {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ReservationId")
    private int reservationId;

    @Column(name = "IdPaid")
    private int isPaid;

    @Column(name = "ClientId")
    private int clientId;

    @Column(name = "ScheduleId")
    private int scheduleId;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(int isPaid) {
        this.isPaid = isPaid;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }
}
