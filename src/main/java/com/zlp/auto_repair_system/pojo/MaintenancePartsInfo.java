package com.zlp.auto_repair_system.pojo;

import javax.persistence.*;

@Table(name = "t_maintenance_parts_info")
public class MaintenancePartsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "part_id")
    private String partId;

    @Column(name = "part_number")
    private Integer partNumber;

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
     * @return part_id
     */
    public String getPartId() {
        return partId;
    }

    /**
     * @param partId
     */
    public void setPartId(String partId) {
        this.partId = partId == null ? null : partId.trim();
    }

    /**
     * @return part_number
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber
     */
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }
}