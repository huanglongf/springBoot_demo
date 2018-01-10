package com.sasha.contrller;

import com.sasha.pojo.BaseDict;
import com.sasha.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andy on 2018/1/10.
 */

/**
 * 數據的数据的转换的格式：
 * （1）json中不区分整数、小数等类型，而统一使用Number来存储数字。

 （2）Array表示数组，以中括号"[]"括起来，元素之间以逗号分隔，元素可以为任意类型。

 （3）Object表示对象，类似于C语言中的结构体，以花括号"{}"括起来，其元素要求为键值对，key必须为String类型的，
 而value则可为任意类型。key和value之间以":"表示映射关系，元素之间也是以逗号分隔。
 *
 * {
 "code": "200",
 "list": [{
 "dictId": "1",
 "dictTypeCode": "001",
 "dictTypeName": "客户行业",
 "dictItemName": "教育培训",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "10",
 "dictTypeCode": "003",
 "dictTypeName": "公司性质",
 "dictItemName": "民企",
 "dictItemCode": null,
 "dictSort": 3,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "12",
 "dictTypeCode": "004",
 "dictTypeName": "年营业额",
 "dictItemName": "1-10万",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "13",
 "dictTypeCode": "004",
 "dictTypeName": "年营业额",
 "dictItemName": "10-20万",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "14",
 "dictTypeCode": "004",
 "dictTypeName": "年营业额",
 "dictItemName": "20-50万",
 "dictItemCode": null,
 "dictSort": 3,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "15",
 "dictTypeCode": "004",
 "dictTypeName": "年营业额",
 "dictItemName": "50-100万",
 "dictItemCode": null,
 "dictSort": 4,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "16",
 "dictTypeCode": "004",
 "dictTypeName": "年营业额",
 "dictItemName": "100-500万",
 "dictItemCode": null,
 "dictSort": 5,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "17",
 "dictTypeCode": "004",
 "dictTypeName": "年营业额",
 "dictItemName": "500-1000万",
 "dictItemCode": null,
 "dictSort": 6,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "18",
 "dictTypeCode": "005",
 "dictTypeName": "客户状态",
 "dictItemName": "基础客户",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "19",
 "dictTypeCode": "005",
 "dictTypeName": "客户状态",
 "dictItemName": "潜在客户",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "2",
 "dictTypeCode": "001",
 "dictTypeName": "客户行业",
 "dictItemName": "电子商务",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "20",
 "dictTypeCode": "005",
 "dictTypeName": "客户状态",
 "dictItemName": "成功客户",
 "dictItemCode": null,
 "dictSort": 3,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "21",
 "dictTypeCode": "005",
 "dictTypeName": "客户状态",
 "dictItemName": "无效客户",
 "dictItemCode": null,
 "dictSort": 4,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "22",
 "dictTypeCode": "006",
 "dictTypeName": "客户级别",
 "dictItemName": "普通客户",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "23",
 "dictTypeCode": "006",
 "dictTypeName": "客户级别",
 "dictItemName": "VIP客户",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "24",
 "dictTypeCode": "007",
 "dictTypeName": "商机状态",
 "dictItemName": "意向客户",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "25",
 "dictTypeCode": "007",
 "dictTypeName": "商机状态",
 "dictItemName": "初步沟通",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "26",
 "dictTypeCode": "007",
 "dictTypeName": "商机状态",
 "dictItemName": "深度沟通",
 "dictItemCode": null,
 "dictSort": 3,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "27",
 "dictTypeCode": "007",
 "dictTypeName": "商机状态",
 "dictItemName": "签订合同",
 "dictItemCode": null,
 "dictSort": 4,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "3",
 "dictTypeCode": "001",
 "dictTypeName": "客户行业",
 "dictItemName": "对外贸易",
 "dictItemCode": null,
 "dictSort": 3,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "30",
 "dictTypeCode": "008",
 "dictTypeName": "商机类型",
 "dictItemName": "新业务",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "31",
 "dictTypeCode": "008",
 "dictTypeName": "商机类型",
 "dictItemName": "现有业务",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "32",
 "dictTypeCode": "009",
 "dictTypeName": "商机来源",
 "dictItemName": "电话营销",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "33",
 "dictTypeCode": "009",
 "dictTypeName": "商机来源",
 "dictItemName": "网络营销",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "34",
 "dictTypeCode": "009",
 "dictTypeName": "商机来源",
 "dictItemName": "推广活动",
 "dictItemCode": null,
 "dictSort": 3,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "4",
 "dictTypeCode": "001",
 "dictTypeName": "客户行业",
 "dictItemName": "酒店旅游",
 "dictItemCode": null,
 "dictSort": 4,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "5",
 "dictTypeCode": "001",
 "dictTypeName": "客户行业",
 "dictItemName": "房地产",
 "dictItemCode": null,
 "dictSort": 5,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "6",
 "dictTypeCode": "002",
 "dictTypeName": "客户信息来源",
 "dictItemName": "电话营销",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "7",
 "dictTypeCode": "002",
 "dictTypeName": "客户信息来源",
 "dictItemName": "网络营销",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "8",
 "dictTypeCode": "003",
 "dictTypeName": "公司性质",
 "dictItemName": "合资",
 "dictItemCode": null,
 "dictSort": 1,
 "dictEnable": "1",
 "dictMemo": null
 }, {
 "dictId": "9",
 "dictTypeCode": "003",
 "dictTypeName": "公司性质",
 "dictItemName": "国企",
 "dictItemCode": null,
 "dictSort": 2,
 "dictEnable": "1",
 "dictMemo": null
 }]
 }
 */
@RestController
public class JsonController {

    @Autowired
    private BaseDictService baseDictService;

    @RequestMapping("/json")
    public Map returnJosn(){
        HashMap<String, Object> map = new HashMap<>();
        List<BaseDict> list = baseDictService.findAll();
        map.put("code","200");
        map.put("list",list);
        return map;
    }
}
