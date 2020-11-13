package com.ksptooi.ge.service;

import com.google.inject.Inject;
import com.ksptooi.ge.entity.Player;
import com.ksptooi.ge.mapper.PlayerMapper;
import org.mybatis.guice.transactional.Transactional;

//Mybatis声明式事务
@Transactional
public class PlayerServiceBlock implements PlayerService{


    //注入映射器
    @Inject
    PlayerMapper mapper = null;


    /**
     * 根据ID查找玩家
     *
     * @param id
     * @return 玩家
     */
    public Player getPlayer(Integer id) {
        return mapper.getPlayerById(id);
    }

    /**
     * 根据名称查找玩家
     *
     * @param name
     */
    public Player getPlayer(String name) {
        return mapper.getPlayerByName(name);
    }

    /**
     * 加入玩家
     *
     * @param player 玩家
     * @return 成功t 失败f
     */
    public boolean insertPlayer(Player player) {

        Integer insertPlayer = mapper.insertPlayer(player);

        if(insertPlayer<1){
            throw new RuntimeException("数据操作失败!");
        }

        return true;
    }

    /**
     * 更新玩家数据
     *
     * @param player 玩家
     * @return 成功t 失败f
     */
    public boolean updatePlayer(Player player) {

        Integer updatePlayer = mapper.updatePlayer(player);

        if(updatePlayer<1){
            throw new RuntimeException("数据操作失败!");
        }

        return true;
    }
}
