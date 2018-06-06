package com.jiuyv.sptcc.token.dto;
public class RespMessage<T>{
private String success;
private String respCode;
private String respInfo;
private T respData;
public String getSuccess()
{
return this.success;
}
public void setSuccess(String success)
{
 this.success = success;
}
public String getRespCode()
{
return this.respCode;
}
public void setRespCode(String respCode)
{
 this.respCode = respCode;
}
public String getRespInfo()
{
return this.respInfo;
}
public void setRespInfo(String respInfo)
{
 this.respInfo = respInfo;
}
public T getRespData()
{
return this.respData;
}
public void setRespData(T respData)
{
 this.respData = respData;
}
}
