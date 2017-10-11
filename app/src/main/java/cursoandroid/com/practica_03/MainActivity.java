package cursoandroid.com.practica_03;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lista;
    private List<user> usuarios= new ArrayList<>();
    private userAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setUsuarios();
        lista=(RecyclerView)findViewById(R.id.listaRecycler);
        adapter=new userAdapter(this,usuarios);
        lista.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        lista.setAdapter(adapter);

    }

    private void setUsuarios(){

        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
        usuarios.add(new user("marco garcia","21","7894561230"));
    }


}
