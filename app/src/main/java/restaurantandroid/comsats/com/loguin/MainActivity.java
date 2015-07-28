package restaurantandroid.comsats.com.loguin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;

import java.util.List;


public class MainActivity extends ActionBarActivity {

    //Atributos

    Button BotonEntrada; //Butom
    private Button update;
    EditText txtetUserName,txtpass; //Textobox
    TextView tv;
    HttpPost httppost; //Http Post de
    StringBuffer buffer; //Creacion de Cadena
    HttpResponse response; //sistema de archivos para que puedan ser reutilizados
    HttpClient httpclient; //Hilo de seguridad clientes HTTP depende de la implementación y configuración del cliente específico.
    List<NameValuePair> nameValuePairs; //parametro de valor
    ProgressDialog dialog = null; //MEnsaje de Dialogo

    TextView tHora;
    int hora=0, minuto =0, segundo = 0;
    Intent i;
    Thread iniReloj = null;
    Runnable r;
    boolean isUpdate = false;
    String sec, min, hor;

    String curTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
