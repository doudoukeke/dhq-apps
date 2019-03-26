package com.xnt.dhq.dao;

import com.xnt.dhq.model.DeviceQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by afu on 2019-03-19.
 */

public interface DeviceDao {
    List<DeviceQueryParam> selectDevice();
}
