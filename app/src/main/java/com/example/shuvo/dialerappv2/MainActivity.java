package com.example.shuvo.dialerappv2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rl1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bhash,bStar,del,call;
    EditText editText;
    Intent phoneIntent,callIntent;
    ListView lv;
    int c=0;

    HashMap<String,String> contact = new HashMap<String, String>();
    List<String> name1 = new ArrayList<String>();
    List<String> phno1 = new ArrayList<String>();

    String name,phoneNumber;

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rl1=(RelativeLayout) findViewById(R.id.relativeLayout);
        rl1.setVisibility(View.GONE);

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

        phoneIntent = new Intent(Intent.ACTION_CALL);
        callIntent = new Intent(Intent.ACTION_CALL);

        lv= (ListView) findViewById(R.id.lv);

        getAllContacts(this.getContentResolver());
        myAdapter = new MyAdapter();
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               editText.setText(phno1.get(position));
            }
        });

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rl1.setVisibility(rl1.isShown()?View.GONE:View.VISIBLE);
                c++;
                if (c%2==0)
                {
                    fab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), android.R.drawable.ic_dialog_dialer));
                }
                else {
                    fab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), android.R.drawable.arrow_down_float));
                }
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"1" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"2"+str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"3" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"4" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"5" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"6" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"7" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"8" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"9" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"0" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                b0.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"+" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                        return false;
                    }
                });
                bhash.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"#" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                bStar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = editText.getSelectionStart();
                        String str = editText.getText().toString();
                        String str1 = (String) str.substring(0, pos);
                        String str2 = (String) str.substring(pos);
                        editText.setText(str1+"*" +str2);
                        int pos1 = pos+1;
                        editText.setSelection(pos1);
                    }
                });
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String number = editText.getText().toString();
                        if (number.length()==0)
                        {
                            Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            if (number.charAt(0) != '*') {
                                if (number.length() <= 9) {
                                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                                } else {
                                    phoneIntent.setData(Uri.parse("tel:" + number));
                                    startActivity(phoneIntent);
                                }
                            } else if (number.subSequence(number.length() - 1, number.length()).equals("#")) {
                                number = number.substring(0, number.length() - 1);
                                String callInfo = "tel:" + number + Uri.encode("#");
                                callIntent.setData(Uri.parse(callInfo));
                                startActivity(callIntent);
                            }
                        }
                    }
                });
                del.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
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
                    }
                });
                del.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        if (del.equals(v))
                        {
                            editText.setText("");
                        }
                        return false;
                    }
                });
            }
        });
    }

    //Get the Contacts
    public  void getAllContacts(ContentResolver cr) {

        Cursor phones = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, null);
        while (phones.moveToNext())
        {
            String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            contact.put(name,phoneNumber);
        }
        Map<String, String> map = new TreeMap<String, String>(contact);
        for (Map.Entry kv : map.entrySet())
        {
            name = kv.getKey().toString();
            phoneNumber = kv.getValue().toString();
            name1.add(name);
            phno1.add(phoneNumber);
        }


        phones.close();
    }

    public class MyAdapter extends BaseAdapter
    {
      //  private SparseBooleanArray mCheckStates;
        LayoutInflater mInflater;
        TextView tv1,tv;
        MyAdapter()
        {
           // mCheckStates = new SparseBooleanArray(name1.size());
            mInflater = (LayoutInflater)MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return name1.size();
        }
        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }
        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View vi=convertView;
            if(convertView==null)
                vi = mInflater.inflate(R.layout.row, null);
            TextView tv = (TextView) vi.findViewById(R.id.textView1);
             tv1= (TextView) vi.findViewById(R.id.textView2);

          // SpannableString res = new SpannableString(name2Trimmed);
           // res.setSpan(new RelativeSizeSpan(2f), 0, tempTrimmed.length(), 0);

            tv.setText(name1.get(position));
            tv1.setText(phno1.get(position));

            return vi;
        }

    }
}
