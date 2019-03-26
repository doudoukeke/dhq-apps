package com.xnt.dhq.mapper;

import com.xnt.dhq.model.Device;
import java.util.List;

/**
 * Created by afu on 2019-03-19.
 */

public interface DeviceMapper {
    int insert(Device device);
    int deleteById(Long id);
    Device selectById(Long id);
}