package com.epicodus.instantmessaging;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;



/**
 * Created by Guest on 12/7/16.
 */
public class FirebaseMessageViewHolder extends RecyclerView.ViewHolder{
    View mView;
    Context mContex;

    public FirebaseMessageViewHolder(View itemView){
        super(itemView);
        mView = itemView;
        mContex = itemView.getContext();
    }

    public void bindMessage(Message message){
        TextView name = (TextView) mView.findViewById(R.id.userNameTextView);
        TextView messageText = (TextView) mView.findViewById(R.id.messageTextView);
        TextView time = (TextView) mView.findViewById(R.id.timeTextView);

        name.setText(message.getUserName());
        messageText.setText(message.getMessage());
        time.setText("today");
    }
}
