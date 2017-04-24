package com.example.custom;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import com.example.user.githubsample.R;

/**
 * Created by User on 2017/4/23.
 * 利用物件導向方式實作 DialogFragment
 * 用意是做一張設計圖，方便套用
 */

public class CustomDialogFragment extends DialogFragment
{
    public CustomDialogFragment()
    {
        // Empty constructor required for DialogFragment
    }

    public static CustomDialogFragment newInstance(String title, String content)
    {
        CustomDialogFragment frag = new CustomDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        args.putString("content", content);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        String title = getArguments().getString("title");
        String content = getArguments().getString("content");

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(content);
        alertDialogBuilder.setPositiveButton(R.string.OK,  new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                // on success
                Log.d("debug", "確認");
            }
        });
        alertDialogBuilder.setNegativeButton(R.string.CANCEL, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                if (dialog != null )
                {
                    Log.d("debug", "取消");
                    dialog.dismiss();
                }
            }

        });

        return alertDialogBuilder.create();
    }

}
