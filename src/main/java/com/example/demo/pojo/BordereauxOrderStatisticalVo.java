package com.example.demo.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import lombok.Data;

@Data
public class BordereauxOrderStatisticalVo {
    @ExcelIgnore
    private String vcCustomerId;
    @Excel(name = "客户名称",height = 11, width = 15)
    private String vcName;
    @Excel(name = "客户手机号",height = 11, width = 15)
    private String vcPphone;
    @Excel(name = "客户电话",height = 11, width = 15)
    private String vcTel;
    @Excel(name = "业务员",height = 11, width = 15)
    private String vcSalesman;
    @Excel(name = "是否未提交",replace = {"是_0", "否_1","否_2","否_3","否_4","否_5"}, height = 11, width = 15)
    private Integer orderStatus;
    /**
     * @Description: 客户订单统计
     */
    @Excel(name = "客户订单总计",height = 11, width = 15)
    private Integer orderTotal;

    /**
     * @Description: 客户订单金额统计
     */
    @Excel(name = "客户订单总金额",height = 11, width = 15)
    private Double orderMoneyTotal;


}
