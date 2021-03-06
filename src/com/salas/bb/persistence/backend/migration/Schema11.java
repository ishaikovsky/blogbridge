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

package com.salas.bb.persistence.backend.migration;

import com.salas.bb.persistence.backend.HsqlPersistenceManager;

import java.sql.Connection;

/**
 * (6.7) Adds FEEDPROPERTIES.HANDLING_TYPE
 */
public class Schema11 extends AbstractSchema
{
    /**
     * Migrates from some version to the other.
     *
     * @param con connection to use.
     * @param pm  persistence manager to use for data operations.
     *
     * @throws com.salas.bb.persistence.backend.migration.MigrationException in case of any problems with procedure.
     */
    public void perform(Connection con, HsqlPersistenceManager pm) throws MigrationException
    {
        addColumn(con, "FEEDSPROPERTIES", "HANDLING_TYPE INTEGER DEFAULT '0' NOT NULL");
    }
}