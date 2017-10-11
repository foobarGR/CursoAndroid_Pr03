package cursoandroid.com.practica_03;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by juamp on 07/10/2017.
 */

public class userAdapter extends RecyclerView.Adapter<userAdapter.ViewHolder> {


    private Context context;
    private List<user> usersList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_user,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        user usr= usersList.get(position);
        holder.nombre.setText(usr.getNombre());
        holder.edad.setText(usr.getEdad());
        holder.tel.setText(usr.getTelefono());

    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombre,edad,tel;

        public ViewHolder(View itemView) {
            super(itemView);

            nombre=(TextView)itemView.findViewById(R.id.tv_nombre);
            edad=(TextView)itemView.findViewById(R.id.tv_edad);
            tel=(TextView)itemView.findViewById(R.id.tv_telefono);
        }
    }


    public userAdapter(Context context, List<user> usersList) {
        this.context = context;
        this.usersList = usersList;
    }
}
