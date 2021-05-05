package br.edu.unis.minhasdisciplinas.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import br.edu.unis.minhasdisciplinas.R;

public class DisciplinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina);
        setTitle("Disciplina");
    }
}