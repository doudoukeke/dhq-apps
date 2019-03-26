package com.xnt.dhq.service;

import com.xnt.dhq.model.DeviceTypeParam;
import com.xnt.dhq.model.DhqDeviceType;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface DeviceTypeService {
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(DeviceTypeParam deviceParam);

    int delete(int id);

    int deleteBrand(List<Integer> ids);

    List<DhqDeviceType> getList(String keywords);


    DhqDeviceType getById(Long id);

    List<DhqDeviceType> listAllDeviceType();

    int updateDeviceType(int id, DeviceTypeParam deviceParam);

    List<DhqDeviceType> listDeviceType(int id,String keyword1 ,String keyword2,String keyword3,int pageNum, int pageSize);
   // List<DhqDeviceType> listDeviceType(,int pageNum, int pageSize);


}
