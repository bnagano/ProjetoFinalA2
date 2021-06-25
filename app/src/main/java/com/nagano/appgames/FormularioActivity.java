package com.nagano.appgames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    private EditText etNome;
    private Spinner spNota;
    private Button btnSalvar;
    private String acao;
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        etNome = findViewById(R.id.etNome);
        spNota = findViewById(R.id.spNota);
        btnSalvar = findViewById(R.id.btnSalvar);

        acao = getIntent().getStringExtra("acao");
        if (acao.equals("editar")){
            carregarFormulario();
        }

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });

    }

    private void carregarFormulario(){
        int idGame = getIntent().getIntExtra("idGame", 0);
        if (idGame != 0){
            game = GameDAO.getGameById(this, idGame);
            etNome.setText(game.nome);

            String[] arrayNota = getResources().getStringArray(R.array.arrayNota);
            for (int i=1; i < arrayNota.length; i++){
                if (Integer.valueOf(arrayNota[i]) == game.getNota()){
                    spNota.setSelection(i);
                }
            }
        }
    }

    private void salvar(){
        if (spNota.getSelectedItemPosition() == 0 || etNome.getText().toString().isEmpty()){
            Toast.makeText(this, "Todos campos devem ser preenchidos!", Toast.LENGTH_SHORT).show();
        }else{
            if (acao.equals("novo")){
                game = new Game();
            }

            game.nome = etNome.getText().toString();
            game.setNota(Integer.valueOf(spNota.getSelectedItem().toString()));

            if (acao.equals("editar")){
                GameDAO.editar(game, this);
                finish();
            }else{
                GameDAO.inserir(game, this);
                etNome.setText("");
                spNota.setSelection(0);
            }
        }
    }
}