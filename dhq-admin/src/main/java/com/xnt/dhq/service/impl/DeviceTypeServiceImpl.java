package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.mapper.DhqDeviceTypeMapper;
import com.xnt.dhq.model.DeviceTypeParam;
import com.xnt.dhq.model.DhqDeviceType;
import com.xnt.dhq.model.DhqDeviceTypeExample;
import com.xnt.dhq.service.DeviceTypeService;
import org.apache.ibatis.jdbc.Null;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeviceTypeServiceImpl.class);

    @Autowired
    private DhqDeviceTypeMapper deviceTypeMapper;
    @Override
    public int create(DeviceTypeParam deviceTypeParam) {
        DhqDeviceType dhqDeviceType = deviceTypeParam;
       // System.out.println(dhqDeviceType);
        if(deviceTypeMapper.insert(dhqDeviceType) > 0){
            return 1;
        }
        return 0;
    }

    @Override
    public int delete(int id) {

        return deviceTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteBrand(List<Integer> ids) {
        DhqDeviceTypeExample dhqDeviceTypeExample = new DhqDeviceTypeExample();
        dhqDeviceTypeExample.createCriteria().andIdIn(ids);
        return deviceTypeMapper.deleteByExample(dhqDeviceTypeExample);
    }

    @Override
    public List<DhqDeviceType> getList(String keywords) {
        return null;
    }

    @Override
    public DhqDeviceType getById(Long id) {
        return null;
    }

    @Override
    public List<DhqDeviceType> listAllDeviceType() {
        return deviceTypeMapper.selectByExample(new DhqDeviceTypeExample());
    }

    @Override
    public int updateDeviceType (int id, DeviceTypeParam deviceTypeParam) {
        DhqDeviceType dhqDeviceType = new DhqDeviceType();
        BeanUtils.copyProperties(deviceTypeParam, dhqDeviceType);
        dhqDeviceType.setId(id);
        //System.out.println(deviceTypeParam);
        //若添加了设备，则修改设备类别时也要修改它的设备
        //DhqDeviceType dhqDeviceType = deviceTypeParam;
        //System.out.println(dhqDeviceType);
        //System.out.println("dhqDeviceType");
        return deviceTypeMapper.updateByPrimaryKeySelective(dhqDeviceType);
    }

    @Override
    public List<DhqDeviceType> listDeviceType(int id,String keyword1,String keyword2,String keyword3,int pageNum, int pageSize) {
         PageHelper.startPage(pageNum, pageSize);
         DhqDeviceTypeExample dhqDeviceTypeExample = new DhqDeviceTypeExample();
         dhqDeviceTypeExample.setOrderByClause("id desc");
         DhqDeviceTypeExample.Criteria criteria = dhqDeviceTypeExample.createCriteria();
        if (!StringUtils.isEmpty(keyword1)) {
            criteria.andFirstCategoryLike("%" + keyword1 + "%");
        }
        if (!StringUtils.isEmpty(keyword2)) {
            criteria.andSecondCategoryLike("%" + keyword2 + "%");
        }
        if(!StringUtils.isEmpty(keyword3)) {
            criteria.andThirdCategoryLike("%" + keyword3 + "%");
        }

        if ((Integer)id!= null) {
            criteria.andIdEqualTo(id);
        }
        //DhqDeviceTypeExample.Criteria criteria = dhqDeviceTypeExample.createCriteria();
         return deviceTypeMapper.selectByExample(dhqDeviceTypeExample);
    }





}
