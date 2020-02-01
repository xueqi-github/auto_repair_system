package com.zlp.auto_repair_system.mapper;

import com.zlp.auto_repair_system.pojo.MaintenanceLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MaintenanceRecordMapper extends CommonMapper<MaintenanceLog> {
}