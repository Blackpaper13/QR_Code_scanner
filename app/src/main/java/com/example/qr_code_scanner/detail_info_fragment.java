package com.example.qr_code_scanner;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.qr_code_scanner.databinding.FragmentDetailInfoFragmentBinding;
import com.example.qr_code_scanner.retrofit.APIClient;
import com.example.qr_code_scanner.retrofit.DataResponse;
import com.example.qr_code_scanner.retrofit.GetDataServices;

import java.util.Objects;

import retrofit2.Call;


public class detail_info_fragment extends DialogFragment {

    private FragmentDetailInfoFragmentBinding binding;

    private TextView kode_at, nama_at, kategori_at, lokasi_at, lokasi_cabang, pemilik_at, nomor_seri, tanggal_warranty, status_garansi;
    private String moveLokasiToko, moveLokasiCabang, moveContent;
    private String sKodeat, sNamaat, sKategoriat, sLokasiat, sLokasicabang, sPemilikat, sNomorseri, sTanggalWarranty, sStatusgaransi;
    private ImageButton TombolClose;
    private ProgressDialog progressDialog;

    public static detail_info_fragment newInstance() {return new detail_info_fragment();}


    @Override
    public void onStart() {
        super.onStart();
        Objects.requireNonNull(getDialog()).getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDetailInfoFragmentBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;

        binding.btnClose.setOnClickListener(View.OnClickListener{dismiss();});
        moveLokasiToko = getArguments().getString("LT","");
        moveLokasiCabang = getArguments().getString("LC", "");
        moveContent = getArguments().getString("CN", "");

        prosesTampilInfo(moveLokasiToko, moveLokasiCabang, moveContent);

    }

    private void prosesTampilInfo(String moveLokasiToko, String moveLokasiCabang, String moveContent) {
        //inisialisasi REST API
        GetDataServices apiServices = APIClient.getClient().create(GetDataServices.class);
        Call<DataResponse> add = apiServices.getInfoByKodeAT(sKodeat, "data");
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }

}