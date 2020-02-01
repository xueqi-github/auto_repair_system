package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = ""t_maintenance_record"")
public class MaintenanceLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "parts_name")
    private String partsName;

    @Column(name = "maintenance_part_info_id")
    private Integer maintenancePartInfoId;

    @Column(name = "maintenance_costs")
    private Long maintenanceCosts;

    @Column(name = "create_time")
    private Date createTime;

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
     * @return car_id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * @param carId
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
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
     * @return parts_name
     */
    public String getPartsName() {
        return partsName;
    }

    /**
     * @param partsName
     */
    public void setPartsName(String partsName) {
        this.partsName = partsName == null ? null : partsName.trim();
    }

    /**
     * @return maintenance_part_info_id
     */
    public Integer getMaintenancePartInfoId() {
        return maintenancePartInfoId;
    }

    /**
     * @param maintenancePartInfoId
     */
    public void setMaintenancePartInfoId(Integer maintenancePartInfoId) {
        this.maintenancePartInfoId = maintenancePartInfoId;
    }

    /**
     * @return maintenance_costs
     */
    public Long getMaintenanceCosts() {
        return maintenanceCosts;
    }

    /**
     * @param maintenanceCosts
     */
    public void setMaintenanceCosts(Long maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}