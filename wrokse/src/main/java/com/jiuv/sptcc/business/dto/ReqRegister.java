package com.jiuv.sptcc.business.dto;
import java.util.List;
public class ReqRegister{
private String version;
private String token;
private String reqOrgCode;
private String userName;
private String mobile;
private String idNo;
private String responseType;
private String scope;
private String state;
private List authRoleList;
private String orgUserId;
public String getVersion()
{
return this.version;
}
public void setVersion(String version)
{
 this.version = version;
}
public String getToken()
{
return this.token;
}
public void setToken(String token)
{
 this.token = token;
}
public String getReqOrgCode()
{
return this.reqOrgCode;
}
public void setReqOrgCode(String reqOrgCode)
{
 this.reqOrgCode = reqOrgCode;
}
public String getUserName()
{
return this.userName;
}
public void setUserName(String userName)
{
 this.userName = userName;
}
public String getMobile()
{
return this.mobile;
}
public void setMobile(String mobile)
{
 this.mobile = mobile;
}
public String getIdNo()
{
return this.idNo;
}
public void setIdNo(String idNo)
{
 this.idNo = idNo;
}
public String getResponseType()
{
return this.responseType;
}
public void setResponseType(String responseType)
{
 this.responseType = responseType;
}
public String getScope()
{
return this.scope;
}
public void setScope(String scope)
{
 this.scope = scope;
}
public String getState()
{
return this.state;
}
public void setState(String state)
{
 this.state = state;
}
public List getAuthRoleList()
{
return this.authRoleList;
}
public void setAuthRoleList(List authRoleList)
{
 this.authRoleList = authRoleList;
}
public String getOrgUserId()
{
return this.orgUserId;
}
public void setOrgUserId(String orgUserId)
{
 this.orgUserId = orgUserId;
}
}
