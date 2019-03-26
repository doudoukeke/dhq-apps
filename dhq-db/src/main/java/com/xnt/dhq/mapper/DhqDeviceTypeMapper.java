package com.xnt.dhq.mapper;

import com.xnt.dhq.model.DhqDeviceType;
import com.xnt.dhq.model.DhqDeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhqDeviceTypeMapper {
    int countByExample(DhqDeviceTypeExample example);

    int deleteByExample(DhqDeviceTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DhqDeviceType record);

    int insertSelective(DhqDeviceType record);

    List<DhqDeviceType> selectByExample(DhqDeviceTypeExample example);

    DhqDeviceType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DhqDeviceType record, @Param("example") DhqDeviceTypeExample example);

    int updateByExample(@Param("record") DhqDeviceType record, @Param("example") DhqDeviceTypeExample example);

    int updateByPrimaryKeySelective(DhqDeviceType record);

    int updateByPrimaryKey(DhqDeviceType record);
}