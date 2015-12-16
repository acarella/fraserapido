package com.superflousjazzhands.fraserapido;

import com.superflousjazzhands.fraserapido.api.DataSource;

/**
 * Created by antoniocarella on 11/10/15.
 */
public class FraseRapidoApplication extends android.app.Application {

    public static FraseRapidoApplication getSharedInstance(){
        return sharedInstance;
    }

    public static DataSource getSharedDataSource(){
        return FraseRapidoApplication.getSharedInstance().getDataSource();
    }

    private static FraseRapidoApplication sharedInstance;
    private DataSource dataSource;

    @Override
    public void onCreate(){
        super.onCreate();
        sharedInstance = this;
        dataSource = new DataSource();
    }

    public DataSource getDataSource(){
        return dataSource;
    }
}
