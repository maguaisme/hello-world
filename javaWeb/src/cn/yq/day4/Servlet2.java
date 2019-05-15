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
		//�������ݵ������Լ�����
		response.setContentType("text/html;charset=utf-8");
		//ͨ����Ӧ���� �õ���Ӧ���������
		PrintWriter out = response.getWriter();
		//ͨ����ӡ��������Ӧ���д�ӡ����
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
		.append("<th>���</th>")
		.append("<th>����</th>")
		.append("<th>нˮ</th>")
		.append("<th>����</th>")
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
