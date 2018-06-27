# aliyun-express-tracking
阿里云物流查询服务

## 技术

+ okhttp：发送请求
+ fastjson：解析响应数据

## 服务申请

1. 购买服务

   在[云市场](https://market.aliyun.com/products/56928004/cmapi014394.html?spm=5176.2020520132.101.6.jFHWw1)购买快递查询服务，在[控制台](https://market.console.aliyun.com/?spm=5176.2020520001.aliyun_sidebar.42.69864bd3VlO25K#/?_k=pygmxa)的`云市场`中即可查询到自己的`AppCode`、`AppSecret`、`AppKey`

2. 服务调试

   在[调试工具](https://apigateway.console.aliyun.com/inner/?spm=5176.730006-56956004-56928004-cmapi014394/B.content.8.MVdrQf#/cn-qingdao/apps/testApi/d8cb458ccaae43569c07cee7ffc8631f/2b926f27cfbc4fe39fc2a129dc810f4d/RELEASE/24943874/CloudMarket)中使用`测试数据`先进行调试

## 测试数据

+ 顺丰

  快递单号：821148818417 

+ EMS

  快递单号：1116076709214 

+ 德邦

  快递单号：7042503016 

## 常见快递公司编码

| 公司名称      | 公司公司编码   |
| ------------- | -------------- |
| 邮政包裹/平邮 | youzhengguonei |
| 国际包裹      | youzhengguoji  |
| EMS           | ems            |
| EMS-国际件    | emsguoji       |
| EMS-国际件    | emsinten       |
| 北京EMS       | bjemstckj      |
| 顺丰          | shunfeng       |
| 申通          | shentong       |
| 圆通          | yuantong       |
| 中通          | zhongtong      |
| 汇通          | huitongkuaidi  |
| 韵达          | yunda          |
| 宅急送        | zhaijisong     |
| 天天          | tiantian       |
| 德邦          | debangwuliu    |
| 国通          | guotongkuaidi  |
| 增益          | zengyisudi     |
| 速尔          | suer           |
| 中铁物流      | ztky           |
| 中铁快运      | zhongtiewuliu  |
| 能达          | ganzhongnengda |
| 优速          | youshuwuliu    |
| 全峰          | quanfengkuaidi |
| 京东          | jd             |

==注：更多快递公司编码，请联系技术支持索取==

## 接口说明

+ 接口地址

  `http://express.woyueche.com/query.action`

  或

  `http://kuaidi.market.alicloudapi.com/query.action`

+ 请求方式

  POST

+ 请求参数（Query）

  无

+ 请求参数（Headers）

  |      Key      |                   Value                    |                         Example                          |
  | :-----------: | :----------------------------------------: | :------------------------------------------------------: |
  | Authorization | `APPCODE[半角空格]购买服务后获取的AppCpde` | `Authorization:APPCODE ba8d66a2d133448a9bfd1b67c6fb7c03` |

+ 请求参数（Body）

  |    Key     |    Value     |   Example    |
  | :--------: | :----------: | :----------: |
  |  express   | 快递公司编码 |   shunfeng   |
  | trackingNo |   快递单号   | 821148818417 |

+ 返回数据

  + 格式

    JSON

  + 例

    ```
    Request：
    Url: http://kuaidi.market.alicloudapi.com/query.action
    Header: {"Host":"kuaidi.market.alicloudapi.com","X-Ca-Timestamp":"1530068831250","gateway_channel":"http","X-Ca-Request-Mode":"debug","X-Ca-Key":"24943874","X-Ca-Stage":"RELEASE","Content-Type":"application/x-www-form-urlencoded; charset=utf-8","Authorization":"APPCODE ba8d66a2d133448a9bfd1b67c6fb7c03"}
    Body: {"express":"shunfeng","trackingNo":"821148818417"}
    
    Response：
    200
    Date: Wed, 27 Jun 2018 03:07:11 GMT
    Content-Type: application/json; charset=UTF-8
    Transfer-Encoding: chunked
    Connection: keep-alive
    Vary: Accept-Encoding
    Access-Control-Allow-Origin: *
    Access-Control-Allow-Methods: GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH
    Access-Control-Allow-Headers: X-Requested-With,X-Sequence,X-Ca-Key,X-Ca-Secret,X-Ca-Version,X-Ca-Timestamp,X-Ca-Nonce,X-Ca-API-Key,X-Ca-Stage,X-Ca-Client-DeviceId,X-Ca-Client-AppId,X-Ca-Signature,X-Ca-Signature-Headers,X-Ca-Signature-Method,X-Forwarded-For,X-Ca-Date,X-Ca-Request-Mode,Authorization,Content-Type,Accept,Accept-Ranges,Cache-Control,Range,Content-MD5
    Access-Control-Max-Age: 172800
    X-Ca-Request-Id: 5FB474D9-B905-4F72-975D-598D5234992E
    Content-Disposition: inline
    Latency: 122
    
    {"data":[{"state":"[杭州市]已签收,感谢使用顺丰,期待再次为您服务","time":"2018-06-22 11:21:00"},{"state":"[杭州市]快件到达 【杭州江干钱江三苑营业部】","time":"2018-06-22 08:47:00"},{"state":"[杭州市]快件交给周又兵，正在派送途中（联系电话：13567144269）","time":"2018-06-22 08:47:00"},{"state":"[杭州市]快件已发车","time":"2018-06-22 05:55:00"},{"state":"[杭州市]快件在【杭州总集散中心】已装车,准备发往 【杭州江干钱江三苑营业部】","time":"2018-06-22 05:31:00"},{"state":"[杭州市]快件到达 【杭州总集散中心】","time":"2018-06-22 02:32:00"},{"state":"[北京市]快件在【北京首都机场集散中心2】已装车,准备发往 【杭州总集散中心】","time":"2018-06-21 14:45:00"},{"state":"[北京市]快件到达 【北京首都机场集散中心2】","time":"2018-06-21 13:59:00"},{"state":"[北京市]快件已发车","time":"2018-06-21 12:24:00"},{"state":"[北京市]快件在【北京五道口营业点】已装车,准备发往 【北京首都机场集散中心2】","time":"2018-06-21 12:20:00"},{"state":"[北京市]顺丰速运 已收取快件","time":"2018-06-21 11:21:00"},{"state":"[北京市]顺丰速运 已收取快件","time":"2018-06-21 10:36:00"}],"result":true,"code":0,"state":"3","express":"shunfeng","trackingNo":"821148818417"}
    ```

    