package br.com.dio.coinconverter.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.dio.coinconverter.data.database.dao.ExchangeDao
import br.com.dio.coinconverter.data.model.ExchangeResponseValue

@Database(entities = [ExchangeResponseValue::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun exchangeDao(): ExchangeDao

    companion object{
        fun getInstance(context: Context): AppDataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java,
            "exchange_app_db"
            ).build()
        }
    }
}