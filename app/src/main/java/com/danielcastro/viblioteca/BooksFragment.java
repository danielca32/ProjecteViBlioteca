package com.danielcastro.viblioteca;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class BooksFragment extends Fragment {
    private final List<Book> elements = new ArrayList<>();

    public BooksFragment() {
        // Required empty public constructor
    }

    public static BooksFragment newInstance() {
        BooksFragment fragment = new BooksFragment(); //TODO ???
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_books_fragment, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.bookRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
        BooksRecyclerViewAdapter adapter = new BooksRecyclerViewAdapter(elements);
        recyclerView.setAdapter(adapter);

        DatabaseReference db = FirebaseDatabase.getInstance().getReference();
        db.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                //ArrayList<Object> value = new ArrayList<Object>();

                Book book1 = new Book();
                String[] array = new String[10];
                // textview.setText(book1.getAuthor());
                // Log.d("VIB", "Value is: " + textview.getText());
                int i = 0;
                for(DataSnapshot a : dataSnapshot.child("books").child("0").getChildren()) {
                    array[i] = String.valueOf(a.getValue());
                    i++;
                }

                String ISBN = array[0];
                String author = array[1];
                String code = array[2];
                String date =  array[3];
                String description =  array[4];
                String edition = array[5];
                String genre =  array[6];
                String imageUrl =  array[7];
                String publisher =  array[8];
                String title =  array[9];
                System.out.println(imageUrl);
                book1.setAuthor(author);
                book1.setCode(code);
                book1.setISBN(ISBN);
                book1.setDate(date);
                book1.setDescription(description);
                book1.setEdition(edition);
                book1.setGenre(genre);
                book1.setImageUrl(imageUrl);
                book1.setPublisher(publisher);
                book1.setTitle(title);
                elements.add(book1);
                System.out.println(elements.size());
                for (int x = 0; 500>x; x++){
                    elements.add(book1);
                }
                adapter.notifyDataSetChanged();



            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        // Inflate the layout for this fragment
        return rootView;

    }
    @Override
    public void onStart(){
        super.onStart();

    }
}

