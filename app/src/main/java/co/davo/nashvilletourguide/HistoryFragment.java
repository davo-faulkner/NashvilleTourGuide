package co.davo.nashvilletourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.hermitage_name, "Hot Chicken", "101 Broad St\nNashville, TN 37201", R.drawable.hermitage));
        locations.add(new Location(R.string.belcourt_name, "Hot Chicken", "101 Broad St\nNashville, TN 37201", R.drawable.belcourt));
        locations.add(new Location(R.string.jack_daniels_name, "Hot Chicken", "101 Broad St\nNashville, TN 37201", R.drawable.jack_daniel));
        locations.add(new Location(R.string.hall_of_fame_name, "Hot Chicken", "101 Broad St\nNashville, TN 37201", R.drawable.hall_of_fame));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
