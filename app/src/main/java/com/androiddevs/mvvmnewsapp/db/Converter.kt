package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.models.Source


class Converter {
    @TypeConverter
    fun fromSource(source: Source) : String {
        return source.name
    }

    fun toSource(name: String): Source {
        return Source(name, name)
    }
}