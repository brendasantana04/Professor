package com.example.professor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
 *@author:<Brenda>
 *@ra:<1110482313042>
 */

public class MainActivity extends AppCompatActivity {

    private EditText editNome, editMatricula, editIdade;
    private TextView textResultado;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editMatricula = findViewById(R.id.editMatricula);
        editIdade = findViewById(R.id.editIdade);
        textResultado = findViewById(R.id.textResultado);
        buttonCalcular = findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfessorTitular professorTitular = new ProfessorTitular(10, 5000.0);

                double salario = professorTitular.calcSalario();

                textResultado.setText("Salário Calculado: R$ " + salario);
            }
        });
    }
}
