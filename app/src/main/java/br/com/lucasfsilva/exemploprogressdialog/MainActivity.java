package br.com.lucasfsilva.exemploprogressdialog;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnClique;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(this);

        btnClique = (Button) findViewById(R.id.btnClique);

        btnClique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.setTitle("Enviando");
                progressDialog.setMessage("Por favor aguarde!");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();
            }
        });
    }
}
