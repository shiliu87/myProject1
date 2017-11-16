package com.qf.dao;

import com.qf.pojo.TearchInfo;
import com.qf.pojo.TearchInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TearchInfoMapper {
    int countByExample(TearchInfoExample example);

    int deleteByExample(TearchInfoExample example);

    int deleteByPrimaryKey(Integer tearchid);

    int insert(TearchInfo record);

    int insertSelective(TearchInfo record);

    List<TearchInfo> selectByExample(TearchInfoExample example);

    TearchInfo selectByPrimaryKey(Integer tearchid);

    int updateByExampleSelective(@Param("record") TearchInfo record, @Param("example") TearchInfoExample example);

    int updateByExample(@Param("record") TearchInfo record, @Param("example") TearchInfoExample example);

    int updateByPrimaryKeySelective(TearchInfo record);

    int updateByPrimaryKey(TearchInfo record);
}