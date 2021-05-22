package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private EditText emailTxt, passwordTxt;
    private Button loginBtn;
    private ProgressBar pBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        emailTxt = findViewById(R.id.editTextEmail);
        passwordTxt = findViewById(R.id.editTextPassword);
        loginBtn = findViewById(R.id.buttonLogin);
        pBar = findViewById(R.id.progressBar);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUserAccount();
            }
        });
    }
     private void loginUserAccount() {
        pBar.setVisibility(View.VISIBLE);

        String email, password;
        email = emailTxt.getText().toString();
        password = passwordTxt.getText().toString();

        //Validation
         if(TextUtils.isEmpty(email)) {
             Toast.makeText(getApplicationContext(), "Please enter email!", Toast.LENGTH_SHORT).show();
             return;

         }

         if(TextUtils.isEmpty(password)) {
             Toast.makeText(getApplicationContext(),"Please enter password!",Toast.LENGTH_SHORT).show();
             return;
         }

         //sigin existing user
         mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(
                 new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if(task.isSuccessful()) {
                             Toast.makeText(getApplicationContext(),"Login successful!",Toast.LENGTH_SHORT).show();

                             //hide progress bar
                             pBar.setVisibility(View.GONE);

                             // after successful authentication
                             // go to main activity

                             Intent mainScreen = new Intent(LoginActivity.this, MainActivity.class);
                             startActivity(mainScreen);
                         }
                         else {
                             Toast.makeText(getApplicationContext(),"Login failed!", Toast.LENGTH_SHORT).show();

                             pBar.setVisibility(View.GONE);

                         }



                     }
                 }
         );




     }






}