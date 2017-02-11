package nyc.c4q.leighdouglas.testprep2;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonFragment extends Fragment {
    private Button login;
    private Button logout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment1, container, false);
        login = (Button) view.findViewById(R.id.login);
        logout = (Button) view.findViewById(R.id.logout);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.activity_main, new BoxFragment())
                        .commit();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SplashActivity.class);
                startActivity(i);
            }
        });

        return view;
    }
}
