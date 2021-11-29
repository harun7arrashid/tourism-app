package com.dicoding.tourismapp.core.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/dicoding/tourismapp/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/dicoding/tourismapp/core/data/source/remote/network/ApiService;", "(Lcom/dicoding/tourismapp/core/data/source/remote/network/ApiService;)V", "getAllTourism", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dicoding/tourismapp/core/data/source/remote/network/ApiResponse;", "", "Lcom/dicoding/tourismapp/core/data/source/remote/response/TourismResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_release"})
public final class RemoteDataSource {
    private final com.dicoding.tourismapp.core.data.source.remote.network.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllTourism(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.dicoding.tourismapp.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.dicoding.tourismapp.core.data.source.remote.response.TourismResponse>>>> p0) {
        return null;
    }
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.dicoding.tourismapp.core.data.source.remote.network.ApiService apiService) {
        super();
    }
}