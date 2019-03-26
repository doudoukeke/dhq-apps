package com.xnt.dhq.service;

import com.xnt.dhq.model.Device;
import com.xnt.dhq.model.DeviceQueryParam;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by qingliu on 2019-03-19.
 * @apiNote this is the device manage service
 */

public interface DeviceService {

    /*插入设备*/
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    //int create(DeviceQueryParam deviceParam);

    List<Device> getList(String keywords);

    Device getById(Long id);

    List<DeviceQueryParam> selectDevice();


}
