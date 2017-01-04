package com.arduino.zenit.safelock;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    BluetoothAdapter BT;
    TextView textview;
    ListView listView;

    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textview = (TextView) findViewById(R.id.tV1);
        listView = (ListView) findViewById(R.id.lV1);
        bt1 = (Button) findViewById(R.id.btCheckBt);
        bt2 = (Button) findViewById(R.id.btStart);

        BT = BluetoothAdapter.getDefaultAdapter();

        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkBT();
                        showPaired();
                    }
                }
        );



    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, Panel.class);
        MainActivity.this.startActivity(intent);
    }



    void checkBT() {
        if (BT == null) {
            textview.setText("Este dispositivo no tiene Bluetooth, leche");
        }

        if (!BT.isEnabled()) {
            textview.setText("Bluetooth desactivado");
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, RESULT_OK);
        }

        if (BT.isEnabled()) {
            textview.setText("Bluetooth activado");

            Toast toast = Toast.makeText(this, "Bluetooth activado", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    void showPaired() {
        ArrayList<String> items = new ArrayList<String>();
        Set<BluetoothDevice> pairedDevices = BT.getBondedDevices();
        if (pairedDevices.size() > 0) {
            for (BluetoothDevice device : pairedDevices) {
                items.add(device.getName() + "\n" + device.getAddress());
            }
        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);
    }


    // ArrayList<String> getDevices()
    // void showDevices()

    // void establishConnection()

    // void send(device)
    // X receive(X)





}
