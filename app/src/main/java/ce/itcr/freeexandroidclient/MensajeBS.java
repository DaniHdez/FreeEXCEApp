package ce.itcr.freeexandroidclient;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MensajeBS extends AppCompatActivity {
    private Button botonEnviarBS;
    private EditText MensajeBSText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje_bs);

        //Declaracion y accion de elementos

        MensajeBSText=(EditText)findViewById(R.id.mensajeBStxt);

        botonEnviarBS=(Button)findViewById(R.id.buttonsendBS);
        botonEnviarBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String MensajeBS=MensajeBSText.getText().toString();
                if(!MensajeBS.equals("")){
                    //Enviar Mensaje
                }
                else{
                    Snackbar.make(v, "El mensaje esta vacio, debe agregar texto", Snackbar.LENGTH_SHORT)
                            .setAction("Action",null).show();
                }
            }
        });
    }
}
