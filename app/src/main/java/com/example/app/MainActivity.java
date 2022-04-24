package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.app.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

        String message;     //Declarando a string que guardará a mensagem

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editTextName = (EditText) findViewById(R.id.editTextTextPersonName);
        String name = editTextName.getText().toString();    //Recebe o nome da pessoa

        EditText editTextAddress = (EditText) findViewById(R.id.editTextTextPersonAddress);
        String address = editTextAddress.getText().toString();  //Recebe o endereço da pessoa

        //Monta a mensagem para envio a segunda tela
        message = "Olá " + name + ". A encomenda será entregue em " + address + ". Obrigado!";

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}