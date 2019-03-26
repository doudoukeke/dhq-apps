package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.model.Device;
import com.xnt.dhq.model.DeviceQueryParam;
import com.xnt.dhq.service.DeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by qingliu on 2019-03-19.
 * @apiNote  the is the api of device manage,include the
 * add/delete/find/edit operation.
 */

@Api(tags = "DeviceController", description = "设备管理")
@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    /*@ApiOperation("添加设备")
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody DeviceQueryParam deviceParam, BindingResult bindingResult){
        int number = deviceService.create(deviceParam);
        if (number > 0){
            return new CommonResult().success(number);
        }else{
            return new CommonResult().failed();
        }
    }
*/
    @ApiOperation("获取设备")
    @RequestMapping(path = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Object get(Long id){
        Device result = deviceService.getById(id);
        return result != null? result:null;
    }


    @ApiOperation("获取所有设备")
    @RequestMapping(path = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public Object getAll(){
        List<DeviceQueryParam> deviceQueryParamList=deviceService.selectDevice();
        return deviceQueryParamList;
    }


}
