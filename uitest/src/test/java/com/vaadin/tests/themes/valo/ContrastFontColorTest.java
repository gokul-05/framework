/*
 * Copyright 2000-2014 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.themes.valo;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.elements.TextFieldElement;
import com.vaadin.tests.tb3.MultiBrowserTest;

/**
 * Test for default contrast color variable in valo-font-color function.
 *
 * @author Vaadin Ltd
 */
public class ContrastFontColorTest extends MultiBrowserTest {

    @Test
    public void testTextColor() {
        openTestURL();

        String color = $(TextFieldElement.class).first().getCssValue("color");
        Assert.assertEquals(
                "Unexpected text color value using 0.1 as defualt contrast value :"
                        + color,
                "rgba(230, 230, 230, 1)", color);
    }
}
