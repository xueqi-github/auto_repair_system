package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reservation_record")
public class ReservationRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "appointment_time")
    private Date appointmentTime;

    @Column(name = "error_description")
    private String errorDescription;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "car_number")
    private String carNumber;

    private String phone;

    /**
     * 预约状态
     */
    @Column(name = "book_status")
    private Integer bookStatus;

    /**
     * 创建时间
     */
    @Column(name = "crate_time")
    private Date crateTime;

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
     * @return appointment_time
     */
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * @param appointmentTime
     */
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * @return error_description
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * @param errorDescription
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription == null ? null : errorDescription.trim();
    }

    /**
     * @return client_name
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * @return car_number
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * @param carNumber
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取预约状态
     *
     * @return book_status - 预约状态
     */
    public Integer getBookStatus() {
        return bookStatus;
    }

    /**
     * 设置预约状态
     *
     * @param bookStatus 预约状态
     */
    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    /**
     * 获取创建时间
     *
     * @return crate_time - 创建时间
     */
    public Date getCrateTime() {
        return crateTime;
    }

    /**
     * 设置创建时间
     *
     * @param crateTime 创建时间
     */
    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }
}