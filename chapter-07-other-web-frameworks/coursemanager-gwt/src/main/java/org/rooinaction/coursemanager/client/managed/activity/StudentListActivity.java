package org.rooinaction.coursemanager.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import java.util.Set;
import org.rooinaction.coursemanager.client.managed.request.ApplicationRequestFactory;
import org.rooinaction.coursemanager.client.managed.ui.RegistrationSetEditor;
import org.rooinaction.coursemanager.client.scaffold.ScaffoldMobileApp;
import org.rooinaction.coursemanager.client.scaffold.activity.IsScaffoldMobileActivity;
import org.rooinaction.coursemanager.client.scaffold.place.AbstractProxyListActivity;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListView;
import org.rooinaction.coursemanager.web.gwt.proxies.RegistrationProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.StudentProxy;

public class StudentListActivity extends StudentListActivity_Roo_Gwt {

    public StudentListActivity(ApplicationRequestFactory requests, ProxyListView<org.rooinaction.coursemanager.web.gwt.proxies.StudentProxy> view, PlaceController placeController) {
        super(placeController, view, StudentProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "Students";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<org.rooinaction.coursemanager.web.gwt.proxies.StudentProxy>> createRangeRequest(Range range) {
        return requests.studentRequest().findStudentEntries(range.getStart(), range.getLength());
    }
}
