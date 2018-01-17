package com.manojbhadane.demodatabinding;

import android.databinding.ViewDataBinding;
import android.view.View;

import com.manojbhadane.demodatabinding.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity implements MainView
{
    private MainPresenter mPresenter;
    private ActivityMainBinding mBinding;

    @Override
    public int getLayoutResId()
    {
        return R.layout.activity_main;
    }

    @Override
    public void init(ViewDataBinding dataBinding)
    {
        mBinding = (ActivityMainBinding) dataBinding;
        mPresenter = new MainPresenterImpl(this);

        mBinding.btnClickMe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mPresenter.getRandomText();
            }
        });
    }

    @Override
    public void setRandomText(String randomText)
    {
        mBinding.txtName.setText(randomText);
    }
}
