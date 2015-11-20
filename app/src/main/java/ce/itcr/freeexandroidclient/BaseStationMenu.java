package ce.itcr.freeexandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BaseStationMenu extends AppCompatActivity {
    private Button botonNMsjBS;
    private Button botonrecibidosBS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_station_menu);

        botonNMsjBS=(Button)findViewById(R.id.buttonMsjBS);
        botonNMsjBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseStationMenu.this, MensajeBS.class));
            }
        });
        botonrecibidosBS=(Button)findViewById(R.id.buttonRBS);
        botonrecibidosBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
