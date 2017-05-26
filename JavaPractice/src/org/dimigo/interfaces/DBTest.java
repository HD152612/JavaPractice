/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *      |_   DBTest
 * 
 * 1.   개요 : 
 * 2.   작성일 :  2017. 5. 25.
 * </pre> 
 * 
 * @author				:  minyoung
 *	@version			:  1.0
 */
public class DBTest {
	public static void main(String[] args) {
		IDBManager[] i = { IDBManager.getDBObject(IDBManager.SYBASE_DATABASE),
				IDBManager.getDBObject(IDBManager.ORACLE_DATABASE) };
		for (IDBManager idbManager : i) {
			crud(idbManager);
			System.out.println();
		}
	}

	private static void crud(IDBManager db) {
		if(db instanceof SybaseDB) System.out.println("<<변경 전>>");
		if(db instanceof OracleDB) System.out.println("<<변경 후>>");
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}