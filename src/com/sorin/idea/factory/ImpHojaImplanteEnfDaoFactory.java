/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.factory;

import java.sql.Connection;

import com.sorin.idea.dao.*;
import com.sorin.idea.jdbc.*;


public class ImpHojaImplanteEnfDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ImpHojaImplanteEnfDao
	 */
	public static ImpHojaImplanteEnfDao create()
	{
		return new ImpHojaImplanteEnfDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ImpHojaImplanteEnfDao
	 */
	public static ImpHojaImplanteEnfDao create(Connection conn)
	{
		return new ImpHojaImplanteEnfDaoImpl( conn );
	}

}