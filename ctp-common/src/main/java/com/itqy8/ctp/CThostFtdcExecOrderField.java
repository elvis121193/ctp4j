/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcExecOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    ctpJNI.CThostFtdcExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return ctpJNI.CThostFtdcExecOrderField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcExecOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcExecOrderField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CThostFtdcExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CThostFtdcExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CThostFtdcExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CThostFtdcExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ctpJNI.CThostFtdcExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ctpJNI.CThostFtdcExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CThostFtdcExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CThostFtdcExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    ctpJNI.CThostFtdcExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return ctpJNI.CThostFtdcExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    ctpJNI.CThostFtdcExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return ctpJNI.CThostFtdcExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    ctpJNI.CThostFtdcExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return ctpJNI.CThostFtdcExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    ctpJNI.CThostFtdcExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return ctpJNI.CThostFtdcExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return ctpJNI.CThostFtdcExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcExecOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CThostFtdcExecOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcExecOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcExecOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcExecOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcExecOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ctpJNI.CThostFtdcExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ctpJNI.CThostFtdcExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpJNI.CThostFtdcExecOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpJNI.CThostFtdcExecOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcExecOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcExecOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CThostFtdcExecOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CThostFtdcExecOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return ctpJNI.CThostFtdcExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ctpJNI.CThostFtdcExecOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ctpJNI.CThostFtdcExecOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ctpJNI.CThostFtdcExecOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ctpJNI.CThostFtdcExecOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ctpJNI.CThostFtdcExecOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ctpJNI.CThostFtdcExecOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    ctpJNI.CThostFtdcExecOrderField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return ctpJNI.CThostFtdcExecOrderField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ctpJNI.CThostFtdcExecOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CThostFtdcExecOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CThostFtdcExecOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CThostFtdcExecOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CThostFtdcExecOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcExecOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcExecOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CThostFtdcExecOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CThostFtdcExecOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpJNI.CThostFtdcExecOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpJNI.CThostFtdcExecOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ctpJNI.CThostFtdcExecOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ctpJNI.CThostFtdcExecOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerExecOrderSeq(int value) {
    ctpJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerExecOrderSeq() {
    return ctpJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_get(swigCPtr, this);
  }

  public CThostFtdcExecOrderField() {
    this(ctpJNI.new_CThostFtdcExecOrderField(), true);
  }

}
