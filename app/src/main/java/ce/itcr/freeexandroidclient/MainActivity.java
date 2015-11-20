package ce.itcr.freeexandroidclient;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.JsonObject;

import org.json.JSONObject;


/**
 * Pantalla de inicio
 * @author Daniela Hernández
 *
 */


public class MainActivity extends AppCompatActivity {
    private Button botonBS;
    private Button botonClient;
    private Button botonBluetooth;
    private EditText nombreText;
    private BluetoothAdapter bAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Declaracion y acciones de los botones

        nombreText = (EditText) findViewById(R.id.nombreText);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Cerrar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                System.exit(0);
            }
        });

        botonBS = (Button)findViewById(R.id.buttonBaseSt);

        botonBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = nombreText.getText().toString();
                if(!texto.equals("")){
                    JsonObject usuarioBS=new JsonObject();
                    usuarioBS.addProperty("usuario", texto);
                    startActivity(new Intent(MainActivity.this, BaseStationMenu.class));
                }
                else{
                    Snackbar.make(v, "Debe insertar un nombre", Snackbar.LENGTH_SHORT)
                    .setAction("Action",null).show();
                }

            }
        });

        botonClient = (Button)findViewById(R.id.buttonClient);
        botonClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = nombreText.getText().toString();
                if(!texto.equals("")){
                    JsonObject usuarioC=new JsonObject();
                    usuarioC.addProperty("usuario",texto);
                    startActivity(new Intent(MainActivity.this, EleccionBS.class));
                }
                else{
                    Snackbar.make(v, "Debe insertar un nombre", Snackbar.LENGTH_SHORT)
                            .setAction("Action",null).show();
                }
            }
        });
        botonBluetooth=(Button)findViewById(R.id.btnActivate);
        bAdapter=BluetoothAdapter.getDefaultAdapter();
        if(bAdapter.isEnabled()){
            botonBluetooth.setText(R.string.DesactivarBluetooth);
            botonBluetooth.setEnabled(true);
        }
        else{
            botonBluetooth.setText(R.string.ActivarBluetooth);
        }
        botonBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bAdapter.isEnabled()){
                    botonBluetooth.setText(R.string.ActivarBluetooth);
                    botonBluetooth.setEnabled(true);
                    bAdapter.disable();
                }
                else{
                    botonBluetooth.setText(R.string.DesactivarBluetooth);
                    bAdapter.enable();
                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
