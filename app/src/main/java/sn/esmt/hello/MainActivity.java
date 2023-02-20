package sn.esmt.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button LoginBt;
    private EditText Emailtxt;
    private EditText Passwordtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginBt = (Button) findViewById(R.id.LoginBt);
        Emailtxt = (EditText) findViewById(R.id.Emailtxt);
        Passwordtxt = (EditText) findViewById(R.id.Passwordtxt);

        LoginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Récupération de la saisie de l'email et du mot de passe
                String Email = Emailtxt.getText().toString();
                String Password = Passwordtxt.getText().toString();
               // Toast.makeText(MainActivity.this, "email", Toast.LENGTH_SHORT).show();
                if (Email.equals("akp@gmail.com") && Password.equals("abc123")){
                    Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Email ou Mot de Passe incorrect :( !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}