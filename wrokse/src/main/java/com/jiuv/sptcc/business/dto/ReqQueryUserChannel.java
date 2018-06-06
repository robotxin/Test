package com.jiuv.sptcc.business.dto;
public class ReqQueryUserChannel{
private String reqId;
private String systemTraceId;
private String reqOrgCode;
private String txnCode;
private String reqTime;
private String userId;
public String getReqId()
{
return this.reqId;
}
public void setReqId(String reqId)
{
 this.reqId = reqId;
}
public String getSystemTraceId()
{
return this.systemTraceId;
}
public void setSystemTraceId(String systemTraceId)
{
 this.systemTraceId = systemTraceId;
}
public String getReqOrgCode()
{
return this.reqOrgCode;
}
public void setReqOrgCode(String reqOrgCode)
{
 this.reqOrgCode = reqOrgCode;
}
public String getTxnCode()
{
return this.txnCode;
}
public void setTxnCode(String txnCode)
{
 this.txnCode = txnCode;
}
public String getReqTime()
{
return this.reqTime;
}
public void setReqTime(String reqTime)
{
 this.reqTime = reqTime;
}
public String getUserId()
{
return this.userId;
}
public void setUserId(String userId)
{
 this.userId = userId;
}
}
