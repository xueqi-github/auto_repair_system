package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reservation_process")
public class ReservationProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "reservation_id")
    private Integer reservationId;

    @Column(name = "processing_time")
    private Date processingTime;

    @Column(name = "employee_id")
    private Integer employeeId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return reservation_id
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * @param reservationId
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * @return processing_time
     */
    public Date getProcessingTime() {
        return processingTime;
    }

    /**
     * @param processingTime
     */
    public void setProcessingTime(Date processingTime) {
        this.processingTime = processingTime;
    }

    /**
     * @return employee_id
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}