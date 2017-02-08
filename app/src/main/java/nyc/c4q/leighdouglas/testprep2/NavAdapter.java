package nyc.c4q.leighdouglas.testprep2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by leighdouglas on 2/7/17.
 */

public class NavAdapter extends RecyclerView.Adapter<NavViewHolder> {

    @Override
    public NavViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);
        return new NavViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NavViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return 130;
    }
}
