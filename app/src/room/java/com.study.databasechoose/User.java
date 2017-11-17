package com.study.databasechoose;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

/**
 * 2017/11/16
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */
@Entity(tableName = "user")
public class User {
    @Ignore
    private long id;
    @PrimaryKey
    @NonNull
    private String userId;
    private String userName;
    private int userAge;
    @Ignore
    private String remark;



    public User(String userName, int userAge) {
        this.userId = UUID.randomUUID().toString();
        this.userName = userName;
        this.userAge = userAge;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
