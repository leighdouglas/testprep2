package nyc.c4q.leighdouglas.testprep2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private Button logout;
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_nav_drawer);
        if (savedInstanceState == null){
            getFragmentManager().beginTransaction().replace(R.id.activity_main, new ButtonFragment()).commit();
        }
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setAdapter(new NavAdapter());
    }

    private void initButtons(){

        login = (Button) findViewById(R.id.login);
        logout = (Button) findViewById(R.id.logout);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.activity_main, new BoxFragment())
                        .commit();
                login.setVisibility(View.GONE);
                logout.setVisibility(View.GONE);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
     }
}
