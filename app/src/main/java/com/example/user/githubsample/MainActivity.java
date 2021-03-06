package com.example.user.githubsample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.custom.CustomDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edtAccount)
    EditText edtAccount;
    @BindView(R.id.edtPassword)
    EditText edtPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnRegister)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnLogin, R.id.btnRegister})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.btnLogin:
                FragmentManager fm = getSupportFragmentManager();
                CustomDialogFragment alertDialog = CustomDialogFragment.newInstance("確認", "登出");
                alertDialog.show(fm, "CustomDialogFragment");
                break;
            case R.id.btnRegister:
                break;
        }
    }
}