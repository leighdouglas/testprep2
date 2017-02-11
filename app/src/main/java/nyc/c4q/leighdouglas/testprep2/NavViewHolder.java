package nyc.c4q.leighdouglas.testprep2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by leighdouglas on 2/7/17.
 */

public class NavViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public NavViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.rv_text);
    }

    public void bind(int position) {
        textView.setText(String.valueOf(position));
    }
}
