package com.xnt.dhq.service.impl;

import com.xnt.dhq.dao.DeviceDao;
import com.xnt.dhq.mapper.DeviceMapper;
import com.xnt.dhq.model.Device;
import com.xnt.dhq.model.DeviceQueryParam;
import com.xnt.dhq.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qingliu on 2019-03-20.
 *
 */

@Service
public class DeviceServiceImpl implements DeviceService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeviceServiceImpl.class);

    @Autowired
    private DeviceMapper deviceMapper;

    @Autowired
    private DeviceDao deviceDao;

    /*@Override
    public int create(DeviceParam deviceParam) {
        Device device = deviceParam;
        if(deviceMapper.insert(device) > 0){
            return 1;
        }
        return 0;
    }
*/
    @Override
    public List<Device> getList(String keywords) {

        return null;
    }

    @Override
    public Device getById(Long id) {
        Device device = deviceMapper.selectById(id);
        if (device != null){
            return device;
        }
        return null;
    }

    @Override
    public List<DeviceQueryParam> selectDevice() {
        return deviceDao.selectDevice();
    }


}
