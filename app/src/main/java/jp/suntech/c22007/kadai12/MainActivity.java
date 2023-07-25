package jp.suntech.c22007.kadai12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btConfirm);
        btClick.setOnClickListener(new ButtonClickListener());

        Button btSend = findViewById(R.id.btSend);
        btSend.setOnClickListener(new ButtonClickListener1());

        HelloListener listener = new HelloListener();
        Button btClear = findViewById(R.id.btClear);
        //button.setOnClickListener(new ButtonClickListener());
        btClear.setOnClickListener(listener);
    }


    public class ButtonClickListener1 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            EditText input = findViewById(R.id.etmTitle);
            EditText input1 = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etMail);
            EditText input3 = findViewById(R.id.etComment);

            String inputStr = input.getText().toString();
            String inputStr1 = input1.getText().toString();
            String inputStr2 = input2.getText().toString();
            String inputStr3 = input3.getText().toString();

            Snackbar.make(v,inputStr+","+inputStr1+","+inputStr2+","+inputStr3+"を送信しました",Snackbar.LENGTH_LONG).show();
        }
    }


    public class ButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            EditText input = findViewById(R.id.etmTitle);
            EditText input1 = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etMail);
            EditText input3 = findViewById(R.id.etComment);

            String inputStr = input.getText().toString();
            String inputStr1 = input1.getText().toString();
            String inputStr2 = input2.getText().toString();
            String inputStr3 = input3.getText().toString();
            OrderConfirmDialogFragment dialogFragment = new OrderConfirmDialogFragment();
            dialogFragment.show(getSupportFragmentManager(),"OrderConfirmDialogFragment");
            Snackbar.make(v,inputStr+","+inputStr1+","+inputStr2+","+inputStr3+"を送信しました",Snackbar.LENGTH_LONG).show();
        }
    }

    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);
            EditText input1 = findViewById(R.id.etMail);
            EditText input2 = findViewById(R.id.etComment);
            EditText input3 = findViewById(R.id.etmTitle);
            TextView output = findViewById(R.id.tvOutput);

            input.setText("");
            input1.setText("");
            input2.setText("");
            input3.setText("");
            output.setText("");
            }
        }

    }

