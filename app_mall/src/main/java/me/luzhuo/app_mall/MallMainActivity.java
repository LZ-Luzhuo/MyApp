package me.luzhuo.app_mall;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

import me.luzhuo.lib_base.BaseRouterPath;

@Route(path = BaseRouterPath.mallMainActivityPath)
public class MallMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mall_activity_main);
    }
}
