package com.manojbhadane.demodatabinding;

import java.util.Random;

/**
 * Created by manoj.bhadane on 17-01-2018.
 */
public class MainPresenterImpl implements MainPresenter
{
    private static final String ALLOWED_CHARACTERS = "0123456789qwertyuiopasdfghjklzxcvbnm";

    private MainView mView;

    public MainPresenterImpl(MainView view)
    {
        mView = view;
    }

    @Override
    public void getRandomText()
    {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; ++i)
            sb.append(ALLOWED_CHARACTERS.charAt(random.nextInt(ALLOWED_CHARACTERS.length())));
        mView.setRandomText(sb.toString());
    }

}
