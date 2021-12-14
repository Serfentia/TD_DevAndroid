package com.example.td6_appels_rseaux;

import android.app.Application;

public class NewsListApplication extends Application {

    String repos;

    @Override
    public void onCreate() {
        super.onCreate();
        this.repos = null;
    }

    public String getRepos(){
        return repos;
    }

    public void setRepos(String rep){
        this.repos=rep;
    }
}
