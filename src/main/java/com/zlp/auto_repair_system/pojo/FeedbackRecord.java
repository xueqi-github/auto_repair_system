package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_feedback_record")
public class FeedbackRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "feedback_content")
    private String feedbackContent;

    /**
     * 回复状态
     */
    @Column(name = "recoil_status")
    private String recoilStatus;

    @Column(name = "client_name")
    private String clientName;

    /**
     * 联系方式
     */
    private String phone;

    @Column(name = "message_time")
    private Date messageTime;

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
     * @return feedback_content
     */
    public String getFeedbackContent() {
        return feedbackContent;
    }

    /**
     * @param feedbackContent
     */
    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }

    /**
     * 获取回复状态
     *
     * @return recoil_status - 回复状态
     */
    public String getRecoilStatus() {
        return recoilStatus;
    }

    /**
     * 设置回复状态
     *
     * @param recoilStatus 回复状态
     */
    public void setRecoilStatus(String recoilStatus) {
        this.recoilStatus = recoilStatus == null ? null : recoilStatus.trim();
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
     * 获取联系方式
     *
     * @return phone - 联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系方式
     *
     * @param phone 联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return message_time
     */
    public Date getMessageTime() {
        return messageTime;
    }

    /**
     * @param messageTime
     */
    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }
}