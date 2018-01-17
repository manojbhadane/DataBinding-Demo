package com.manojbhadane.demodatabinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by manoj.bhadane on 17-01-2018.
 */
public abstract class BaseActivity<B extends ViewDataBinding> extends AppCompatActivity
{
    protected B dataBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, getLayoutResId());
        init(dataBinding);
    }

    public abstract int getLayoutResId();

    public abstract void init(B dataBinding);
}
