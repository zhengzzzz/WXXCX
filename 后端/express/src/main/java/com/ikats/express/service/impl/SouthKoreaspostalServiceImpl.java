package com.ikats.express.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.ikats.common.exception.IkatsException;
import com.ikats.common.exception.InvokerResult;
import com.ikats.common.util.JsonUtils;
import com.ikats.express.service.SouthKoreaspostalService;
import netscape.javascript.JSUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Author     ：ZZ
 * Created by Lucifer on 2019/3/5 15:34
 * @ Description：
 */
@Service
public class SouthKoreaspostalServiceImpl implements SouthKoreaspostalService {


    @Override
    public InvokerResult SouthKoreaspostalcreate(JSONObject object) throws IkatsException {







        Map map = new HashMap();
        List orders = new ArrayList();

        //订单推送事件代码:
        //新增订单 Add
        //修改订单 Update
        //删除订单 Delete
        map.put("action_code", "AddTest");
        //接口调用身份主体id
        map.put("send_id", "test");
        //接口调用身份密钥
        map.put("secret", "testsecret");
        //关联订单信息
        map.put("orders", orders);

        Map m1 = new HashMap();
        orders.add(m1);

        //订单原始下单时间
        m1.put("order_time", "order_time");
        //订单编号
        m1.put("order_no", "order_no");
        //支付方式目前仅支持发wxpay
        m1.put("pay_way", "wxpay");
        //付款金额
        m1.put("goods_fee", "goods_fee");

        //currency 货款金额币制代码, 默认人民币 142 非必填
        m1.put("currency", "currency");

        //运杂费,默认填“0
        m1.put("shipping_fee", "0");

        //tax_fee按照货款金额计算的税款，默认填“0
        m1.put("tax_fee", "0");

        //抵付金额,优惠减免金额，默认填“0”
        m1.put("other_pay_fee", "other_pay_fee");


        //other_fee_notes 抵付情况说明。如果填写抵付金额非0时，该项必填
        m1.put("other_fee_notes", "other_fee_notes");

        //consignee_name 收货人名称信息，同运单
        m1.put("consignee_name", "consignee_name");

        //收货人地址信息，同运单
        m1.put("consignee_address", "consignee_address");

        //收货人电话信息，同运单
        m1.put("consignee_tel", "consignee_tel");

        //consignee_province 收货人所在省
        m1.put("consignee_province", "consignee_province");

        //consignee_city 收货人所在市
        m1.put("consignee_city", "consignee_city");

        //consignee_district 收货人所在区
        m1.put("consignee_district", "consignee_district");

        //consignee_country_code 收货人所在国家代码, 默认142中国
        m1.put("consignee_country_code", "consignee_country_code");

        //order_person_id  订购人在交易平台唯一注册号(账号)，一个电商平台注册号对应一个身份证,
        m1.put("order_person_id", "order_person_id");

        //order_person_name 订单订购人, 海关监管的对象，需要对个人消费额度和实名认证进行管控, 必须与order_person_card_no证件信息对应
        m1.put("order_person_name", "order_person_name");

        //购买者证件号码类型。1:身份证、2:护照、4:其他order_person_card_type
        m1.put("order_person_card_type", "order_person_card_type");

        //订单订购人,海关监管的对象证件号(对应order_person_card_type所选类型)
        m1.put("order_person_card_no", "order_person_card_no");

        //购买者联系电话号码。 必须是订购人证件所属。
        m1.put("order_person_tel", "order_person_tel");

        //insure_fee订单保价费--用于申报运单, 默认填0
        m1.put("insure_fee", "0");

        //Note备注
        m1.put("Note", "备注");

        //payment 订单关联支付单信息Array()
        HashMap payment = new HashMap();
        m1.put("payment", payment);


        List goods = new ArrayList();
        Map m2 = new HashMap();
        //订单关联商品信息
        m1.put("goods", goods);
        goods.add(m2);
        //商品唯一货号
        m2.put("sku", "sku");
        //商品名
        m2.put("goods_name", "goods_name");

        //attr_name varchar(30)	商品规格名
        m2.put("attr_name", "attr_name");

        // goods_price decimal(19,5)	商品价格
        m2.put("goods_price", "goods_price");


        //支付交易编码，同一支付企业支付交易号不可重复报送
        payment.put("pay_no", "pay_no");

        //支付金额
        payment.put("pay_amount", "pay_amount");

        //付款时间
        payment.put("pay_time", "pay_time");

        //支付人姓名
        payment.put("payer_name", "payer_name");

        //支付人证件类型  1：身份证2护照 4其他
        payment.put("payer_document_type", "payer_document_type");

        //支付人证件号码
        payment.put("payer_document_number", "payer_document_number");

        //支付人手机号
        payment.put("payer_phone_number", "payer_phone_number");


        return null;
    }


    public static void main(String[] args) {

        Map map = new HashMap();
        List orders = new ArrayList();


        //订单推送事件代码:
        //新增订单 Add
        //修改订单 Update
        //删除订单 Delete
        map.put("action_code", "AddTest");
        //接口调用身份主体id
        map.put("send_id", "test");
        //接口调用身份密钥
        map.put("secret", "testsecret");
        //关联订单信息
        map.put("orders", orders);

        Map m1 = new HashMap();
        orders.add(m1);

        //订单原始下单时间
        m1.put("order_time", "order_time");
        //订单编号
        m1.put("order_no", "order_no");
        //支付方式目前仅支持发wxpay
        m1.put("pay_way", "wxpay");
        //付款金额
        m1.put("goods_fee", "goods_fee");

        //currency 货款金额币制代码, 默认人民币 142 非必填
        m1.put("currency", "currency");

        //运杂费,默认填“0
        m1.put("shipping_fee", "0");

        //tax_fee按照货款金额计算的税款，默认填“0
        m1.put("tax_fee", "0");

        //抵付金额,优惠减免金额，默认填“0”
        m1.put("other_pay_fee", "other_pay_fee");


        //other_fee_notes 抵付情况说明。如果填写抵付金额非0时，该项必填
        m1.put("other_fee_notes", "other_fee_notes");

        //consignee_name 收货人名称信息，同运单
        m1.put("consignee_name", "consignee_name");

        //收货人地址信息，同运单
        m1.put("consignee_address", "consignee_address");

        //收货人电话信息，同运单
        m1.put("consignee_tel", "consignee_tel");

        //consignee_province 收货人所在省
        m1.put("consignee_province", "consignee_province");

        //consignee_city 收货人所在市
        m1.put("consignee_city", "consignee_city");

        //consignee_district 收货人所在区
        m1.put("consignee_district", "consignee_district");

        //consignee_country_code 收货人所在国家代码, 默认142中国
        m1.put("consignee_country_code", "consignee_country_code");

        //order_person_id  订购人在交易平台唯一注册号(账号)，一个电商平台注册号对应一个身份证,
        m1.put("order_person_id", "order_person_id");

        //order_person_name 订单订购人, 海关监管的对象，需要对个人消费额度和实名认证进行管控, 必须与order_person_card_no证件信息对应
        m1.put("order_person_name", "order_person_name");

        //购买者证件号码类型。1:身份证、2:护照、4:其他order_person_card_type
        m1.put("order_person_card_type", "order_person_card_type");

        //订单订购人,海关监管的对象证件号(对应order_person_card_type所选类型)
        m1.put("order_person_card_no", "order_person_card_no");

        //购买者联系电话号码。 必须是订购人证件所属。
        m1.put("order_person_tel", "order_person_tel");

        // insure_fee订单保价费--用于申报运单, 默认填0
        m1.put("insure_fee", "0");

        //Note备注
        m1.put("Note", "备注");

        //payment 订单关联支付单信息Array()
        HashMap payment = new HashMap();
        m1.put("payment", payment);


        List goods = new ArrayList();
        Map m2 = new HashMap();
        //订单关联商品信息
        m1.put("goods", goods);
        goods.add(m2);
        //商品唯一货号
        m2.put("sku", "sku");
        //商品名
        m2.put("goods_name", "goods_name");

        //attr_name varchar(30)	商品规格名
        m2.put("attr_name", "attr_name");

        // goods_price decimal(19,5)	商品价格
        m2.put("goods_price", "goods_price");


        //支付交易编码，同一支付企业支付交易号不可重复报送
        payment.put("pay_no", "pay_no");

        //支付金额
        payment.put("pay_amount", "pay_amount");

        //付款时间
        payment.put("pay_time", "pay_time");

        //支付人姓名
        payment.put("payer_name", "payer_name");

        //支付人证件类型  1：身份证2护照 4其他
        payment.put("payer_document_type", "payer_document_type");

        //支付人证件号码
        payment.put("payer_document_number", "payer_document_number");

        //支付人手机号
        payment.put("payer_phone_number", "payer_phone_number");

        System.out.println(JsonUtils.objectToJson(map));

    }
}
