package br.com.timberforest.ratd.listAdapter.relatorioAssistenciaTecnica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;

/**
 * Created by andreives on 20/04/2015.
 */
public class RelatorioAssistenciaTecnicaListAdatapter extends ArrayAdapter<RelatorioAssistenciaTecnica>{
    private Context context;

    public RelatorioAssistenciaTecnicaListAdatapter(Context context) {
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

        RelatorioAssistenciaTecnica relatorioAssistenciaTecnica = this.getItem(position);
        //Seta o texto da noticia no TextView
        textView.setText(relatorioAssistenciaTecnica.getCliente());
        textView1.setText(relatorioAssistenciaTecnica.getData());

        //Baixando imagem remota
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        imageView.setImageResource(R.drawable.ic_assist_tec);

        return rowView;
    }
}
