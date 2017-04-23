package com.example.user.githubsample;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
{
    @BindView(R.id.edtAccount)
    EditText edtAccount;
    @BindView(R.id.edtPassword)
    EditText edtPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnRegister)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d("生命週期", "onCreate");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("生命週期", "onStart");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("生命週期", "onResume");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("生命週期", "onPause");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("生命週期", "onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("生命週期", "onDestroy");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("生命週期", "onRestart");
    }

    @OnClick({R.id.btnLogin, R.id.btnRegister})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.btnLogin:
                break;
            case R.id.btnRegister:
                break;
        }
    }
}
