package jp.suntech.c22007.kadai12;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public  class OrderConfirmDialogFragment extends DialogFragment{
    @Override
    public Dialog onCreateDialog(@NonNull Bundle saveInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("送信確認");
        builder.setMessage("内容を送信します。よろしいですか?");
        builder.setPositiveButton("OK",new DialogButtonClickListener());
        builder.setNegativeButton("キャンセル",new DialogButtonClickListener());
            /*builder.setTitle(R.string.bt_confirm);
            builder.setMessage(R.string.tv_title+R.string.tv_name+R.string.tv_mail+R.string.tv_comment);*/
        AlertDialog dialog = builder.create();
        return dialog;
    }
    private  class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog,int which){
            int view;
            String msg="";
            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    msg = "OK";
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    msg = "ok";
                    break;
            }
        }
    }
}
