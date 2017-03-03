package com.test.dao;

import com.test.entity.SlmsExperimentLog;

public interface SlmsExperimentLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(SlmsExperimentLog record);

    int insertSelective(SlmsExperimentLog record);

    SlmsExperimentLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SlmsExperimentLog record);

    int updateByPrimaryKey(SlmsExperimentLog record);
}