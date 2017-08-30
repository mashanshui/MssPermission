package com.example.permissionlib;

import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 */

public interface PermissionListener {
    void onGranted();

    void onDenied(List<String> deniedPermission);
}
