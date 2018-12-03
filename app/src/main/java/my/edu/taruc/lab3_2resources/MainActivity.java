package my.edu.taruc.lab3_2resources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowMessage(View view)
    {
        TextView textViewMessage;
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText(R.string.message);
    }
}
