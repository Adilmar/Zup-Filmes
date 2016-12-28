package com.fenix.filmes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.app.ProgressDialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Cache;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.UnsupportedEncodingException;

/**
 * Created by Adilmar Dantas on 28/12/2016.
 */

public class Main extends AppCompatActivity {

    private static final String buscarfilmes = "http://www.omdbapi.com/t=";

    ProgressDialog progressDialog;
    private EditText mSearchEditText;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        progressDialog = new ProgressDialog(this);


    }
}
