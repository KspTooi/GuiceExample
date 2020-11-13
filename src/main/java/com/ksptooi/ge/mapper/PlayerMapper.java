package com.ksptooi.ge.mapper;

import com.ksptooi.ge.entity.Player;
import org.apache.ibatis.annotations.Param;

public interface PlayerMapper {


    //ID找玩家
    Player getPlayerById(@Param("id")Integer id);

    //名称找玩家
    Player getPlayerByName(@Param("name")String id);

    //更新玩家
    Integer updatePlayer(Player player);

    //加入玩家
    Integer insertPlayer(Player player);

}
