package br.com.timberforest.ratd.listAdapter.relatorioAvaliacaoOperacional;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.model.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacional;

/**
 * Created by andreives on 17/04/2015.
 */
public class RelatorioOperacionalListAdapter extends ArrayAdapter<RelatorioAvaliacaoOperacional>{
    private Context context;

    public RelatorioOperacionalListAdapter(Context context) {
        super(context, R.layout.row_layout_relatorio_operacional);
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //View de renderização de cada item
        View rowView = inflater.inflate(R.layout.row_layout_relatorio_operacional, parent, false);

        //TextView para o titulo
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        TextView textView1 = (TextView) rowView.findViewById(R.id.label1);
        TextView textView2 = (TextView) rowView.findViewById(R.id.label3);
        RelatorioAvaliacaoOperacional relatorioAvaliacaoOperacional = this.getItem(position);
        //Seta o texto da noticia no TextView
        textView.setText(relatorioAvaliacaoOperacional.getNomeEmpresAval());
        textView1.setText(relatorioAvaliacaoOperacional.getNomeOpAval());
        textView2.setText(relatorioAvaliacaoOperacional.getData());


        //Baixando imagem remota
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon_relatorio_operacional);
        imageView.setImageResource(R.drawable.ic_check_list);

        return rowView;
    }

}
