package com.example.demo.controller;

import com.example.demo.pojo.BordereauxOrderStatisticalVo;
import com.example.demo.util.EasyPoiUtil;
import com.oracle.webservices.internal.api.message.ContentType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/a")
public class BordereauxOrderController {

    @RequestMapping("/e")
    public void exportExcel(@RequestParam Map<String,Object> map, HttpServletResponse response){

        ArrayList<BordereauxOrderStatisticalVo> list = new ArrayList<>();
        BordereauxOrderStatisticalVo vo = new BordereauxOrderStatisticalVo();
        vo.setOrderMoneyTotal(1.2);
        vo.setOrderStatus(2);
        vo.setOrderTotal(1);
        vo.setVcCustomerId("哈哈");
        vo.setVcName("张三");
        vo.setVcPphone("17356531544");
        vo.setVcSalesman("它");
        vo.setVcTel("果然");
        list.add(vo);
        //设置表名，引脚名，文件格式，及写入list数据到excel中
        EasyPoiUtil.exportExcel(list,"客户订单统计表","客户订单统计", BordereauxOrderStatisticalVo.class,"客户订单统计表.xls",response);

    }

    @RequestMapping("/b")
    public void test() {
      List<BordereauxOrderStatisticalVo> list =  EasyPoiUtil.importExcel("C:/Users/Sun.tianliang/Desktop/客户订单统计表 (3)",
                1,1,BordereauxOrderStatisticalVo.class);

        System.out.println(list);
    }


    @RequestMapping("/c")
    public void test1() {
        MultipartFile file = (MultipartFile) new File("C:\\Users\\Sun.tianliang\\Desktop\\客户订单统计表");

        List<BordereauxOrderStatisticalVo> list =  EasyPoiUtil.importExcel(file,
                1,1,BordereauxOrderStatisticalVo.class);

        System.out.println(list);
    }



}
