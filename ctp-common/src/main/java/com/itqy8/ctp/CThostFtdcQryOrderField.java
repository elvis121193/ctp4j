/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcQryOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcQryOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcQryOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcQryOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcQryOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcQryOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcQryOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcQryOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcQryOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcQryOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CThostFtdcQryOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CThostFtdcQryOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setInsertTimeStart(String value) {
    ctpJNI.CThostFtdcQryOrderField_InsertTimeStart_set(swigCPtr, this, value);
  }

  public String getInsertTimeStart() {
    return ctpJNI.CThostFtdcQryOrderField_InsertTimeStart_get(swigCPtr, this);
  }

  public void setInsertTimeEnd(String value) {
    ctpJNI.CThostFtdcQryOrderField_InsertTimeEnd_set(swigCPtr, this, value);
  }

  public String getInsertTimeEnd() {
    return ctpJNI.CThostFtdcQryOrderField_InsertTimeEnd_get(swigCPtr, this);
  }

  public CThostFtdcQryOrderField() {
    this(ctpJNI.new_CThostFtdcQryOrderField(), true);
  }

}