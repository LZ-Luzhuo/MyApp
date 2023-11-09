package me.luzhuo.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

import me.luzhuo.lib_base.BaseRouterPath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoLive(View view) {
        // startActivity(new android.content.Intent(this, LiveMainActivity.class));
        ARouter.getInstance().build(BaseRouterPath.liveMainActivityPath).navigation();
    }

    public void gotoLogin(View view) {
        // startActivity(new android.content.Intent(this, LoginMainActivity.class));
        ARouter.getInstance().build(BaseRouterPath.loginMainActivityPath).navigation();
    }

    public void gotoMall(View view) {
        // startActivity(new android.content.Intent(this, MallMainActivity.class));
        ARouter.getInstance().build(BaseRouterPath.mallMainActivityPath).navigation();
    }
}