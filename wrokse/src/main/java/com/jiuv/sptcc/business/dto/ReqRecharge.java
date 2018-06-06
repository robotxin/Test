package com.jiuv.sptcc.business.dto;
public class ReqRecharge{
private String reqCode;
private String fwdCode;
private String acqCode;
private String reqId;
private String reqTime;
private String userId;
private String oppUserId;
private String cardAccount;
private String txnAmt;
private String remark;
public String getReqcode()
{
return this.reqCode;
}
public void setReqcode(String reqCode)
{
 this.reqCode = reqCode;
}
public String getFwdcode()
{
return this.fwdCode;
}
public void setFwdcode(String fwdCode)
{
 this.fwdCode = fwdCode;
}
public String getAcqcode()
{
return this.acqCode;
}
public void setAcqcode(String acqCode)
{
 this.acqCode = acqCode;
}
public String getReqid()
{
return this.reqId;
}
public void setReqid(String reqId)
{
 this.reqId = reqId;
}
public String getReqtime()
{
return this.reqTime;
}
public void setReqtime(String reqTime)
{
 this.reqTime = reqTime;
}
public String getUserid()
{
return this.userId;
}
public void setUserid(String userId)
{
 this.userId = userId;
}
public String getOppuserid()
{
return this.oppUserId;
}
public void setOppuserid(String oppUserId)
{
 this.oppUserId = oppUserId;
}
public String getCardaccount()
{
return this.cardAccount;
}
public void setCardaccount(String cardAccount)
{
 this.cardAccount = cardAccount;
}
public String getTxnamt()
{
return this.txnAmt;
}
public void setTxnamt(String txnAmt)
{
 this.txnAmt = txnAmt;
}
public String getRemark()
{
return this.remark;
}
public void setRemark(String remark)
{
 this.remark = remark;
}
}
