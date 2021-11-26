package com.dicoding.tourismapp.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/dicoding/tourismapp/core/domain/usecase/TourismInteractor;", "Lcom/dicoding/tourismapp/core/domain/usecase/TourismUseCase;", "repo", "Lcom/dicoding/tourismapp/core/domain/repository/ITourismRepository;", "(Lcom/dicoding/tourismapp/core/domain/repository/ITourismRepository;)V", "getAllTourism", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dicoding/tourismapp/core/data/Resource;", "", "Lcom/dicoding/tourismapp/core/domain/model/Tourism;", "getFavoriteTourism", "setFavoriteTourism", "", "tourism", "state", "", "core_release"})
public final class TourismInteractor implements com.dicoding.tourismapp.core.domain.usecase.TourismUseCase {
    private final com.dicoding.tourismapp.core.domain.repository.ITourismRepository repo = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.dicoding.tourismapp.core.data.Resource<java.util.List<com.dicoding.tourismapp.core.domain.model.Tourism>>> getAllTourism() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dicoding.tourismapp.core.domain.model.Tourism>> getFavoriteTourism() {
        return null;
    }
    
    @java.lang.Override()
    public void setFavoriteTourism(@org.jetbrains.annotations.NotNull()
    com.dicoding.tourismapp.core.domain.model.Tourism tourism, boolean state) {
    }
    
    public TourismInteractor(@org.jetbrains.annotations.NotNull()
    com.dicoding.tourismapp.core.domain.repository.ITourismRepository repo) {
        super();
    }
}