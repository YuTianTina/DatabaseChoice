package com.study.databasechoose;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.study.databasechoose.utils.IDbOperation;

import java.util.List;

/**
 * 2017/11/17
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */
@Dao
public interface IDbDao  extends IDbOperation{
    /**
     * 新增用户
     * @param user
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @Override
    void addUser(User user);

    /**
     * 查询所有用户数据
     * @return
     */
    @Query("select * from user")
    @Override
    List<User> queryUser();
}
