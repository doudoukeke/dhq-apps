package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.model.DeviceTypeParam;
import com.xnt.dhq.service.DeviceTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "DeviceTypeController", description = "设备类型管理")
@Controller
@RequestMapping("/deviceType")
public class DeviceTypeController {
    @Autowired
    private DeviceTypeService deviceTypeService;

    @ApiOperation("添加设备类型")
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody DeviceTypeParam deviceTypeParam, BindingResult bindingResult) {
        System.out.println(deviceTypeParam);
        int number = deviceTypeService.create(deviceTypeParam);
        if (number > 0) {
            return new CommonResult().success(number);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "删除设备类型")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("id") int id) {
        int count = deviceTypeService.delete(id);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "获取全部设备类型列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Object getList() {
        return new CommonResult().success(deviceTypeService.listAllDeviceType());
    }

    @ApiOperation(value = "更新设备类型")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") int id,
                         @Validated @RequestBody DeviceTypeParam deviceTypeParam,
                         BindingResult result) {
        CommonResult commonResult;
        int count = deviceTypeService.updateDeviceType(id, deviceTypeParam);
        if (count == 1) {
            commonResult = new CommonResult().success(count);
        } else {
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

    @ApiOperation(value = "按类型分页获取设备类型列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object getList(int id,String keyword1,String keyword2,String keyword3,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return new CommonResult().pageSuccess(deviceTypeService.listDeviceType(id,keyword1,keyword2,keyword3,pageNum,pageSize));
    }

    @ApiOperation(value = "批量删除设备类型")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam("ids") List<Integer> ids) {
        int count = deviceTypeService.deleteBrand(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

}
