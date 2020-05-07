package adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewsample_java.R;

import java.util.ArrayList;

import classes.SampleItem;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleViewHolder> {
    //create the ArrayList variable that will contain the sampleItem list
    ArrayList<SampleItem> mSampleList;

    //create a ViewHolder needed by the Adapter
    public static class SampleViewHolder extends RecyclerView.ViewHolder{
        //create variables for the SampleItems
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public SampleViewHolder(@NonNull View itemView) {
            super(itemView);
            //asssign the SampleItemViews
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }
    //to get the data from the arrayList into the Adapter
    //pass it into the adapter constructor
    public SampleAdapter(ArrayList<SampleItem> sampleItem){
        mSampleList = sampleItem;
    }


    @NonNull
    @Override
    public SampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //to pass the item layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_item,parent,false);
        //create viewholder
        SampleViewHolder sampleViewHolder = new SampleViewHolder(v);
        return sampleViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull SampleViewHolder holder, int position) {
        //get the item infornout of the single item into the adapter
        //to pass the infor into the views
        //first create an instance of the SampleItem
        SampleItem currentItem = mSampleList.get(position);
        //on the currentItem call the getterMethod to get information out of it and pass it into the views which are in the viewHolder
        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());


    }

    @Override
    //define how many items will be in the list
    public int getItemCount() {
        return mSampleList.size();
    }
}
