# MssPermission

## Set Up
先在 build.gradle(Project:XXXX) 的 repositories 添加:<br>
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  然后在 build.gradle(Module:app) 的 dependencies 添加:<br>
  ```
  	dependencies {
	        compile 'com.github.mashanshui:MssPermission:v2.0'
	}

```

## Use
让你所有的acticity继承BaseActivity，然后在任何地方都可以向下面这样申请权限：<br>
```
BaseActivity.requestRuntimePermissions(new String[]{"Permissions"}, new PermissionListener() {
            @Override
            public void onGranted() {
                //申请成功
            }

            @Override
            public void onDenied(List<String> deniedPermission) {
                //申请失败，以及失败的权限列表
            }
        });
```
如果你自己已经有BaseActivity了，可以将permissionlib里的代码复制到你的项目中直接使用，让permissionlib里的BaseActivity代替你自己的BaseActivity
