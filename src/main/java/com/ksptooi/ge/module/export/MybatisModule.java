package com.ksptooi.ge.module.export;

import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.XMLMyBatisModule;

public class MybatisModule extends XMLMyBatisModule {


    protected void initialize() {
        setClassPathResource("mybatis-h2.xml");
    }

}
