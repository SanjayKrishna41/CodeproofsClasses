package com.example.codeproofs.codeproofsclasses;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab1 extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    View view;
    ImageView c, cpp, cs, cjava, android, ajava, softtest, appti, web;
    Button enquire;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;

    public Tab1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab1.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab1 newInstance(String param1, String param2) {
        Tab1 fragment = new Tab1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //write your fragment code here
        view = inflater.inflate(R.layout.fragment_tab1, container, false);
        c = view.findViewById(R.id.c);
        cpp = view.findViewById(R.id.cpp);
        cs = view.findViewById(R.id.cs);
        cjava = view.findViewById(R.id.cjava);
        ajava = view.findViewById(R.id.ajava);
        android = view.findViewById(R.id.android);
        web = view.findViewById(R.id.web);
        appti = view.findViewById(R.id.appti);
        softtest = view.findViewById(R.id.softtest);
        enquire = view.findViewById(R.id.enquireButton);
        c.setOnClickListener(this);
        cpp.setOnClickListener(this);
        cs.setOnClickListener(this);
        cjava.setOnClickListener(this);
        ajava.setOnClickListener(this);
        android.setOnClickListener(this);
        web.setOnClickListener(this);
        appti.setOnClickListener(this);
        softtest.setOnClickListener(this);
        enquire.setOnClickListener(this);
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.c) {
            Toast.makeText(getContext(), "C", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), CActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.cpp) {
            Toast.makeText(getContext(), "C++", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), CPPActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.cs) {
            Toast.makeText(getContext(), "C# and .Net", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), CSActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.cjava) {
            Toast.makeText(getContext(), "Core Java", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), CoreJavaActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.ajava) {
            Toast.makeText(getContext(), "Advanced Java", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), AdvanceJavaActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.android) {
            Toast.makeText(getContext(), "Android", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), AndroidActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.web) {
            Toast.makeText(getContext(), "HTML", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), WebServiceActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.softtest) {
            Toast.makeText(getContext(), "Software Testing", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), SoftwareTestingActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.appti) {
            Toast.makeText(getContext(), "Apptitude", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getContext(), ApptiActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.enquireButton) {
            redirect();
        }
    }

    private void redirect() {
        Intent i = new Intent(getContext(), EnquireActivity.class);
        startActivity(i);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
