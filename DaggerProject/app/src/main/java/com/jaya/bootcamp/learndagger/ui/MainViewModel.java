package com.jaya.bootcamp.learndagger.ui;

import com.jaya.bootcamp.learndagger.data.local.DatabaseService;
import com.jaya.bootcamp.learndagger.data.remote.NetworkService;
import com.jaya.bootcamp.learndagger.di.scope.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    @Inject
    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
