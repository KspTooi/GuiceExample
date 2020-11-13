package com.ksptooi.ge.t;


import com.google.inject.Injector;
import com.ksptooi.ge.entity.Player;
import com.ksptooi.ge.module.export.DefaultModule;
import com.ksptooi.ge.service.PlayerService;
import org.junit.Before;
import org.junit.Test;

public class GeTest {


    PlayerService playerService = null;

    @Before
    public void init(){
        //获取注入器
        Injector inject = DefaultModule.getInject();
        //获取玩家服务类
        playerService = inject.getInstance(PlayerService.class);
    }




    //加入玩家
    @Test
    public void insertPlayer(){


        //加入玩家
        Player player = new Player();
        player.setName("KspTooi");
        player.setHealth(100);

        if(playerService.getPlayer("KspTooi")!=null){
            System.out.println("玩家已存在!");
            return;
        }

        playerService.insertPlayer(player);
    }


    //查询玩家
    @Test
    public void queryPlayer(){

        Player kspTooi = playerService.getPlayer("KspTooi");
        System.out.println(kspTooi);

    }

    //修改玩家
    @Test
    public void updatePlayer(){

        //取到玩家
        Player kspTooi = playerService.getPlayer("KspTooi");

        //修改玩家生命值
        kspTooi.setHealth(50);

        //更新玩家
        playerService.updatePlayer(kspTooi);

    }


}
