package com.ksptooi.ge.service;

import com.ksptooi.ge.entity.Player;

public interface PlayerService {

    /**
     * 根据ID查找玩家
     * @return 玩家
     */
    Player getPlayer(Integer id);

    /**
     * 根据名称查找玩家
     */
    Player getPlayer(String name);

    /**
     * 加入玩家
     * @param player 玩家
     * @return 成功t 失败f
     */
    boolean insertPlayer(Player player);

    /**
     * 更新玩家数据
     * @param player 玩家
     * @return 成功t 失败f
     */
    boolean updatePlayer(Player player);


}
