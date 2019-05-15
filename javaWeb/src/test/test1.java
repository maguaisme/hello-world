package test;

import Dao.semDeptDao;
import SubImpl.SubsemDeptDaoImpl;

public class test1 {

	public static void main(String[] args) {
		semDeptDao sd = new SubsemDeptDaoImpl();
		sd.getAll().forEach(System.out::println);
	}

}
