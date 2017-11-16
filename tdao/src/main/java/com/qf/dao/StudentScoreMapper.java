package com.qf.dao;

import com.qf.pojo.StudentScore;
import com.qf.pojo.StudentScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentScoreMapper {
    int countByExample(StudentScoreExample example);

    int deleteByExample(StudentScoreExample example);

    int insert(StudentScore record);

    int insertSelective(StudentScore record);

    List<StudentScore> selectByExample(StudentScoreExample example);

    int updateByExampleSelective(@Param("record") StudentScore record, @Param("example") StudentScoreExample example);

    int updateByExample(@Param("record") StudentScore record, @Param("example") StudentScoreExample example);
}