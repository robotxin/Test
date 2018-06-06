package com.jiuyv.sptcc.token.dto;
public class ReqMessage<T>{
private String version;
private MobileType mobileType;
private GpsInfo gpsInfo;
private String token;
private String accessToken;
private String reqOrgCode;
private T reqData;
public String getVersion()
{
return this.version;
}
public void setVersion(String version)
{
 this.version = version;
}
public MobileType getMobileType()
{
return this.mobileType;
}
public void setMobileType(MobileType mobileType)
{
 this.mobileType = mobileType;
}
public GpsInfo getGpsInfo()
{
return this.gpsInfo;
}
public void setGpsInfo(GpsInfo gpsInfo)
{
 this.gpsInfo = gpsInfo;
}
public String getToken()
{
return this.token;
}
public void setToken(String token)
{
 this.token = token;
}
public String getAccessToken()
{
return this.accessToken;
}
public void setAccessToken(String accessToken)
{
 this.accessToken = accessToken;
}
public String getReqOrgCode()
{
return this.reqOrgCode;
}
public void setReqOrgCode(String reqOrgCode)
{
 this.reqOrgCode = reqOrgCode;
}
public T getReqData()
{
return this.reqData;
}
public void setReqData(T reqData)
{
 this.reqData = reqData;
}
}
