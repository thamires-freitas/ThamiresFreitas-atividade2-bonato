package com.example.arqdsis.thamiresfreitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "br.usjt.meuprimeiroapp.MESSAGE";
    //será chamado quando o usuário clicar em Enviar public void sendMessage(View view){
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE,message);

    startActivity(intent);

}
}
