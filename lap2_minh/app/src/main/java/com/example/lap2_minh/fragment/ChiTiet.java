package com.example.lap2_minh.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.lap2_minh.MainActivity;
import com.example.lap2_minh.MyAdapter;
import com.example.lap2_minh.R;
import com.example.lap2_minh.model.Contact;

import java.util.ArrayList;

public class ChiTiet extends Fragment {
    private View mView;
    ListView mListView;

    Contact viet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_chi_tiet, container, false);

        //
        mListView = mView.findViewById(R.id.listViewCT);

        //

        //
        ArrayList<Contact> data = MainActivity.data;
        //


        MyAdapter myAdapter = new MyAdapter(getContext(), R.layout.layout_item_chi_tiet, data);
        mListView.setAdapter(myAdapter);

        myAdapter.notifyDataSetChanged();
/*        mListView.setOnItemClickListener((parent, view, position, id) -> {

            if (viet!=null) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
            this.viet = data.get(position);
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, new UserFragment(viet));
            transaction.addToBackStack(null);
            transaction.commit();


        });*/



        return mView;
    }
}