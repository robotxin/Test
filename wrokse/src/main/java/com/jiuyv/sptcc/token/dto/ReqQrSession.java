package com.jiuyv.sptcc.token.dto;
public class ReqQrSession{
private String rightToken;
private String timeStamp;
private String acceptVersions;
private String sessionCode;
private String moblieTime;
public String getRightToken()
{
return this.rightToken;
}
public void setRightToken(String rightToken)
{
 this.rightToken = rightToken;
}
public String getTimeStamp()
{
return this.timeStamp;
}
public void setTimeStamp(String timeStamp)
{
 this.timeStamp = timeStamp;
}
public String getAcceptVersions()
{
return this.acceptVersions;
}
public void setAcceptVersions(String acceptVersions)
{
 this.acceptVersions = acceptVersions;
}
public String getSessionCode()
{
return this.sessionCode;
}
public void setSessionCode(String sessionCode)
{
 this.sessionCode = sessionCode;
}
public String getMoblieTime()
{
return this.moblieTime;
}
public void setMoblieTime(String moblieTime)
{
 this.moblieTime = moblieTime;
}
}
