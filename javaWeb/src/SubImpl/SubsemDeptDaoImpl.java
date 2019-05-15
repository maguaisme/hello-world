package SubImpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import Dao.semDeptDao;
import tools.Db;
import vo.empDept;

public class SubsemDeptDaoImpl extends Db implements semDeptDao {

	@Override
	public List<empDept> getAll() {
		//List<empDept> list=null;
		getDs();
		String sql="select s_emp.id ,last_name ,salary ,s_dept.name dept_name  from s_emp,s_dept where s_emp.dept_id=s_dept.id";
		QueryRunner q = new QueryRunner(ds);
		try {
			return q.query(sql,new BeanListHandler<empDept>(empDept.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
