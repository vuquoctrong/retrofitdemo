package rekkisoft.trongvu.com.retrofitdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


import rekkisoft.trongvu.com.retrofitdemo.data.mode.Item;
import rekkisoft.trongvu.com.retrofitdemo.data.mode.Owner;

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;

    public AnswersAdapter(List<Item> mItems, Context mContext) {
        this.mItems = mItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = mItems.get(position);
        Owner owner = item.getOwner();
        holder.tv.setText(owner.getDisplayName().toString());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tvitem);
        }
    }
}