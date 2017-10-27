package com.rongwei.yxfconclusionutils.aui.activity;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.permission.PermissionsActivity;
import com.rongwei.yxfconclusionutils.permission.PermissionsChecker;

public class MyPermissionActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 0; // 请求码
    PermissionsChecker permissionsChecker;
    private String [] permissons={Manifest.permission.CALL_PHONE,Manifest.permission.CHANGE_WIFI_STATE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_permission);
        permissionsChecker=new PermissionsChecker(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (permissionsChecker.lacksPermissions(permissons)) {
            for (String permisson:permissons) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this,permisson)) {

                }
            }

            startPermissionsActivity();
        }
    }

    private void startPermissionsActivity() {
        PermissionsActivity.startActivityForResult(this, REQUEST_CODE, permissons);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 拒绝时, 关闭页面, 缺少主要权限, 无法运行
        if (requestCode == REQUEST_CODE && resultCode == PermissionsActivity.PERMISSIONS_DENIED) {
            finish();
        }
    }
}

