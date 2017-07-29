package com.example.phamm.demotabhost1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by phamm on 7/29/2017.
 */

public class tab1 extends android.support.v4.app.ListFragment {
    String arr[]={"Android","Java","IOS","C#","NODEJS","PHP","UNITY 3D"};
    ArrayAdapter adapter;
    public  static tab1 newInstant(int page, String text)
    {

        tab1 frm_ =new tab1();
        Bundle argBundle =new Bundle();
        argBundle.putInt("page",page);
        argBundle.putString("content",text);
        frm_.setArguments(argBundle);
        return frm_;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        adapter = new ArrayAdapter(getActivity(),R.layout.support_simple_spinner_dropdown_item,arr);
        setListAdapter(adapter);
        return view;
    }
}
