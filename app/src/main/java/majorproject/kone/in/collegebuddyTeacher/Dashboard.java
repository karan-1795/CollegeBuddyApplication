package majorproject.kone.in.collegebuddyTeacher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by batra on 03-01-2017.
 */
public class Dashboard extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =(View)inflater.inflate(R.layout.dashboard_fragment,container,false);
        return view;
    }



}
