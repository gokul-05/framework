package com.vaadin.tests.components.customlayout;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.vaadin.legacy.ui.LegacyTextField;
import com.vaadin.tests.components.TestBase;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomLayout;

public class CustomLayoutPrimaryStyleName extends TestBase {

    @Override
    protected void setup() {
        InputStream is = new ByteArrayInputStream(
                "<div location='loc1'>".getBytes());
        try {
            final CustomLayout cl = new CustomLayout(is);

            cl.addComponent(new LegacyTextField("Hello world"), "loc1");

            cl.setPrimaryStyleName("my-customlayout");
            addComponent(cl);

            addComponent(new Button("Set primary stylename",
                    new Button.ClickListener() {
                        @Override
                        public void buttonClick(ClickEvent event) {
                            cl.setPrimaryStyleName("my-second-customlayout");
                        }
                    }));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected String getDescription() {
        return "CustomLayout should support primary stylenames both initially and dynamically";
    }

    @Override
    protected Integer getTicketNumber() {
        return 9902;
    }

}
