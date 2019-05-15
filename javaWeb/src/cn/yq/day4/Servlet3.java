package cn.yq.day4;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
//@WebServlet("/S3")
public class Servlet3 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("正在初始化");
	}
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html;charset=utf-8");
			resp.getWriter().append("<h1>123</h1>");
			System.out.println("正在处理请求");			
		}
	@Override
		public void destroy() {
			System.out.println("即将释放");
		}
}
