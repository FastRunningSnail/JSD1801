package com.entor.maventest.Dao;
/**
 * @author Administrator
 * @param  inId
 * @param outId
 * @param money
 * @return boolean
 */

public interface TransferDao {

	boolean transfer(Long inId,Long outId,double money);

}
