package com.example.gho5t.diotrial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment{
    public SignInFragment(){}

    //Firebase Instance
    private FirebaseAuth mAuth;

    private EditText mEmail, mPassword;
    private Button nextButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        initializeUI();

        final View view = inflater.inflate(R.layout.fragment_sign_in, container, false);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
//                Intent nextButtonIntent = new Intent(getActivity(), OperationsActivity.class);
//                startActivity(nextButtonIntent);
            }
        });

        return view;

    }

    private void initializeUI() {
        mEmail = getView().findViewById(R.id.signin_email);
        mPassword = getView().findViewById(R.id.signin_password);
        nextButton = getView().findViewById(R.id.next_button);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        String userName = currentUser.getDisplayName();
        if (currentUser != null){
            Toast.makeText(getContext(), "Logged in user is: " + userName, Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(getContext(), "No user logged in!", Toast.LENGTH_LONG).show();
        }
    }

    private void createAccount(){
        String email, password;

        email = mEmail.getText().toString();
        password = mPassword.getText().toString();

        if (TextUtils.isEmpty(email)){
            Toast.makeText(getContext(), "Please enter email...", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(getContext(), "Please enter password...", Toast.LENGTH_LONG).show();
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(getContext(), "createUserWithEmail:success", Toast.LENGTH_LONG).show();
                            return;
                        }else{
                            Toast.makeText(getContext(), "createUserWithEmail:failure", Toast.LENGTH_LONG).show();
                            return;
                        }
                    }
                });
    }
}
