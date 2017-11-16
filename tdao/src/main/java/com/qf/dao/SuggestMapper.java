package com.qf.dao;

import com.qf.pojo.Suggest;
import com.qf.pojo.SuggestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuggestMapper {
    int countByExample(SuggestExample example);

    int deleteByExample(SuggestExample example);

    int insert(Suggest record);

    int insertSelective(Suggest record);

    List<Suggest> selectByExample(SuggestExample example);

    int updateByExampleSelective(@Param("record") Suggest record, @Param("example") SuggestExample example);

    int updateByExample(@Param("record") Suggest record, @Param("example") SuggestExample example);
}