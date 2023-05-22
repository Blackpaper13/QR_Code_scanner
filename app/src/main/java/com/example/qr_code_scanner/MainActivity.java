package com.example.qr_code_scanner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qr_code_scanner.databinding.ActivityMainBinding;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private String hLokasiToko, hLokasiCabang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.todoScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator intentIntegrator = new IntentIntegrator(MainActivity.this);
                intentIntegrator.setOrientationLocked(true);
                intentIntegrator.setPrompt("Silkan Scan QR Code");
                intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE);
                intentIntegrator.initiateScan();
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (intentResult != null) {
            String content = intentResult.getContents();
            if (content != null) {
                MovetoconvertData(content);
            } else {
                super.onActivityResult(requestCode, resultCode, data);
            }

        }

    }

    private void MovetoconvertData(String content) {
//        AlertDialog.Builder alertDialogBuilder =
//                new AlertDialog.Builder(this)
//                        .setTitle("Scanning Result")
//                        .setMessage(content)
//                        .setCancelable(false)
//                        .setPositiveButton("Scan Again", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
//                                Toast.makeText(getApplicationContext(), "silakan Scan lagi",Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .setNegativeButton("Finish", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.cancel();
//                            }
//                        });
//        alertDialogBuilder.show();
        hLokasiToko = binding.textFieldLokasiToko.toString().trim();
        hLokasiCabang=binding.textFieldLokasiCabang.toString().trim();

        //inisialisasi fragment for intent
        FragmentManager manager = getSupportFragmentManager();
        detail_info_fragment dialog = new detail_info_fragment();
        dialog.show(manager, "dialog");


        //intent
        Bundle bundle = new Bundle();
        bundle.putString("LT", hLokasiToko);
        bundle.putString("LC", hLokasiCabang);
        bundle.putString("CN", content);
        dialog.setArguments(bundle);

    }


}