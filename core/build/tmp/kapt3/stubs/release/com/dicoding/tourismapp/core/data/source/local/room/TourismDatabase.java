package com.dicoding.tourismapp.core.data.source.local.room;

import java.lang.System;

@androidx.room.Database(entities = {com.dicoding.tourismapp.core.data.source.local.entity.TourismEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/dicoding/tourismapp/core/data/source/local/room/TourismDatabase;", "Landroidx/room/RoomDatabase;", "()V", "tourismDao", "Lcom/dicoding/tourismapp/core/data/source/local/room/TourismDao;", "core_release"})
public abstract class TourismDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dicoding.tourismapp.core.data.source.local.room.TourismDao tourismDao();
    
    public TourismDatabase() {
        super();
    }
}