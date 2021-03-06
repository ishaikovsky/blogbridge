// BlogBridge -- RSS feed reader, manager, and web based service
// Copyright (C) 2002-2006 by R. Pito Salas
//
// This program is free software; you can redistribute it and/or modify it under
// the terms of the GNU General Public License as published by the Free Software Foundation;
// either version 2 of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
// without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// See the GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License along with this program;
// if not, write to the Free Software Foundation, Inc., 59 Temple Place,
// Suite 330, Boston, MA 02111-1307 USA
//
// Contact: R. Pito Salas
// mailto:pitosalas@users.sourceforge.net
// More information: about BlogBridge
// http://www.blogbridge.com
// http://sourceforge.net/projects/blogbridge
//
// $Id: PostEditorKit.java,v 1.3 2006/12/06 10:49:44 spyromus Exp $
//

package com.salas.bb.remixfeeds.editor;

import com.salas.bb.utils.ResourceID;
import com.salas.bb.utils.uif.html.CustomHTMLEditorKit;

import javax.swing.text.html.StyleSheet;

/**
 * Our custom editor kit with potentially custom stylesheet.
 */
class PostEditorKit extends CustomHTMLEditorKit
{
    private static StyleSheet styles;

    /**
     * Creates HTML editor kit.
     */
    public PostEditorKit()
    {
        super(ResourceID.URL_EDITOR_STYLESHEET);
    }

    /**
     * Returns custom style sheet.
     *
     * @return style sheet.
     */
    public StyleSheet getStyleSheet()
    {
        if (styles == null) styles = loadStyles();
        return styles;
    }
}
