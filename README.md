# DataBinding-Demo
Demostration of data binding in android

1. Add in build.gradle
```
android {
    ...
    dataBinding {
        enabled true
    }
}
```
2. Enclose every layout in layout tags

```
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <RelativeLayout
        android:id="@+id/activity_main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context="com.inthecheesefactory.lab.databinding.MainActivity">

		...
		
    </RelativeLayout>
</layout>
```

3. Rebuild project

4. Use data binding 
```
 ActivityMainBinding mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
 mBinding.txtName.setText("Manoj Bhadane");
```

5. Done.. enjoy!!

