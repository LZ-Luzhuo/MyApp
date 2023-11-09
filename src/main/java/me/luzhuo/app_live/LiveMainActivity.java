package me.luzhuo.app_live;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

import me.luzhuo.lib_base.BaseRouterPath;

@Route(path = BaseRouterPath.liveMainActivityPath)
public class LiveMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.live_activity_main);
    }
}
