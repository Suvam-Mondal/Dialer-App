package com.example.shuvo.dialerapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bhash,bStar,del;
    EditText editText;
    Intent phoneIntent,callIntent;
    Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        editText = (EditText)findViewById(R.id.textView);
        editText.setShowSoftInputOnFocus(false);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b0 = (Button)findViewById(R.id.button0);
        bhash = (Button)findViewById(R.id.buttonHash);
        bStar = (Button)findViewById(R.id.buttonStar);
        call = (Button) findViewById(R.id.buttonCall);
        del = (Button)findViewById(R.id.buttonDel);
        del.setOnLongClickListener(this);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bhash.setOnClickListener(this);
        bStar.setOnClickListener(this);
        call.setOnClickListener(this);
        del.setOnClickListener(this);

         phoneIntent = new Intent(Intent.ACTION_CALL);
         callIntent = new Intent(Intent.ACTION_CALL);
    }

    @Override
    public void onClick(View v) {
        if (b1.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"1" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (b2.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"2"+str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);


        }
        if (b3.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"3" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);

        }
        if (b4.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"4" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (b5.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"5" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (b6.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"6" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (b7.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"7" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (b8.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"8" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (b9.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"9" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (b0.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"0" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (bhash.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"#" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (bStar.equals(v))
        {
            int pos = editText.getSelectionStart();
            String str = editText.getText().toString();
            String str1 = (String) str.substring(0, pos);
            String str2 = (String) str.substring(pos);
            editText.setText(str1+"*" +str2);
            int pos1 = pos+1;
            editText.setSelection(pos1);
        }
        if (del.equals(v))
        {
            int posElse =  editText.getSelectionStart();
            String text = editText.getText().toString();
            if(text.length()!=0 && posElse >= 1) {
                int pos = editText.getSelectionStart();
                String str1 = (String) text.substring(0, pos-1);
                if(str1.equals(null))
                {

                }
                String str2 = (String) text.substring(pos);
                String latest = str1+str2;
                editText.setText(latest);
                int pos1 = pos-1;
                editText.setSelection(pos1);
            }
            else if ( posElse < 1)
            {
                int pos = editText.getSelectionStart();

                String str2 = (String) text.substring(pos);
                String latest = str2;
                editText.setText(latest);
                int pos1 = pos;
                editText.setSelection(pos1);
            }
           /* else if (del.performLongClick())
            {
                editText.setText("");
            }*/

        }
        if (call.equals(v))
        {

            String number = editText.getText().toString();
            if (number.charAt(0)!='*') {
                if (number.length()<=9)
                {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                }
                else {
                    phoneIntent.setData(Uri.parse("tel:" + number));
                    startActivity(phoneIntent);
                }
            }
            else if (number.subSequence(number.length()-1,number.length()).equals("#"))
            {
                number = number.substring(0, number.length() - 1);
                String callInfo = "tel:" + number + Uri.encode("#");
                callIntent.setData(Uri.parse(callInfo));
                startActivity(callIntent);
                /*String encodedHash = Uri.encode("#");
               // callIntent.setData(Uri.parse("tel:"+number+encodedHash));
                startActivityForResult(new Intent("android.intent.action.CALL",
                        Uri.parse("tel:"+number+ encodedHash)), 1);  */
             }
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (del.equals(v))
        {
            editText.setText("");
        }
        return false;
    }
}
