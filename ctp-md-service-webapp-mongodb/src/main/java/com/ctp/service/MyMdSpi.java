package com.ctp.service;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.beanutils.BeanUtils;

import com.ctp.dao.MarketDataDao;
import com.ctp.data.entity.MarketData;
import com.ctp.data.entity.OHLCData10Minute;
import com.ctp.data.entity.OHLCData15Minute;
import com.ctp.data.entity.OHLCData1Day;
import com.ctp.data.entity.OHLCData1Hour;
import com.ctp.data.entity.OHLCData1Minute;
import com.ctp.data.entity.OHLCData30Minute;
import com.ctp.data.entity.OHLCData5Minute;
import com.ctp.data.service.OHLCDataService;
import com.ctp.trader.service.InstrumentService;
import com.itqy8.ctp.CThostFtdcDepthMarketDataField;
import com.itqy8.ctp.CThostFtdcForQuoteRspField;
import com.itqy8.ctp.CThostFtdcMdApi;
import com.itqy8.ctp.CThostFtdcMdSpi;
import com.itqy8.ctp.CThostFtdcReqUserLoginField;
import com.itqy8.ctp.CThostFtdcRspInfoField;
import com.itqy8.ctp.CThostFtdcRspUserLoginField;
import com.itqy8.ctp.CThostFtdcSpecificInstrumentField;
import com.itqy8.ctp.CThostFtdcUserLogoutField;
import com.itqy8.framework.util.SpringPropertyResourceReader;
import com.itqy8.framework.util.SpringUtil;

public class MyMdSpi extends CThostFtdcMdSpi{

	private CThostFtdcMdApi mdApi;
	private InstrumentService instrumentService;
	private OHLCDataService  oHLCDataService;
	private MarketDataDao  marketDataDao;
	public MyMdSpi(CThostFtdcMdApi mdApi){
		this.mdApi = mdApi;
		this.oHLCDataService = (OHLCDataService) SpringUtil.getBean("oHLCDataService");
		this.marketDataDao = (MarketDataDao) SpringUtil.getBean("marketDataDao");
	}
	
	@Override
	public synchronized void delete() {
	}

	@Override
	public void OnFrontConnected() {
		System.out.println("行情前置连接成功");
		System.out.println("用户登录中...");
		String brokerid = SpringPropertyResourceReader.getProperty("ctp.brokerId");
		String password = SpringPropertyResourceReader.getProperty("ctp.password");
		String userid = SpringPropertyResourceReader.getProperty("ctp.userid");
		CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField ();
		userLoginField.setBrokerID(brokerid);
		userLoginField.setUserID(userid);
		userLoginField.setPassword(password);
		mdApi.ReqUserLogin(userLoginField, 1);
	}

	@Override
	public void OnFrontDisconnected(int nReason) {
		System.out.println("行情前置连接断开");
	}

	@Override
	public void OnHeartBeatWarning(int nTimeLapse) {
	}

	@Override
	public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		if(pRspInfo.getErrorID()==0){
			System.out.println("用户登录成功");
		}
//		List<String> insls = instrumentService.getInstrumentIds().getResult();
		String[] str = {"rb1610"};
//		str = insls.toArray(str);
		this.mdApi.SubscribeMarketData(str, str.length);
	}

	@Override
	public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("===========OnRspError========");
	}

	@Override
	public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("===========OnRspSubMarketData========");
	}

	@Override
	public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("===========OnRspUnSubMarketData========");
	}

	@Override
	public void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("===========OnRspSubForQuoteRsp========");
	}

	@Override
	public void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("===========OnRspUnSubForQuoteRsp========");
	}

	@Override
	public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
        MarketData md = new MarketData();
        try {
			BeanUtils.copyProperties(md, pDepthMarketData);
			md.setId(new SimpleDateFormat("yyyyMMddHH:mm:ss:SSS").parse(md.getTradingDay()+md.getUpdateTime()+":"+md.getUpdateMillisec()).getTime());
		} catch (IllegalAccessException | InvocationTargetException | ParseException e) {
			e.printStackTrace();
		}
        this.oHLCDataService.addAllOHLCData(md);
	}

	@Override
	public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
		System.out.println("===========call back========");
	}

	public void setInstrumentService(InstrumentService instrumentService) {
		this.instrumentService = instrumentService;
	}
}
