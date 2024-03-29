package eg.com.iti.fawry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView txtForgetPassword,txtSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtForgetPassword=findViewById(R.id.txtForgetPassword);
        txtSignup = findViewById(R.id.txtSignup);
        txtForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "ForgetPassword", Toast.LENGTH_SHORT).show();
                Intent forgetIntent = new Intent(Login.this,ForgetPassword.class);
                startActivity(forgetIntent);
            }
        });
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "Sign Up", Toast.LENGTH_SHORT).show();
                Intent signUpIntent = new Intent(Login.this,SignUpActivity.class);
                startActivity(signUpIntent);
            }
        });
    }
}
