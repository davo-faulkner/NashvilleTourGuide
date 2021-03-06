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
public class ArtFragment extends Fragment {

    public ArtFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.parthenon_name, R.string.parthenon_description, R.string.parthenon_address, R.drawable.parthenon));
        locations.add(new Location(R.string.parthenon_gallery_name, R.string.parthenon_gallery_description, R.string.parthenon_address, R.drawable.parthenon_int));
        locations.add(new Location(R.string.frist_name, R.string.frist_description, R.string.frist_address, R.drawable.frist));
        locations.add(new Location(R.string.cheekwood_name, R.string.cheekwood_description, R.string.cheekwood_address, R.drawable.cheekwood));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}