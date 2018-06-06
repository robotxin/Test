package com.jiuyv.sptcc.token.dto;
public class ApplyTokenReq{
private String appId;
private String timeStamp;
private String appOS;
private String userId;
public String getAppId()
{
return this.appId;
}
public void setAppId(String appId)
{
 this.appId = appId;
}
public String getTimeStamp()
{
return this.timeStamp;
}
public void setTimeStamp(String timeStamp)
{
 this.timeStamp = timeStamp;
}
public String getAppOS()
{
return this.appOS;
}
public void setAppOS(String appOS)
{
 this.appOS = appOS;
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
