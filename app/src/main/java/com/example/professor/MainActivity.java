package com.example.professor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editNome, editHorasAula, editValorHora, editAnosInstituicao;
    private TextView textResultado;
    private Button buttonCalcularTitular, buttonCalcularHorista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os elementos da interface
        editNome = findViewById(R.id.editNome);
        editHorasAula = findViewById(R.id.editHorasAula);
        editValorHora = findViewById(R.id.editValorHora);
        editAnosInstituicao = findViewById(R.id.editAnosInstituicao);
        textResultado = findViewById(R.id.textResultado);
        buttonCalcularTitular = findViewById(R.id.buttonCalcularTitular);
        buttonCalcularHorista = findViewById(R.id.buttonCalcularHorista);

        // Calcular salário do Professor Titular
        buttonCalcularTitular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pegando o valor inserido para anos na instituição
                String anosInstituicaoStr = editAnosInstituicao.getText().toString();

                if (!anosInstituicaoStr.isEmpty()) {
                    int anosInstituicao = Integer.parseInt(anosInstituicaoStr);

                    // Definindo um salário base qualquer
                    double salarioBase = 5000.0;

                    // Instanciando o professor titular e calculando o salário
                    ProfessorTitular professorTitular = new ProfessorTitular(anosInstituicao, salarioBase);
                    double salario = professorTitular.calcSalario();

                    // Exibindo o resultado
                    textResultado.setText("Salário Titular: R$ " + salario);
                }
            }
        });

        // Calcular salário do Professor Horista
        buttonCalcularHorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pegando os valores inseridos para horas e valor por hora
                String horasAulaStr = editHorasAula.getText().toString();
                String valorHoraStr = editValorHora.getText().toString();

                if (!horasAulaStr.isEmpty() && !valorHoraStr.isEmpty()) {
                    int horasAula = Integer.parseInt(horasAulaStr);
                    double valorHora = Double.parseDouble(valorHoraStr);

                    // Instanciando o professor horista e calculando o salário
                    ProfessorHorista professorHorista = new ProfessorHorista(horasAula, valorHora);
                    double salario = professorHorista.calcSalario();

                    // Exibindo o resultado
                    textResultado.setText("Salário Horista: R$ " + salario);
                }
            }
        });
    }
}
