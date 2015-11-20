package ce.itcr.freeexandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClientMenu extends AppCompatActivity {
    private Button botonmsjC;
    private Button botonrecibidoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_menu);
        botonmsjC=(Button)findViewById(R.id.buttonNMC);
        botonmsjC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClientMenu.this, MensajeCliente.class));
            }
        });
        botonrecibidoC=(Button)findViewById(R.id.buttonRC);
        botonrecibidoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
