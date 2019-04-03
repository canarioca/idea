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


public class ImpHojaImplantePopDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ImpHojaImplantePopDao
	 */
	public static ImpHojaImplantePopDao create()
	{
		return new ImpHojaImplantePopDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ImpHojaImplantePopDao
	 */
	public static ImpHojaImplantePopDao create(Connection conn)
	{
		return new ImpHojaImplantePopDaoImpl( conn );
	}

}
