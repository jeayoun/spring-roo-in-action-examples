// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Set;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyDetailsView;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListView;
import org.rooinaction.coursemanager.web.gwt.proxies.RegistrationProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.StudentProxy;

public abstract class StudentDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<StudentProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement fullName;

    @UiField
    SpanElement firstName;

    @UiField
    SpanElement middleNameOrInitial;

    @UiField
    SpanElement lastName;

    @UiField
    SpanElement addressLine1;

    @UiField
    SpanElement addressLine2;

    @UiField
    SpanElement city;

    @UiField
    SpanElement stateCode;

    @UiField
    SpanElement postalCode;

    @UiField
    SpanElement emailAddress;

    @UiField
    SpanElement version;

    @UiField
    SpanElement emergencyContactName;

    @UiField
    SpanElement emergencyContactInfo;

    @UiField
    SpanElement dietaryRestrictions;

    @UiField
    SpanElement registrations;

    StudentProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(StudentProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        fullName.setInnerText(proxy.getFullName() == null ? "" : String.valueOf(proxy.getFullName()));
        firstName.setInnerText(proxy.getFirstName() == null ? "" : String.valueOf(proxy.getFirstName()));
        middleNameOrInitial.setInnerText(proxy.getMiddleNameOrInitial() == null ? "" : String.valueOf(proxy.getMiddleNameOrInitial()));
        lastName.setInnerText(proxy.getLastName() == null ? "" : String.valueOf(proxy.getLastName()));
        addressLine1.setInnerText(proxy.getAddressLine1() == null ? "" : String.valueOf(proxy.getAddressLine1()));
        addressLine2.setInnerText(proxy.getAddressLine2() == null ? "" : String.valueOf(proxy.getAddressLine2()));
        city.setInnerText(proxy.getCity() == null ? "" : String.valueOf(proxy.getCity()));
        stateCode.setInnerText(proxy.getStateCode() == null ? "" : String.valueOf(proxy.getStateCode()));
        postalCode.setInnerText(proxy.getPostalCode() == null ? "" : String.valueOf(proxy.getPostalCode()));
        emailAddress.setInnerText(proxy.getEmailAddress() == null ? "" : String.valueOf(proxy.getEmailAddress()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        emergencyContactName.setInnerText(proxy.getEmergencyContactName() == null ? "" : String.valueOf(proxy.getEmergencyContactName()));
        emergencyContactInfo.setInnerText(proxy.getEmergencyContactInfo() == null ? "" : String.valueOf(proxy.getEmergencyContactInfo()));
        dietaryRestrictions.setInnerText(proxy.getDietaryRestrictions() == null ? "" : String.valueOf(proxy.getDietaryRestrictions()));
        registrations.setInnerText(proxy.getRegistrations() == null ? "" : org.rooinaction.coursemanager.client.scaffold.place.CollectionRenderer.of(org.rooinaction.coursemanager.client.managed.ui.RegistrationProxyRenderer.instance()).render(proxy.getRegistrations()));
        displayRenderer.setInnerText(StudentProxyRenderer.instance().render(proxy));
    }
}
