package com.jiuyv.sptcc.b2bgateway.business.dto;
public class JsonDataDTO{
private String jsonBody;
private String sign;
private String encdata;
private String reqOrgCode;
public String getJsonBody()
{
return this.jsonBody;
}
public void setJsonBody(String jsonBody)
{
 this.jsonBody = jsonBody;
}
public String getSign()
{
return this.sign;
}
public void setSign(String sign)
{
 this.sign = sign;
}
public String getEncdata()
{
return this.encdata;
}
public void setEncdata(String encdata)
{
 this.encdata = encdata;
}
public String getReqOrgCode()
{
return this.reqOrgCode;
}
public void setReqOrgCode(String reqOrgCode)
{
 this.reqOrgCode = reqOrgCode;
}
}
