/*
 * BlogBridge -- RSS feed reader, manager, and web based service
 * Copyright (C) 2002-2009 by R. Pito Salas
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation;
 * either version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program;
 * if not, write to the Free Software Foundation, Inc., 59 Temple Place,
 * Suite 330, Boston, MA 02111-1307 USA
 *
 * Contact: R. Pito Salas
 * mailto:pitosalas@users.sourceforge.net
 * More information: about BlogBridge
 * http://www.blogbridge.com
 * http://sourceforge.net/projects/blogbridge
 */

package com.salas.bb.core.actions.article;

import com.salas.bb.core.GlobalController;
import com.salas.bb.views.feeds.IFeedDisplay;
import com.salas.bb.views.mainframe.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Cycles view mode backwards.
 */
public class CycleViewModeBackwardAction extends AbstractAction
{
    private static CycleViewModeBackwardAction instance;

    /**
     * Hidden constructor of singleton class.
     */
    private CycleViewModeBackwardAction()
    {
        setEnabled(false);
    }

    /**
     * Returns initialized instance.
     *
     * @return instance of action.
     */
    public static synchronized CycleViewModeBackwardAction getInstance()
    {
        if (instance == null) instance = new CycleViewModeBackwardAction();
        return instance;
    }

    /**
     * Invoked when action occurs.
     *
     * @param e action event details object.
     */
    public void actionPerformed(ActionEvent e)
    {
        final MainFrame mainFrame = GlobalController.SINGLETON.getMainFrame();
        IFeedDisplay feedDisplay = mainFrame.getArticlesListPanel().getFeedView();

        feedDisplay.cycleViewModeBackward();
    }
}
