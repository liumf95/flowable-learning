package org.liumf;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.flowable.idm.engine.impl.cfg.StandaloneIdmEngineConfiguration;

/**
 * @author liumf
 * @date 22:34 2024/4/22
 * @className HolidayRequest
 * @description
 */

public class HolidayRequest {


    public static void main(String[] args) {


        //1、创建ProcessEngineConfiguration实例,该实例可以配置与调整流程引擎的设置
        ProcessEngineConfiguration cfg=new StandaloneProcessEngineConfiguration()
                //2、通常采用xml配置文件创建ProcessEngineConfiguration，这里直接采用代码的方式
                //3、配置数据库相关参数
                .setJdbcUrl("jdbc:mysql://47.98.101.228:3306/flowable?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false")
                .setJdbcUsername("root")
                .setJdbcPassword("123456")
                .setJdbcDriver("com.mysql.cj.jdbc.Driver")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        //4、初始化ProcessEngine流程引擎实例
        ProcessEngine processEngine=cfg.buildProcessEngine();

        // 执行过后数据库会创建34张表
        // select count(*) from information_schema.TABLES where TABLE_SCHEMA ='flowable'


    }
}
