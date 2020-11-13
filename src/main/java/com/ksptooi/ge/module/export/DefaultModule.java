package com.ksptooi.ge.module.export;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Scopes;
import com.ksptooi.ge.service.PlayerService;
import com.ksptooi.ge.service.PlayerServiceBlock;

public class DefaultModule extends AbstractModule {


    @Override
    protected void configure() {
        //绑定内部组件
        bind(PlayerService.class).to(PlayerServiceBlock.class).in(Scopes.SINGLETON);
    }


    //获取到注入器
    public static Injector getInject(){
        Injector injector = Guice.createInjector(new DefaultModule(), new MybatisModule());
        return injector;
    }

}
