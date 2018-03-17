package com.example.android.dormee;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SavedFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SavedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SavedFragment extends ListFragment {

    protected List<Apartment> data;
    private OnFragmentInteractionListener mListener;

    // Required empty public constructor
    public SavedFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SavedFragment.
     */
    public static SavedFragment newInstance() {
        SavedFragment fragment = new SavedFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_saved, container, false);
        data = DataProvider.getData();
        ArrayAdapter<Apartment> savedListAdapter = new ApartmentArrayAdapter(getActivity(), 0, data);
        ListView savedList = (ListView) view.findViewById(android.R.id.list);
        savedList.setAdapter(savedListAdapter);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    class ApartmentArrayAdapter extends ArrayAdapter<Apartment> {
        Context context;
        List<Apartment> objects;

        public ApartmentArrayAdapter(Context context, int resource, List<Apartment> objects) {
            super(context, resource, objects);
            this.context = context;
            this.objects = objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Apartment apartment = objects.get(position);
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            View view = inflater.inflate(R.layout.saved_list_item, null);
            ((TextView) view.findViewById(R.id.item_name)).setText(apartment.getName());
            ((TextView) view.findViewById(R.id.item_price)).setText(apartment.getPrice() + " EGP");
            ((TextView) view.findViewById(R.id.item_rooms)).setText(apartment.getNoOfRooms() + " ROOMS");
            ((TextView) view.findViewById(R.id.item_loc)).setText(apartment.getLocation());
            ((TextView) view.findViewById(R.id.item_area)).setText(apartment.getArea() + " M");
            return view;
        }
    }

}
