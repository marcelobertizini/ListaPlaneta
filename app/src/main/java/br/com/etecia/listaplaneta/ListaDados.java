package br.com.etecia.listaplaneta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaDados extends AppCompatActivity {

    TextView lstPlanetas;
    ImageView imgPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_dados);

        lstPlanetas = (TextView) findViewById(R.id.ltsPlanetas);
        imgPlanetas = (ImageView) findViewById(R.id.imgPlanetas);

        Intent intent = getIntent();
        String nomeRetorno = intent.getStringExtra("name");
        int imagemRetornno = intent.getIntExtra("image", 0);

        lstPlanetas.setText(nomeRetorno);
        imgPlanetas.setImageResource(imagemRetornno);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public boolean onOptionsItemSlected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
                    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
