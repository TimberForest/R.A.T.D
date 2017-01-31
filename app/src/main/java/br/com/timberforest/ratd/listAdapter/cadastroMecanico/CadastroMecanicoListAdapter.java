package br.com.timberforest.ratd.listAdapter.cadastroMecanico;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;

/**
 * Created by andreives on 17/04/2015.
 */
public class CadastroMecanicoListAdapter extends ArrayAdapter<CadastroMecanico>{
    private Context context;

    public CadastroMecanicoListAdapter(Context context) {
        super(context, R.layout.row_layout);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //View de renderização de cada item
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);

        //TextView para o titulo
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        TextView textView1 = (TextView) rowView.findViewById(R.id.label1);

        CadastroMecanico mecanico = this.getItem(position);
        //Seta o texto da noticia no TextView
        textView.setText(mecanico.getNome());
        textView1.setText(mecanico.getFilial());



        //Baixando imagem remota
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        imageView.setImageResource(R.drawable.perfil_mecanico);

        return rowView;
    }

}
