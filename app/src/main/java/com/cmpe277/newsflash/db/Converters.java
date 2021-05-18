package com.cmpe277.newsflash.db;

import androidx.room.TypeConverter;

import com.cmpe277.newsflash.models.Source;

public class Converters {
    @TypeConverter
    public String fromSource(Source source) {
        return source.getName();
    }

    @TypeConverter
    public Source toSource(String name) {
        return new Source(name, name);
    }

}
