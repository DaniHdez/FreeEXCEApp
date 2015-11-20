package ce.itcr.freeexandroidclient;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EleccionBS extends AppCompatActivity {
    private Button botonEBS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion_bs);

        botonEBS=(Button)findViewById(R.id.buttonElBS);
        botonEBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if () Se debe agregar la condicion de escoger un Base Station
                startActivity(new Intent(EleccionBS.this, ClientMenu.class));
                //else{
                //Snackbar.make(v, "Debe escoger un Base Station", Snackbar.LENGTH_SHORT)
                  //      .setAction("Action",null).show();
            //}
            }
        });

    }
}
