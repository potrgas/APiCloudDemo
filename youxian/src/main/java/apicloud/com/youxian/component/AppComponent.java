package apicloud.com.youxian.component;

import android.content.Context;

import apicloud.com.youxian.api.AppApi;
import apicloud.com.youxian.moudle.ApiModule;
import apicloud.com.youxian.moudle.AppModule;
import dagger.Component;

@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    Context getContext();

    AppApi getShopApi();
}