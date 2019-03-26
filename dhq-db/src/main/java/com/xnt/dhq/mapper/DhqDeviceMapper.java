package com.xnt.dhq.mapper;

import com.xnt.dhq.model.DhqDevice;
import com.xnt.dhq.model.DhqDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhqDeviceMapper {
    int countByExample(DhqDeviceExample example);

    int deleteByExample(DhqDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DhqDevice record);

    int insertSelective(DhqDevice record);

    List<DhqDevice> selectByExample(DhqDeviceExample example);

    DhqDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DhqDevice record, @Param("example") DhqDeviceExample example);

    int updateByExample(@Param("record") DhqDevice record, @Param("example") DhqDeviceExample example);

    int updateByPrimaryKeySelective(DhqDevice record);

    int updateByPrimaryKey(DhqDevice record);
}