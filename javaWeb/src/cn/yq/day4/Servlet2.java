package cn.yq.day4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.semDeptDao;
import SubImpl.SubsemDeptDaoImpl;
import vo.empDept;

@WebServlet("/s2")

public class Servlet2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置内容的类型以及编码
		response.setContentType("text/html;charset=utf-8");
		//通过响应对象 得到响应体输出的流
		PrintWriter out = response.getWriter();
		//通过打印流，向响应体中打印内容
		semDeptDao sd = new SubsemDeptDaoImpl();
		List<empDept> list = sd.getAll();
		out
		.append("<html>")
		.append("<head><title>456</title></head>")
		.append("<body>")
		.append("<h1>123</h1>")
		.append("<link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/bootstrap.min.css\" />")
		.append("<table class='table'>")
		.append("<tr>")
		.append("<th>编号</th>")
		.append("<th>名字</th>")
		.append("<th>薪水</th>")
		.append("<th>部门</th>")
		.append("<tr>");
		for(empDept ed:list) {
			out.append("<tr class='text-primary'>");
			out.append("<td>"+ed.getId()+"</td>");
			out.append("<td>"+ed.getLast_name()+"</td>");
			out.append("<td>"+ed.getSalary()+"</td>");
			out.append("<td>"+ed.getDept_name()+"</td>");
			out.append("<tr>");
		}
		out
		.append("</table>")
		.append("</body>")
		.append("</html>");
		
	}
}
