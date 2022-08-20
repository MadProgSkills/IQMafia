package ru.iqmafia.iqmafiaandroidapp.judge.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

@Database(entities = [CurrentGamePlayerModel::class], version = 1)
abstract class IqDatabase : RoomDatabase() {
    abstract fun getDao(): JudgeDao


    companion object{

        @Volatile
        private var database: IqDatabase? = null

        @Synchronized
        fun getInstance(context: Context): IqDatabase {
            if (database == null) {
                database = Room.databaseBuilder(
                    context,
                    IqDatabase::class.java,
                    "database").fallbackToDestructiveMigration().build()
                return database as IqDatabase
            }
            return database as IqDatabase
        }
    }
}