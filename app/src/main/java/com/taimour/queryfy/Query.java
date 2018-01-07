package com.taimour.queryfy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static android.view.View.*;

/**
 * Created by Taimour on 1/6/2018.
 *
 */



public class Query extends Fragment {
    private EditText mEditText;
    private Button sendBtn;
    private RecyclerView.Recycler recycler;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Button listView = (Button) rootview.findViewById(R.id.listviewID)

          return inflater.inflate(R.layout.query,container,false);
        sendBtn = (Button) r .findViewById(R.id.qSndbtns);
    }


}
