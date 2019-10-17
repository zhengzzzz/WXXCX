package com.ikats.express.model;

import java.io.Serializable;
import java.util.Date;

/**
 * businessmodel
 * @author 
 */
public class Businessmodel implements Serializable {
    private long entityid;

    /**
     * 客户编码
     */
    private String clientcode;

    /**
     * 业务模式编码
     */
    private String businessmodelcode;

    /**
     * 业务模式名称
     */
    private String businessmodelname;

    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * 清关口岸编码
     */
    private String clearportcode;

    /**
     * 快递公司编码
     */
    private String clientExpressCode;

    /**
     * 出入口标识
     */
    private String ieflag;

    /**
     * 头程物流公司
     */
    private String purchaselogistics;

    /**
     * 操作仓/揽收仓
     */
    private String stockcode;

    /**
     * 干线运输公司编码
     */
    private String mainlinecode;

    /**
     * 物流公司编码
     */
    private String logisticscompanycode;

    private String sourcecountrycode;

    private String destinationcountrycode;

    private String freightchargecurrency;

    private String codchargecurrency;

    private Integer status;

    private String creatorcode;

    private Date createtime;

    private String modifiercode;

    private Date modifiedtime;

    private String stationDeparture;

    private String stationArrived;

    private static final long serialVersionUID = 1L;

    public long getEntityid() {
        return entityid;
    }

    public void setEntityid(long entityid) {
        this.entityid = entityid;
    }

    public String getClientcode() {
        return clientcode;
    }

    public void setClientcode(String clientcode) {
        this.clientcode = clientcode;
    }

    public String getBusinessmodelcode() {
        return businessmodelcode;
    }

    public void setBusinessmodelcode(String businessmodelcode) {
        this.businessmodelcode = businessmodelcode;
    }

    public String getBusinessmodelname() {
        return businessmodelname;
    }

    public void setBusinessmodelname(String businessmodelname) {
        this.businessmodelname = businessmodelname;
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    public String getClearportcode() {
        return clearportcode;
    }

    public void setClearportcode(String clearportcode) {
        this.clearportcode = clearportcode;
    }

    public String getClientExpressCode() {
        return clientExpressCode;
    }

    public void setClientExpressCode(String clientExpressCode) {
        this.clientExpressCode = clientExpressCode;
    }

    public String getIeflag() {
        return ieflag;
    }

    public void setIeflag(String ieflag) {
        this.ieflag = ieflag;
    }

    public String getPurchaselogistics() {
        return purchaselogistics;
    }

    public void setPurchaselogistics(String purchaselogistics) {
        this.purchaselogistics = purchaselogistics;
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode;
    }

    public String getMainlinecode() {
        return mainlinecode;
    }

    public void setMainlinecode(String mainlinecode) {
        this.mainlinecode = mainlinecode;
    }

    public String getLogisticscompanycode() {
        return logisticscompanycode;
    }

    public void setLogisticscompanycode(String logisticscompanycode) {
        this.logisticscompanycode = logisticscompanycode;
    }

    public String getSourcecountrycode() {
        return sourcecountrycode;
    }

    public void setSourcecountrycode(String sourcecountrycode) {
        this.sourcecountrycode = sourcecountrycode;
    }

    public String getDestinationcountrycode() {
        return destinationcountrycode;
    }

    public void setDestinationcountrycode(String destinationcountrycode) {
        this.destinationcountrycode = destinationcountrycode;
    }

    public String getFreightchargecurrency() {
        return freightchargecurrency;
    }

    public void setFreightchargecurrency(String freightchargecurrency) {
        this.freightchargecurrency = freightchargecurrency;
    }

    public String getCodchargecurrency() {
        return codchargecurrency;
    }

    public void setCodchargecurrency(String codchargecurrency) {
        this.codchargecurrency = codchargecurrency;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatorcode() {
        return creatorcode;
    }

    public void setCreatorcode(String creatorcode) {
        this.creatorcode = creatorcode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifiercode() {
        return modifiercode;
    }

    public void setModifiercode(String modifiercode) {
        this.modifiercode = modifiercode;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getStationDeparture() {
        return stationDeparture;
    }

    public void setStationDeparture(String stationDeparture) {
        this.stationDeparture = stationDeparture;
    }

    public String getStationArrived() {
        return stationArrived;
    }

    public void setStationArrived(String stationArrived) {
        this.stationArrived = stationArrived;
    }
}