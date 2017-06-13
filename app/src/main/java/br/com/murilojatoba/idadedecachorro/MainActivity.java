package br.com.murilojatoba.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtIdade;
    private Button btnDescobrir;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIdade = (EditText) findViewById(R.id.txtIdade);
        btnDescobrir = (Button) findViewById(R.id.btnDescobrir);
        lblResultado = (TextView) findViewById(R.id.lblResultado);

        btnDescobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String idade = txtIdade.getText().toString();

                if(idade.isEmpty()){
                    lblResultado.setText("Nenhum número digitado!!");
                }
                else {
                    lblResultado.setText("Idade humana: "+ calcularIdadeHumana(Integer.parseInt(idade)));
                }
            }
        });
    }

    private int calcularIdadeHumana(int idadeCachorro){
        return idadeCachorro * 7;
    }
}
