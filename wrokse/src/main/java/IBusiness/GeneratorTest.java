package IBusiness;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @describe
 * @auther chen_yang
 * @create 2018-04-13-14:51
 */
public class GeneratorTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(GeneratorTest.class);

  public static void main(String[] args) {
    String data = "用户id\tuserId\tVARCHAR\t32\tM\t\n" +
        "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n" +
        "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n" +
        "推送时间戳\ttimeStamp\tvarchar \t14\tM\t\n" +
        "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n" +
        "行程单号创建时间\torderTime\tVARCHAR\t14\tM\t\n" +
        "终端交易时间\ttidTransTime\tVARCHAR\t14\tM\t\n" +
        "进站时间\tintoTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n" +
        "出站时间\toutTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n" +
        "进站站点序号\tinStationId\tVARCHAR\t8\tC\t\n" +
        "进站站点名称\tinStationName\tVARCHAR\t128\tC\t\n" +
        "线路号\tlineId\tVARCHAR\t6\tM\t\n" +
        "线路名称\tlineName\tVARCHAR\t128\tC\t\n" +
        "出站站点序号\toutStationId\tVARCHAR\t8\tC\t\n" +
        "出站站点名称\toutStationName\tVARCHAR\t128\tC\t\n" +
        "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000,0000不参与优惠,0001联乘优惠\n" +
        "消费类型\ttxnType\tVARCHAR\t2\tC\t00—\t单次消费01—\t复合消费02—\t系统补扣\n" +
        "优惠前原始票价\torignalTxnAmount\tnumber\t4\tM\t精确到分\n" +
        "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tC\t精确到分";
    data = "用户id\tuserId\tVARCHAR\t32\tM\t\n" +
        "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n" +
        "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n" +
        "推送时间戳\ttimeStamp\tvarchar \t14\tM\t\n" +
        "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n" +
        "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000,0000不参与优惠,0001联乘优惠\n" +
        "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tM\t精确到分";

    data = "查询的服务名称\tqueryService\tvarchar \t10\tC\t\n" +
        "开始时间\tstartTime\tChar\t14\tM\t\n" +
        "结束时间\tendTime\tChar\t14\tM\t\n" +
        "开始页码\tstartpage\tnumber \t10\tC\t默认为1,从1开始\n" +
        "每页数据大小\tpageSize\tnumber \t10\tC\t不传默认为20\n" +
        "排序方式\tsortType\tvarchar\t4\tC\tASC正序DESC逆序默认逆序结果按照行程单号创建时间排序";

    data = "交易代码\ttransCode\tCHAR\t5\tM\t02642\n" +
        "请求方机构\treqOrgCode\tVARCHAR\t15\tM\t\n" +
        "申请流水id\tappId\tVARCHAR\t32\tM\t\n" +
        "申请用户id\tappUserId\tVARCHAR\t32\tM\t\n" +
        "申请时间\tappTime\tCHAR\t14\tM\tyyyymmddHHMMSS";

    data = "交易代码\ttransCode\tCHAR\t5\tM\t02643\n" +
        "应答方机构\tresOrgCode\tVARCHAR\t15\tM\t\n" +
        "申请流水id\tappId\tVARCHAR\t32\tM\t\n" +
        "申请用户id\tappUserId\tVARCHAR\t32\tM\t\n" +
        "用户信息列表\tuserInfoList\tList\t\tM\t\n" +
        "应答码\trespCode\tVARCHAR\t2\tM\t";

    data = "第三方机构号\torgCode\tVARCHAR\t32\tM\t第三方机构号\n" +
        "第三方机构用户Id\torgUserId\tVARCHAR\t32\tM\t第三方机构用户ID";

    data = "交易代码\ttransCode\tCHAR\t5\tM\t02628\n" +
        "请求方机构\treqOrgCode\tVARCHAR\t15\tM\t\n" +
        "申请流水id\tappId\tVARCHAR\t32\tM\t\n" +
        "申请用户id\tappUserId\tVARCHAR\t32\tM\t\n" +
        "申请用户身份证序列号\tappIdNo\tVARCHAR\t32\tM\t申请用户身份证序列号\n非身份证\n" +
        "终端设备\tterminalMark\tOB\t\tC\t见：附录A终端设备app请求时获取\n" +
        "位置信息\tgps\tobject\t\t\t参见附录A app请求时获取\n" +
        "申请时间\tappTime\tCHAR\t14\tM\tyyyymmddHHMMSS";

    data = "交易代码\ttransCode\tCHAR\t5\tM\t02628\n" +
        "请求方机构\treqOrgCode\tVARCHAR\t15\tM\t\n" +
        "申请流水id\tappId\tVARCHAR\t32\tM\t\n" +
        "申请用户id\tappUserId\tVARCHAR\t32\tM\t\n" +
        "申请用户身份证序列号\tappIdNo\tVARCHAR\t32\tM\t申请用户身份证序列号 非身份证\n" +
        "终端设备\tterminalMark\tOB\t\tC\t见：附录A终端设备app请求时获取\n" +
        "位置信息\tgps\tobject\t\t\t参见附录A app请求时获取\n" +
        "申请时间\tappTime\tCHAR\t14\tM\tyyyymmddHHMMSS";

    data = "交易代码\ttransCode\tCHAR\t5\tM\t见：交易代码说明\n" +
        "应答方机构\tresOrgCode\tVARCHAR\t15\tM\t\n" +
        "申请流水id\tappId\tVARCHAR\t32\tM\t\n" +
        "应答码\trespCode\tVARCHAR\t2\tM\t\n" +
        "用户注册状态\tuserStatus\tVARCHAR\t2\tM\t00:注册成功 01:注册失败 ";

    data = "请求机构代码\treqCode\tVARCHAR\t15\tC\t\n" +
        "发送机构代码\tfwdCode VARCHAR\t15\tC\t扩展用\n" +
        "受理机构代码\tacqCode VARCHAR\t15\tC\t扩展用\n" +
        "请求订单id\treqId\tVARCHAR\t32\tM\t请求方订单号\n" +
        "请求时间\treqTime\tCHAR\t14\tM\tyyyymmddHHMMSS\n" +
        "用户id\tuserId\tVARCHAR\t32\tM\t二维码系统的用户Id\n" +
        "卡账户号\tcardAccount\tCHAR\t20\tC\t右补空格\n" +
        "对端用户id\toppUserId\tVARCHAR\t32\tC\t第三方机构的用户Id\n" +
        "交易金额\ttxnAmt\tnumber\t12\tM\t不能为0，单位为分（不超过100）\n" +
        "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tC\t扣款关联的行程单号，可能没有\n" +
        "备注\tremark\tVARCHAR\t198\tC\t";
    data = "应答码\trespCode\tVARCHAR\t32\tM\t见：错误代码说明\n" +
        "应答信息\trespMsg\tVARCHAR\t200\tM\t见：错误代码说明 以下字段应答码是00时返回\n" +
        "应答订单id\tresId\tVARCHAR\t32\tM\t账户系统订单号\n" +
        "清算日期\tsettleChar\tCHAR\t14\tM\tyyyymmdd\n" +
        "余额符号\taccountSign\tCHAR\t1\tC\t贷方金额：C为正值，D代表负值\n" +
        "账户余额\taccountBalance\tnumber\t12\tC\t单位为分";
    data = "用户id\tuserId\tVARCHAR\t32\tM\t\n" +
        "第三方渠道用户标识\ttxnUserId\tvarchar \t32\t\t\n" +
        "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n" +
        "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n" +
        "行程单号创建时间\torderTime\tVARCHAR\t14\tM\t\n" +
        "终端交易时间\ttidTransTime\tVARCHAR\t14\tM\t\n" +
        "进站时间\tintoTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n" +
        "出站时间\toutTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n" +
        "进站站点序号\tinStationId\tVARCHAR\t8\tC\t\n" +
        "进站站点名称\tinStationName\tVARCHAR\t128\tC\t\n" +
        "线路号\tlineId\tVARCHAR\t6\tM\t\n" +
        "线路名称\tlineName\tVARCHAR\t128\tC\t\n" +
        "出站站点序号\toutStationId\tVARCHAR\t8\tC\t\n" +
        "出站站点名称\toutStationName\tVARCHAR\t128\tC\t\n" +
        "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为00000000不参与优惠0001联乘优惠\n" +
        "消费类型\ttxnType\tVARCHAR\t2\tC\t00—\t单次消费01—\t复合消费02—\t系统补扣\n" +
        "优惠前原始票价\torignalTxnAmount\tnumber\t4\tM\t精确到分\n" +
        "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tC\t精确到分";

    data = "        用户id\tuserId\tVARCHAR\t32\tM\n" +
        "        第三方渠道用户标识\ttxnUserId\tvarchar \t32\tC\n" +
        "        关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n" +
        "        订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n" +
        "        行程单号创建时间\torderTime\tVARCHAR\t14\tM\n" +
        "        终端交易时间\ttidTransTime\tVARCHAR\t14\tM\n" +
        "        进站时间\tintoTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n" +
        "        出站时间\toutTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n" +
        "        进站站点序号\tinStationId\tVARCHAR\t8\tC\n" +
        "        进站站点名称\tinStationName\tVARCHAR\t128\tC\n" +
        "        线路号\tlineId\tVARCHAR\t6\tM\n" +
        "        线路名称\tlineName\tVARCHAR\t128\tC\n" +
        "        出站站点序号\toutStationId\tVARCHAR\t8\tC\n" +
        "        出站站点名称\toutStationName\tVARCHAR\t128\tC\n" +
        "        优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000 0000不参与优惠 0001联乘优惠\n" +
        "        消费类型\ttxnType\tVARCHAR\t2\tC\t00—\t单次消费 01—\t复合消费 02—\t系统补扣\n" +
        "        优惠前原始票价\torignalTxnAmount\tnumber\t4\tM\t精确到分\n" +
        "        当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tC\t精确到分";

    data = "接入方机构号\treqOrgCode\tVARCHAR\t15\tM\t接入方机构标识,由双方事先约定等于 clientid\n"
        + "请求类型\tgrantType\tVARCHAR\t16\tM\t填refreshToken表示刷新令牌\n"
        + "刷新令牌\trefreshToken\tVARCHAR\t32\tM\t请求令牌时返回的刷新令牌\n"
        + "可访问资源权限列表\tscope\tList\t16\tC\t例如get_user_info%2Cget_info%2Cadd_t\n"
        + "签名域\tsign\tVARCHAR\t255\tM\t签名详见2.7.1";

    data = "应答码\trespCode\tVARCHAR\t32\tM\t\n"
        + "应答描述\tcodeDescription\tVARCHAR\t128\tM\t\n"
        + "验证令牌\taccessToken\tVARCHAR\t32\tM\t\n"
        + "令牌过期时间\texpiresTime\tchar\t14\tM\t北京时间YYYYMMDDhhmmss\n";

    data = "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n"
        + "充值金额\ttxnAmount\tnumber\t12\tM\t";
    data = "应答结果\trespInfo\tvarchar\t128\tC\t应答结果描述\n"
        + "交通宝支付订单号\torderId\tvarchar\t32\tC\t\n"
        + "第三方支付订单号\ttransctionId\tvarchar\t32\tC\t";

    data = "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n"
        + "交通宝支付订单号\torderId\tnumber\t32\tM\t原充值交易返回的交通宝支付订单号";

    data = "appID\tappId\tvarchar \t64\tM\t已备案，本次使用的app的id\n"
        + "外部系统时间\ttimeStamp\tchar\t14\tC\t\n"
        + "操作系统\tappOS\tvarchar\t64\tM\tAndroid或Ios\n"
        + "第三方授权码\toutAuthCode\tvarchar\t16\tM\t腾讯端的8字节授权码，后续填入二维码自定义域中\n"
        + "可接受二维码版本号\tacceptVersions\tvarchar\t64\tM\t逗号分隔可接受版本号如：80,81表示可接受版本是80,81版本\n"
        + "上次会话码\tsessionCode\tvarchar \t512\tC\t上一次请求成功后返回的会话码\n"
        + "手机时间\tmobileTime\tChar\t14\tC\t本手机时间（可选）";

    data = "应答码\trespCode\tVARCHAR\t32\tM\t见：错误代码说明\n"
        + "应答信息\trespMsg\tVARCHAR\t200\tM\t见：错误代码说明\n"
        + "应答订单id\tresId\tVARCHAR\t32\tM\t账户系统订单号\n"
        + "清算日期\tsettleChar\tCHAR\t14\tM\tyyyymmdd\n"
        + "余额符号\taccountSign\tCHAR\t1\tC\t贷方金额：C为正值，D代表负值\n"
        + "账户余额\taccountBalance\tnumber\t12\tC\t单位为分";

    data = "请求机构代码\treqCode\tVARCHAR\t15\tC\t\n"
        + "发送机构代码\tfwdCode VARCHAR\t15\tC\t扩展用\n"
        + "受理机构代码\tacqCode \tVARCHAR\t15\tC\t扩展用\n"
        + "请求订单id\treqId\tVARCHAR\t32\tM\t请求方订单号\n"
        + "请求时间\treqTime\tCHAR\t14\tM\tyyyymmddHHMMSS\n"
        + "用户id\tuserId\tVARCHAR\t32\tM\t二维码系统的用户Id\n"
        + "卡账户号\tcardAccount\tCHAR\t20\tC\t右补空格\n"
        + "对端用户id\toppUserId\tVARCHAR\t32\tC\t第三方机构的用户Id\n"
        + "交易金额\ttxnAmt\tnumber\t12\tM\t不能为0，单位为分\n"
        + "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tC\t扣款关联的行程单号\n"
        + "乘车码数据\tqrCode\tVARCHAR\t1024\tM\t后台采集的对应乘车码全文\n"
        + "备注\tremark\tVARCHAR\t200\tC\t";

    data = "应答码\trespCode\tVARCHAR\t32\tM\t见：错误代码说明\n"
        + "应答信息\trespMsg\tVARCHAR\t200\tM\t见：错误代码说明\n"
        + "以下字段应答码是00时返回\n"
        + "应答订单id\tresId\tVARCHAR\t32\tM\t账户系统订单号\n"
        + "清算日期\tsettleChar\tCHAR\t14\tM\tyyyymmdd\n"
        + "余额符号\taccountSign\tCHAR\t1\tC\t贷方金额：C为正值，D代表负值\n"
        + "账户余额\taccountBalance\tnumber\t12\tC\t单位为分";

    data = "用户id\tuserId\tVARCHAR\t32\tM\t\n"
        + "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n"
        + "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n"
        + "推送时间戳\ttimeStamp\tvarchar \t14\tM\t\n"
        + "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n"
        + "行程单号创建时间\torderTime\tVARCHAR\t14\tM\t\n"
        + "终端交易时间\ttidTransTime\tVARCHAR\t14\tM\t\n"
        + "进站时间\tintoTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n"
        + "出站时间\toutTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n"
        + "进站站点序号\tinStationId\tVARCHAR\t8\tC\t\n"
        + "进站站点名称\tinStationName\tVARCHAR\t128\tC\t\n"
        + "线路号\tlineId\tVARCHAR\t6\tM\t\n"
        + "线路名称\tlineName\tVARCHAR\t128\tC\t\n"
        + "出站站点序号\toutStationId\tVARCHAR\t8\tC\t\n"
        + "出站站点名称\toutStationName\tVARCHAR\t128\tC\t\n"
        + "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000\n0000不参与优惠\n0001联乘优惠\n"
        + "消费类型\ttxnType\tVARCHAR\t2\tC\t00—单次消费01—复合消费02—系统补扣\n"
        + "优惠前原始票价\torignalTxnAmount\tnumber\t4\tM\t精确到分\n"
        + "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tC\t精确到分\n"
        + "乘车码数据\tqrCode\tVARCHAR\t1024\tM\t后台采集的对应乘车码全文";

    data = "用户id\tuserId\tVARCHAR\t32\tM\t\n"
        + "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n"
        + "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n"
        + "推送时间戳\ttimeStamp\tvarchar \t14\tM\t\n"
        + "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n"
        + "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000\n0000不参与优惠\n0001联乘优惠\n"
        + "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tM\t精确到分";

    data = "查询的服务名称\tqueryService\tvarchar \t10\tC\t\n"
        + "开始时间\tstartTime\tChar\t14\tM\t\n"
        + "结束时间\tendTime\tChar\t14\tM\t\n"
        + "开始页码\tstartpage\tnumber \t10\tC\t默认为1，从1开始\n"
        + "每页数据大小\tpageSize\tnumber \t10\tC\t不传默认为20\n"
        + "排序方式\tsortType\tvarchar\t4\tC\tASC正序DESC逆序默认逆序结果按照行程单号创建时间排序";

    data = "交易代码\ttranCode\tCHAR\t5\tM\t02622\n"
        + "发送机构代码\tfwdCode\tVARCHAR\t15\tC\t扩展用\n"
        + "受理机构代码\tacqCode\tVARCHAR\t15\tC\t扩展用\n"
        + "请求订单id\treqId\tVARCHAR\t32\tM\t请求方订单号\n"
        + "请求时间\treqTime\tCHAR\t14\tM\tyyyymmddHHMMSS\n"
        + "用户id\tUserId\tVARCHAR\t32\tM\t\n"
        + "备注\tremark\tVARCHAR\t200\tC\t";

    data = "应答码\trespCode\tVARCHAR\t2\tM\t见：错误代码说明\n"
        + "应答信息\trespMsg\tVARCHAR\t200\tC\t见：错误代码说明\n"
        + "以下字段应答码是00时返回\n"
        + "账户状态\taccountStatus\tVARCHAR\t4\tM\t0：未启用1：正常2：口头挂失3：正式挂失4：密码重置5：销户\n"
        + "应答订单id\tresId\tVARCHAR\t32\tM\t\n"
        + "清算日期\tsettleChar\tCHAR\t14\tM\tyyyymmdd\n"
        + "以下字段账户状态是00时返回\n"
        + "余额符号\taccountSign\tCHAR\t1\tM\t贷方金额：C为正值，D代表负值\n"
        + "账面账户余额\taccountBalance\tnumber\t12\tM\t余额必须是正数，单位为分";

    data = "交易代码\ttranCode\tCHAR\t5\tM\t02648\n"
        + "线路号\tlineId\tCHAR\t6\tM\t2车型+4线路（来自线路卡）\n"
        + "备注\tremark\tVARCHAR\t200\tC\t";

    data = "应答码\trespCode\tVARCHAR\t2\tM\t见：错误代码说明\n"
        + "应答信息\trespMsg\tVARCHAR\t200\tC\t见：错误代码说明\n"
        + "以下字段应答码是00时返回\n"
        + "线路名称\tlineName\tVARCHAR\t128\tM\t";

    data = "交易代码\ttranCode\tCHAR\t5\tM\t02646\n"
        + "请求订单id\treqId\tVARCHAR\t32\tM\t请求方订单号\n"
        + "用户id\tuserId\tVARCHAR\t32\tM\t\n"
        + "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n"
        + "推送时间戳\ttimeStamp\tvarchar \t14\tM\t\n"
        + "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n"
        + "行程单号创建时间\torderTime\tVARCHAR\t14\tM\t\n"
        + "终端交易时间\ttidTransTime\tVARCHAR\t14\tM\t\n"
        + "进站时间\tintoTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n"
        + "出站时间\toutTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n"
        + "进站站点序号\tinStationId\tVARCHAR\t8\tC\t\n"
        + "进站站点名称\tinStationName\tVARCHAR\t128\tC\t\n"
        + "线路号\tlineId\tVARCHAR\t6\tM\t\n"
        + "线路名称\tlineName\tVARCHAR\t128\tC\t\n"
        + "出站站点序号\toutStationId\tVARCHAR\t8\tC\t\n"
        + "出站站点名称\toutStationName\tVARCHAR\t128\tC\t\n"
        + "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000 0000不参与优惠 0001联乘优惠\n"
        + "消费类型\ttxnType\tVARCHAR\t2\tC\t00—\t单次消费\n 01—\t复合消费 02—\t系统补扣\n"
        + "优惠前原始票价\torignalTxnAmount\tnumber\t4\tM\t精确到分\n"
        + "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tC\t精确到分";

    data = "用户id\tuserId\tVARCHAR\t32\tM\t\n"
        + "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n"
        + "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n"
        + "推送时间戳\ttimeStamp\tvarchar \t14\tM\t\n"
        + "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n"
        + "行程单号创建时间\torderTime\tVARCHAR\t14\tM\t\n"
        + "终端交易时间\ttidTransTime\tVARCHAR\t14\tM\t\n"
        + "进站时间\tintoTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n"
        + "出站时间\toutTxnDate\tVARCHAR\t14\tC\tYYYYMMDDhhmmss\n"
        + "进站站点序号\tinStationId\tVARCHAR\t8\tC\t\n"
        + "进站站点名称\tinStationName\tVARCHAR\t128\tC\t\n"
        + "线路号\tlineId\tVARCHAR\t6\tM\t\n"
        + "线路名称\tlineName\tVARCHAR\t128\tC\t\n"
        + "出站站点序号\toutStationId\tVARCHAR\t8\tC\t\n"
        + "出站站点名称\toutStationName\tVARCHAR\t128\tC\t\n"
        + "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000 0000不参与优惠 0001联乘优惠\n"
        + "消费类型\ttxnType\tVARCHAR\t2\tC\t00—\t单次消费01—\t复合消费02—\t系统补扣\n"
        + "优惠前原始票价\torignalTxnAmount\tnumber\t4\tM\t精确到分\n"
        + "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tC\t精确到分";

    data = "用户id\tuserId\tVARCHAR\t32\tM\t\n"
        + "第三方渠道用户标识\ttxnUserId\tvarchar \t32\tM\t\n"
        + "关联行程单号\ttravelDataOrderId\tVARCHAR\t32\tM\t扣款关联的行程单号\n"
        + "推送时间戳\ttimeStamp\tvarchar \t14\tM\t\n"
        + "订单状态\torderState\tVARCHAR\t1\tM\t0未扣款1已扣款\n"
        + "优惠类型\tdiscountType\tVARCHAR\t4\tM\t默认为0000 0000不参与优惠0001联乘优惠\n"
        + "当前计算优惠票价\tcurrentDiscountAmount\tnumber\t4\tM\t精确到分";

    data = "乘车码数据\tqrCode\tVARCHAR\t1024\tM\t后台采集的对应乘车码全文";

    data = "应答码\trespCode\tVARCHAR\t2\tM\t见：错误代码说明\n"
        + "应答信息\trespMsg\tVARCHAR\t200\tC\t见：错误代码说明\n";
    data = "交易代码\ttranCode\tCHAR\t5\tM\t02646\n"
        + "请求订单id\treqId\tVARCHAR\t32\tM\t请求方订单号";
    List<String> lines = Arrays.asList(data.split("\n"));

    String classname = "ReqDTO";
    System.out.println(
        "package com.jiuyv.sptcc.b0bgateway.topic.model;\n" +
            "\n" +
            "/**\n" +
            " * @describe\n" +
            " * @auther chen_yang\n" +
            " * @create 2018-04-13-14:36\n" +
            " */\n" +
            "public static class " + classname + "  {\n");

    List<String> tmps = new LinkedList<>();
    List<String> fieldList = Lists.newLinkedList();
    AtomicBoolean isSuccessResp = new AtomicBoolean(false);//当前字段是否respCode=00时候 必填
    lines.forEach(s -> {
      try {
        System.out.println("//" + s);
        //制表符分隔
        String[] fields = s.split("\t");

        boolean specialLine = false;
        if(fields.length == 1) {
          specialLine = true;
          if(fields[0].contains("以下字段应答码是00时返回")) {
            isSuccessResp.set(true);
          }
          return;
        }
        String name = fields[1];
        fieldList.add(name);
        String type = fields[2].equalsIgnoreCase("number") ? "Long" : "String";
        if(fields.length >= 4) {
          if(!isSuccessResp.get()) {
            if("m".equalsIgnoreCase(fields[4])) {//值域 = M,必填字段
              System.out.println(
                  "    @NotEmpty(message = \"" + fields[0] + "不得为空\")");
            }
          }
          System.out.println(
              "@Size(max = " + fields[3] + ", message = \"" + fields[0] + "最大长度为" + fields[3]
                  + "\")");
        }
        String tm = "private " + type + " " + name + ";\n";
        tmps.add(tm);
        System.out.println(tm);
      } catch (Exception e) {
        System.out.println("错误行" + s);
        e.printStackTrace();
        throw e;
      }
    });

    System.out.println("    private " + classname + "() { }");
    System.out.println("    private " + classname + "(Builder builder) {");
    fieldList.forEach(s1 -> System.out.println("this." + s1 + " = " + s1 + ";"));
    System.out.println(" }");

    System.out.println("static class Builder{");
    tmps.forEach(s -> System.out.println(s));
    System.out.println("}");
    System.out.println("\n}");

  }
}
