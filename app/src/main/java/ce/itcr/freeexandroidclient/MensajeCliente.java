package ce.itcr.freeexandroidclient;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * Pantalla de Mensaje de Cliente
 * @author Daniela Hernández
 *
 */

public class MensajeCliente extends AppCompatActivity {
    private Button botonEnviarC;
    private EditText MensajeCtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje_cliente);
        //Declaracion de botones y elementos
        MensajeCtxt=(EditText)findViewById(R.id.MensajeCtxt);
        botonEnviarC=(Button)findViewById(R.id.buttonSendC);
        botonEnviarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String MensajeC=MensajeCtxt.getText().toString();
                if(!MensajeC.equals("")){
                    //Enviar Mensaje
                }
                else{
                    Snackbar.make(v,"El mensaje esta vacio, debe agregar texto",Snackbar.LENGTH_SHORT)
                            .setAction("Action",null).show();
                }
            }
        });
    }
}
