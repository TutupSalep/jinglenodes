/**
 * $Revision: $
 * $Date: $
 *
 * Copyright (C) 2006 Jive Software. All rights reserved.
 *
 * This software is published under the terms of the GNU Lesser Public License (LGPL),
 * a copy of which is included in this distribution.
 */

package org.jivesoftware.sparkimpl.profile;

import java.awt.Component;
import java.awt.FocusTraversalPolicy;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jivesoftware.resource.Res;
import org.jivesoftware.spark.component.focus.SpecifiedOrderFocusTraversalPolicy;
import org.jivesoftware.spark.util.ResourceUtils;

public class BusinessPanel extends JPanel {

	private static final long serialVersionUID = -6319059605447012843L;
	private JLabel companyLabel = new JLabel();
    private JLabel streetLabel = new JLabel();
    private JLabel cityLabel = new JLabel();
    private JLabel stateLabel = new JLabel();
    private JLabel zipCodeLabel = new JLabel();
    private JLabel countryLabel = new JLabel();

    private JTextField companyField = new JTextField();
    private JTextField cityField = new JTextField();
    private JTextField stateField = new JTextField();
    private JTextField zipCodeField = new JTextField();
    private JTextField countryField = new JTextField();
    private JTextField streetField = new JTextField();


    private JLabel jobTitleLabel = new JLabel();
    private JLabel departmentLabel = new JLabel();
    private JLabel phoneLabel = new JLabel();
    private JLabel faxLabel = new JLabel();
    private JLabel pagerLabel = new JLabel();
    private JLabel mobileLabel = new JLabel();
    private JLabel webPageLabel = new JLabel();
    private JTextField jobTitleField = new JTextField();
    private JTextField departmentField = new JTextField();
    private JTextField phoneField = new JTextField();
    private JTextField faxField = new JTextField();
    private JTextField pagerField = new JTextField();
    private JTextField mobileField = new JTextField();
    private JTextField webPageField = new JTextField();

    public BusinessPanel() {
        this.setLayout(new GridBagLayout());

        // Setup Resources
        ResourceUtils.resLabel(companyLabel, companyField,  Res.getString("label.company") + ":");
        ResourceUtils.resLabel(streetLabel, streetField,  Res.getString("label.street.address") + ":");
        ResourceUtils.resLabel(cityLabel, cityField,  Res.getString("label.city") + ":");
        ResourceUtils.resLabel(stateLabel, stateField,  Res.getString("label.state.and.province") + ":");
        ResourceUtils.resLabel(zipCodeLabel, zipCodeField, Res.getString("label.postal.code") + ":");
        ResourceUtils.resLabel(countryLabel, countryField,  Res.getString("label.country") + ":");

        ResourceUtils.resLabel(jobTitleLabel, jobTitleField,  Res.getString("label.job.title") + ":");
        ResourceUtils.resLabel(departmentLabel, departmentField,  Res.getString("label.department") + ":");
        ResourceUtils.resLabel(phoneLabel, phoneField, Res.getString("label.phone") + ":");
        ResourceUtils.resLabel(faxLabel, faxField,  Res.getString("label.fax") + ":");
        ResourceUtils.resLabel(mobileLabel, mobileField,  Res.getString("label.mobile") + ":");
        ResourceUtils.resLabel(webPageLabel, webPageField,  Res.getString("label.web.page") + ":");
        ResourceUtils.resLabel(pagerLabel, pagerField,  Res.getString("label.pager") + ":");

        this.add(streetField, new GridBagConstraints(1, 1, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
        this.add(countryField, new GridBagConstraints(1, 5, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
        this.add(zipCodeField, new GridBagConstraints(1, 4, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
        this.add(stateField, new GridBagConstraints(1, 3, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
        this.add(cityField, new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
        this.add(companyField, new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
        this.add(countryLabel, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(zipCodeLabel, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(stateLabel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(cityLabel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(streetLabel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(companyLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));

        this.add(jobTitleLabel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(jobTitleField, new GridBagConstraints(3, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

        this.add(departmentLabel, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(departmentField, new GridBagConstraints(3, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

        this.add(phoneLabel, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(phoneField, new GridBagConstraints(3, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

        this.add(faxLabel, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(faxField, new GridBagConstraints(3, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

        this.add(pagerLabel, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(pagerField, new GridBagConstraints(3, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

        this.add(mobileLabel, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(mobileField, new GridBagConstraints(3, 5, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

        this.add(webPageLabel, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        this.add(webPageField, new GridBagConstraints(3, 6, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));


        final Component order[] = new Component[] {	
        											companyField, streetField,cityField,
        											stateField, zipCodeField,countryField,
        											jobTitleField,departmentField,phoneField,
        											faxField, pagerField,mobileField,
        											webPageField 
        										   };
        
        FocusTraversalPolicy policy = new SpecifiedOrderFocusTraversalPolicy(order);
        setFocusTraversalPolicy(policy);
        setFocusTraversalPolicyProvider(true); 
    }

    public void setCompany(String company) {
        companyField.setText(company);
    }

    public String getCompany() {
        return companyField.getText();
    }

    public void setStreetAddress(String address) {
        streetField.setText(address);
    }

    public String getStreetAddress() {
        return streetField.getText();
    }

    public void setCity(String city) {
        cityField.setText(city);
    }

    public String getCity() {
        return cityField.getText();
    }

    public void setState(String state) {
        stateField.setText(state);
    }

    public String getState() {
        return stateField.getText();
    }

    public void setZipCode(String zip) {
        zipCodeField.setText(zip);
    }

    public String getZipCode() {
        return zipCodeField.getText();
    }

    public void setCountry(String country) {
        countryField.setText(country);
    }

    public String getCountry() {
        return countryField.getText();
    }

    public void setJobTitle(String jobTitle) {
        jobTitleField.setText(jobTitle);
    }

    public String getJobTitle() {
        return jobTitleField.getText();
    }

    public void setDepartment(String department) {
        departmentField.setText(department);
    }

    public String getDepartment() {
        return departmentField.getText();
    }

    public void setPhone(String phone) {
        phoneField.setText(phone);
    }

    public String getPhone() {
        return phoneField.getText();
    }

    public void setFax(String fax) {
        faxField.setText(fax);
    }

    public String getFax() {
        return faxField.getText();
    }

    public void setPager(String pager) {
        pagerField.setText(pager);
    }

    public String getPager() {
        return pagerField.getText();
    }

    public void setMobile(String mobile) {
        mobileField.setText(mobile);
    }

    public String getMobile() {
        return mobileField.getText();
    }

    public void setWebPage(String webPage) {
        webPageField.setText(webPage);
    }

    public String getWebPage() {
        return webPageField.getText();
    }

    public void allowEditing(boolean allowEditing) {
        Component[] comps = getComponents();
        if (comps != null) {
            final int no = comps.length;
            for (int i = 0; i < no; i++) {
                Component comp = comps[i];
                if (comp instanceof JTextField) {
                    ((JTextField)comp).setEditable(allowEditing);
                }
            }
        }
    }

}