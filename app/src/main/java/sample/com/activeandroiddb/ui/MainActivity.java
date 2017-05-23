package sample.com.activeandroiddb.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.activeandroid.query.Select;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sample.com.activeandroiddb.R;
import sample.com.activeandroiddb.models.SaveUserModel;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        SaveUserModel userModel = getAll().get(0);
        text.setText(userModel.email+"");
    }
    private List<SaveUserModel> getAll() {
        //Getting all items stored in Inventory table
        return new Select()
                .from(SaveUserModel.class)
                .orderBy("Name ASC")
                .execute();
    }
}
