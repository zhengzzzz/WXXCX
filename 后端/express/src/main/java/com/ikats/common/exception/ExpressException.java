package com.ikats.common.exception;

/**
 * 消息异常定义
 * @author shnejian26@hotmail.com
 * @date 2018/10/16 18:13
 */

public class ExpressException extends IkatsException {


    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 8970523354415436014L;

    private ExpressException(String EXPRESS) {
        super(EXPRESS);
    }
    public ExpressException(ErrorBaseEnum err) {
        super(err.getDescription(),err.getValue());
    }

    public static enum ErrorBaseEnum {
        ERR_EXCEPTION(EXPRESS, "未知异常错误"),

        ERR_BASE_FAIL(EXPRESS+1, "操作失败"),
        ERR_BASE_FAIL_INSERT(EXPRESS+2, "消息保存失败"),
        ERR_BASE_FAIL_DELETE(EXPRESS+3, "删除失败"),
        ERR_BASE_FAIL_UPDATE(EXPRESS+4, "更新失败"),
        ERR_BASE_FAIL_SELECT(EXPRESS+5, "查询失败"),
        ERR_BASE_FAIL_LOGIN(EXPRESS+8, "登陆失败"),
        ERR_BASE_FAIL_SHORTLINKS(EXPRESS+6, "短连接未配置"),
        ERR_BASE_FAIL_IDSN_TYPE_ISNULL(EXPRESS+7, "获取idSn时type值不正确"),
        ERR_BASE_FAIL_SENDMESSAGE(EXPRESS+8, "发送消息失败"),

        ERR_COMMON_ISNULL_CLIENT_CODE(EXPRESS+101,"客户编码字段不能为空"),
        ERR_COMMON_ISNULL_CLIENT_NAME(EXPRESS+102,"客户名称字段不能为空"),
        ERR_COMMON_ISNULL_CLIENT_NAME_EN(EXPRESS+103,"客户英文名字段不能为空"),
        ERR_COMMON_ISNULL_CLIENT_TYPE(EXPRESS+104,"客户类型字段不能为空"),
        ERR_COMMON_REPEAT_CLIENT_CODE(EXPRESS+105,"客户编码重复"),
        ERR_COMMON_TOOLONG_CLIENT_CODE(EXPRESS+106,"客户编码不能超过6字符"),

        ERR_COMMON_ISNULL_COMPANY_CODE(EXPRESS+301,"快递编码字段不能为空"),
        ERR_COMMON_ISNULL_COMPANY_NAME(EXPRESS+302,"快递名称字段不能为空"),
        ERR_COMMON_ISNULL_CLIENT_EXPRESS_CODE(EXPRESS+303,"客户快递编码不能为空"),
        ERR_COMMON_ISNULL_BUSINESS_TYPE(EXPRESS+304,"业务编码字段不能为空"),
        ERR_COMMON_ISNULL_BILL_TEMPLATE_NAME(EXPRESS+305,"快递模板字段不能为空"),
        ERR_COMMON_ISNULL_RETRIEVE_METHOD(EXPRESS+306,"获取方式字段不能为空"),
        ERR_COMMON_REPEAT_COMPANY_CODE(EXPRESS+307,"快递编码字段重复"),
        ERR_COMMON_FAIL_COMPANY_CODE(EXPRESS+308,"存在快递配置不能删除"),
        ERR_COMMON_ISNULL_USER_ID(EXPRESS+309,"登录名字段不能为空"),
        ERR_COMMON_ISNULL_USER_NAME(EXPRESS+310,"用户名称段不能为空"),
        ERR_COMMON_ISNULL_PASS_WORD(EXPRESS+311,"密码字段不能为空"),
        ERR_COMMON_ISNULL_USER_TYPE(EXPRESS+312,"用户类型字段不能为空"),
        ERR_COMMON_ISNULL_USER(EXPRESS+313,"用户不存在"),
        ERR_COMMON_ERROR_PASS_WORD(EXPRESS+315,"密码错误"),
        ERR_MDM_USER_WRONG_PASS(EXPRESS+316,"用户名或密码错误"),
        ERR_COMMON_ERROR_CLEAR_PORT_CODE(EXPRESS+316,"清关口岸编码字段不能为空"),
        ERR_COMMON_ERROR_CLEAR_PORT_NAME(EXPRESS+316,"清关口岸名称字段不能为空"),
        ERR_COMMON_ERROR_CUSTMESSAGE_CODE(EXPRESS+317,"口岸海关编码字段不能为空"),
        ERR_COMMON_ERROR_CLEAR_TYPE(EXPRESS+318,"口岸类型字段不能为空"),
        ERR_COMMON_ERROR_SYSTEM_TYPE(EXPRESS+319,"系统类型字段不能为空"),
        ERR_COMMON_REPEAT_CLEAR_PORT_CODE(EXPRESS+320,"清关口岸编码字段重复"),


        ERR_BASE_ISNULL_ID(EXPRESS+101, "ID不能为空"),
        ERR_BASE_ISNULL_CREATEBY(EXPRESS+115, "创建者不能为空"),
        ERR_BASE_ISNULL_UPDATEBY(EXPRESS+116, "修改者不能为空"),
        ERR_BASE_ISNULL_KEYWORD(EXPRESS+117,"关键字不能为空"),
        ERR_BASE_WAREHOUSE_CODE(EXPRESS+200, "仓库编码不能为空"),
        ERR_BASE_WAREHOUSE_NAME(EXPRESS+201, "仓库名称不能为空"),
        ERR_BASE_WAREHOUSE_TYPE(EXPRESS+202, "仓库类型不能为空"),
        ERR_BASE_WAREHOUSE_FOUNDER(EXPRESS+203, "创建人不能为空"),
        ERR_BASE_WAREHOUSE_CREATETIME(EXPRESS+204, "创建时间不能为空"),
        ERR_BASE_WAREHOUSE_MODIFY(EXPRESS+205, "修改人不能为空"),
        ERR_BASE_WAREHOUSE_MODIFY_TIME(EXPRESS+206, "修改人时间不能为空");

        private String value;
        private String description;

        private ErrorBaseEnum(String value, String description) {
            this.value = value;
            this.description = description;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
    }


}