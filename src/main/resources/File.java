    /**
     *  客户类型 01投保人/02被保人/03投被保人
     */
    private String clientType;
    /**
     *  客户类型描述
     */
    private String clientTypeDesc;
    /**
     *  投保单系统编号
     */
    private String applyNo;
    /**
     *  投保单号
     *  
     */
    private String applyBarCode;
    /**
     *  保单号
     */
    private String policyNo;
    /**
     *  主险名称
     */
    private String mainProductPlan;
    /**
     *  生效日期
     */
    private java.util.Date effectDate;
    /**
     *  保单状态
     */
    private String dutyStatus;
    /**
     *  保单状态描述
     */
    private String dutyStatusDesc;
    /**
     *  投保单状态
     */
    private String applyStatus;
    /**
     *  投保单状态描述
     */
    private String applyStatusDesc;
    /**
     *  投保日期
     */
    private java.util.Date applyDate;
    /**
     *  投保人姓名
     */
    private String appClientName;
    /**
     *  投保人客户号
     */
    private String appClientNo;
    /**
     *  投保人姓名描述
     */
    private String appClientSexDesc;
    /**
     *  被保人姓名
     */
    private String insClientName;
    /**
     *  被保人客户号
     */
    private String insClientNo;
    /**
     *  保单渠道
     */
    private String channleType;
    /**
     *  保单渠道描述信息
     */
    private String channelTypeDesc;

    /**
     *  业务员信息
     */
    private EmployeeInfoManage employeeInfoManage;

    /**
     *  合计保费
     */
    private BigDecimal modalTotalPrem;

    /**
     *  保单所属机构名称
     */
    private String policyBranchName;
    /**
     *  保单所属机构代码
     */
    private String policyBranchCode;


    public String getPolicyBranchCode() {
        return policyBranchCode;
    }

    public void setPolicyBranchCode(String policyBranchCode) {
        this.policyBranchCode = policyBranchCode;
    }

    public String getPolicyBranchName() {
        return policyBranchName;
    }

    public void setPolicyBranchName(String policyBranchName) {
        this.policyBranchName = policyBranchName;
    }

    public BigDecimal getModalTotalPrem() {
        return modalTotalPrem;
    }

    public void setModalTotalPrem(BigDecimal modalTotalPrem) {
        this.modalTotalPrem = modalTotalPrem;
    }

    public EmployeeInfoManage getEmployeeInfoManage() {
        return employeeInfoManage;
    }

    public void setEmployeeInfoManage(EmployeeInfoManage employeeInfoManage) {
        this.employeeInfoManage = employeeInfoManage;
    }

    public String getAppClientSexDesc() {
        return appClientSexDesc;
    }

    public void setAppClientSexDesc(String appClientSexDesc) {
        this.appClientSexDesc = appClientSexDesc;
    }

    public String getChannleType() {
        return channleType;
    }

    public void setChannleType(String channleType) {
        this.channleType = channleType;
    }

    public String getChannelTypeDesc() {
        return channelTypeDesc;
    }

    public void setChannelTypeDesc(String channelTypeDesc) {
        this.channelTypeDesc = channelTypeDesc;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public java.util.Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(java.util.Date effectDate) {
        this.effectDate = effectDate;
    }

    public String getDutyStatus() {
        return dutyStatus;
    }

    public void setDutyStatus(String dutyStatus) {
        this.dutyStatus = dutyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyDate(java.util.Date applyDate) {
        this.applyDate = applyDate;
    }

    public java.util.Date getApplyDate() {
        return applyDate;
    }

    public void setApplyBarCode(String applyBarCode) {
        this.applyBarCode = applyBarCode;
    }

    @Override
    public String toString() {
        return "ClientPolicy [clientType=" + clientType + ", clientTypeDesc="
                + clientTypeDesc + ", policyNo=" + policyNo
                + ", mainProductPlan=" + mainProductPlan + "]";
    }

    public String getApplyBarCode() {
        return applyBarCode;
    }

    public String getClientTypeDesc() {
        return clientTypeDesc;
    }

    public void setClientTypeDesc(String clientTypeDesc) {
        this.clientTypeDesc = clientTypeDesc;
    }

    public String getDutyStatusDesc() {
        return dutyStatusDesc;
    }

    public void setDutyStatusDesc(String dutyStatusDesc) {
        this.dutyStatusDesc = dutyStatusDesc;
    }

    public void setApplyStatusDesc(String applyStatusDesc) {
        this.applyStatusDesc = applyStatusDesc;
    }

    public String getApplyStatusDesc() {
        return applyStatusDesc;
    }

    /**
     *  @param mainProductPlan the mainProductPlan to set
     */
    public void setMainProductPlan(String mainProductPlan) {
        this.mainProductPlan = mainProductPlan;
    }

    /**
     *  @return the mainProductPlan
     */
    public String getMainProductPlan() {
        return mainProductPlan;
    }

    public String getAppClientName() {
        return appClientName;
    }

    public void setAppClientName(String appClientName) {
        this.appClientName = appClientName;
    }

    public String getAppClientNo() {
        return appClientNo;
    }

    public void setAppClientNo(String appClientNo) {
        this.appClientNo = appClientNo;
    }

    public String getInsClientName() {
        return insClientName;
    }

    public void setInsClientName(String insClientName) {
        this.insClientName = insClientName;
    }

    public String getInsClientNo() {
        return insClientNo;
    }

    public void setInsClientNo(String insClientNo) {
        this.insClientNo = insClientNo;
    }


}



