package com.example.g8s21navigetor;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class RestarFragment extends Fragment implements View.OnClickListener{
    EditText txtnum1, txtnum2;
    Button btncalcula;
    TextView resultado;
    private RestarViewModel mViewModel;


    public static RestarFragment newInstance() {
        return new RestarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.restar_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RestarViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtnum1 = view.findViewById(R.id.txtnum1);
        txtnum2 = view.findViewById(R.id.txtnum2);
        btncalcula = view.findViewById(R.id.btncalcula);
        resultado = view.findViewById(R.id.resultado);

        btncalcula.setOnClickListener(this);

        mViewModel = new ViewModelProvider(this).get(RestarViewModel.class);
        resultado.setText(String.valueOf(mViewModel.getResultado()));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncalcula:

                mViewModel.setNum1(Integer.parseInt(txtnum1.getText().toString()));
                mViewModel.setNum2(Integer.parseInt(txtnum2.getText().toString()));
                resultado.setText(String.valueOf(mViewModel.getResultado()));
                Toast.makeText(getActivity(), "resultado:" + String.valueOf(mViewModel.getResultado()), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}