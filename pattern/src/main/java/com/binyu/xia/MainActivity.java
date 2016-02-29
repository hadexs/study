package com.binyu.xia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.binyu.xia.pattern.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {


    @Bind(R.id.btn_abstract_factory_pattern)
    Button btnAbstractFactoryPattern;
    @Bind(R.id.btn_builder_pattern)
    Button btnBuilderPattern;
    @Bind(R.id.btn_clone_pattern)
    Button btnClonePattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_six_principle)
    public void sixPrinciple(){

    }

    @OnClick(R.id.btn_single_pattern)
    public void singlePattern(){

    }

    @OnClick(R.id.btn_factory_pattern)
    public void factoryPattern(){

    }

}
