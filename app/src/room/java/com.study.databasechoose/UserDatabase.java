package com.study.databasechoose;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;

/**
 * 2017/11/17
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */
@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "simpleDatabase.db";
    private static UserDatabase INSTANCE;
    public abstract IDbDao dbDao();

    public static UserDatabase getInstance(final Context context) {
        if (INSTANCE == null) {
            synchronized (UserDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = buildDatabase(context.getApplicationContext());
                }
            }
        }
        return INSTANCE;
    }

    private static UserDatabase buildDatabase(final Context appContext) {
        return Room.databaseBuilder(appContext, UserDatabase.class, DATABASE_NAME)
                // 允许主线程执行DB操作
                .allowMainThreadQueries()
                .build();
    }


    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // 因为表没有发生变化，所以这里什么也不做
        }
    };


}
