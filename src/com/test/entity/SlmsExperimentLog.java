package com.test.entity;

import java.util.Date;

public class SlmsExperimentLog {
    private String id;

    private String logcode;

    private String experimentid;

    private String problemfeedback;

    private String problemstatus;

    private String infourl;

    private String liabler;

    private String createBy;

    private Date createDate;

    private String updaterBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLogcode() {
        return logcode;
    }

    public void setLogcode(String logcode) {
        this.logcode = logcode == null ? null : logcode.trim();
    }

    public String getExperimentid() {
        return experimentid;
    }

    public void setExperimentid(String experimentid) {
        this.experimentid = experimentid == null ? null : experimentid.trim();
    }

    public String getProblemfeedback() {
        return problemfeedback;
    }

    public void setProblemfeedback(String problemfeedback) {
        this.problemfeedback = problemfeedback == null ? null : problemfeedback.trim();
    }

    public String getProblemstatus() {
        return problemstatus;
    }

    public void setProblemstatus(String problemstatus) {
        this.problemstatus = problemstatus == null ? null : problemstatus.trim();
    }

    public String getInfourl() {
        return infourl;
    }

    public void setInfourl(String infourl) {
        this.infourl = infourl == null ? null : infourl.trim();
    }

    public String getLiabler() {
        return liabler;
    }

    public void setLiabler(String liabler) {
        this.liabler = liabler == null ? null : liabler.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdaterBy() {
        return updaterBy;
    }

    public void setUpdaterBy(String updaterBy) {
        this.updaterBy = updaterBy == null ? null : updaterBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}