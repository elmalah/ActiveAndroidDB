package sample.com.activeandroiddb.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import sample.com.activeandroiddb.R;
import sample.com.activeandroiddb.models.SaveUserModel;


public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{



    @BindView(R.id.user_name_et)
    EditText user_name_et;
    @BindView(R.id.first_name_et)
    EditText first_name_et;
    @BindView(R.id.last_name_et)
    EditText last_name_et;
    @BindView(R.id.email_et)
    EditText email_et;
    @BindView(R.id.password_et)
    EditText password_et;
    @BindView(R.id.confirm_password_et)
    EditText confirm_password_et;
    @BindView(R.id.mobile_et)
    EditText mobile_et;
    @BindView(R.id.register_button)
    Button register_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        ButterKnife.bind(this);

        // Button click listener
        register_button.setOnClickListener(this);

    }

    boolean isValid() {
        if (TextUtils.isEmpty(user_name_et.getText().toString())) {
            Toast.makeText(RegistrationActivity.this, "invalid_user_name", Toast.LENGTH_LONG).show();
            return false;
        }
        if (TextUtils.isEmpty(first_name_et.getText().toString())) {
            Toast.makeText(RegistrationActivity.this, "invalid_first_name", Toast.LENGTH_LONG).show();
            return false;
        }
        if (TextUtils.isEmpty(last_name_et.getText().toString())) {
            Toast.makeText(RegistrationActivity.this, "invalid_last_name", Toast.LENGTH_LONG).show();
            return false;
        }
        if (TextUtils.isEmpty(password_et.getText().toString())) {
            Toast.makeText(RegistrationActivity.this, "invalid_password", Toast.LENGTH_LONG).show();
            return false;
        }
        if (TextUtils.isEmpty(confirm_password_et.getText().toString()) || !confirm_password_et.getText().toString().equalsIgnoreCase(password_et.getText().toString())) {
            Toast.makeText(RegistrationActivity.this, "invalid_confirm_password", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

    void register() {
        if (isValid()) {

            SaveUserModel userModel = new SaveUserModel();
            userModel.name=user_name_et.getText().toString();
            userModel.username=user_name_et.getText().toString();
            userModel.firstName=first_name_et.getText().toString();
            userModel.lastName=last_name_et.getText().toString();
            userModel.password= password_et.getText().toString();
            userModel.email= email_et.getText().toString();
            userModel.mobile=mobile_et.getText().toString();


            userModel.save();
            startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
        }


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register_button:
                register();
                break;
        }
    }

}
