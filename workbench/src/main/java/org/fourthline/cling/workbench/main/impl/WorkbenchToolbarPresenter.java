/*
 * Copyright (C) 2011 4th Line GmbH, Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.fourthline.cling.workbench.main.impl;


import org.fourthline.cling.workbench.main.CreateDemoDevice;
import org.fourthline.cling.workbench.main.WorkbenchToolbarView;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * @author Christian Bauer
 */
@ApplicationScoped
public class WorkbenchToolbarPresenter implements WorkbenchToolbarViewImpl.Presenter {

    @Inject
    protected WorkbenchToolbarView view;

    @Inject
    protected Event<CreateDemoDevice> createDemoDeviceEvent;

    @Override
    public void init() {
        view.setPresenter(this);
    }

    @Override
    public void onCreateDemoDevice() {
        createDemoDeviceEvent.fire(new CreateDemoDevice());
    }

}
