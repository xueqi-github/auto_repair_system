package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_role")
public class Role {
    /**
     * 角色编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 角色名称
     */
    private String name;

    @Column(name = "add_people")
    private String addPeople;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取角色编号
     *
     * @return id - 角色编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置角色编号
     *
     * @param id 角色编号
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return add_people
     */
    public String getAddPeople() {
        return addPeople;
    }

    /**
     * @param addPeople
     */
    public void setAddPeople(String addPeople) {
        this.addPeople = addPeople == null ? null : addPeople.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}