package com.example.marii.signup;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.nfc.Tag;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Invite_Friends extends AppCompatActivity {
    private ListView listView;
    private EditText number;
    private TextView message;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite__friends);
        listView = (ListView)findViewById(R.id.listview);
        number = (EditText)findViewById(R.id.smsNo);
        message = (TextView)findViewById(R.id.smsMsg);
        send = (Button)findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smsNumber = String.format("smsto:%s", number.getText().toString());
                String smsMessage = message.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse(smsNumber));
                intent.putExtra("sms_body", smsMessage);
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
                /*else{
                    Log.d(Tag,"Cant resolve app for ACTION_SENDTO Intent");
                }*/
            }
        });

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String)parent.getItemAtPosition(position);
                String smsNumber = String.format("smsto:%s", selectedItem);
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse(smsNumber));
                //intent.putExtra("address", selectedItem);
                intent.putExtra("sms_body", "Please join this cool app, that allows you to order foods from different restaurants at unbelievable prices. just click this link. https://restaurant.com");
                //intent.setType("vnd.android-dir/mms-sms");
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Cant resolve blah blah", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }
    public void get(View view){
        Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        startManagingCursor(cursor);

        String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};
        int[] to = {android.R.id.text1, android.R.id.text2};

        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, cursor, from, to);
        listView.setAdapter(simpleCursorAdapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}
