/*package com.example.guardience.ChatModule;

import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder>  {
    private List<ChatModel> chatModelList;
    private String name;

    public ChatAdapter(List<ChatModel> chatModelData, String name){
        chatModelList = chatModelData;
        this.name = name;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView nameText;
        public TextView msgText;
        public LinearLayout msgLinear;

        public View rootView;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            nameText = itemView.findViewById(R.id.nameText);
            msgText = itemView.findViewById(R.id.msgText);
            msgLinear = itemView.findViewById(R.id.msgLinear);

            rootView = itemView;
            itemView.setEnabled(true);
            itemView.setClickable(true);
        }
    }
    @NonNull
    @Override
    public ChatAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.msg_item ,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(linearLayout);

        return myViewHolder;
    }
    @RequiresApi(api=Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.MyViewHolder holder, int position) {
        ChatModel chatModel = chatModelList.get(position);

        holder.nameText.setText(chatModel.getName());
        holder.msgText.setText(chatModel.getMsg());
        if(chatModel.getName().equals(this.name)){
            holder.nameText.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
            holder.msgText.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

            holder.msgLinear.setGravity(Gravity.RIGHT);
        }
        else{
            holder.nameText.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
            holder.msgText.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);

            holder.msgLinear.setGravity(Gravity.LEFT);
        }

    }

    @Override
    public int getItemCount() {
        return chatModelList == null ? 0 : chatModelList.size();
    }
    public void addChat(ChatModel chatModel){
        chatModelList.add(chatModel);
        notifyItemInserted(chatModelList.size()-1);
    }
}*/
