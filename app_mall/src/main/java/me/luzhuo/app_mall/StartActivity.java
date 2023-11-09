package me.luzhuo.app_mall;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import me.luzhuo.lib_base.BaseRouterPath;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // startActivity(new Intent(this, MallMainActivity.class));
        ARouter.getInstance().build(BaseRouterPath.mallMainActivityPath).navigation();
    }
}
