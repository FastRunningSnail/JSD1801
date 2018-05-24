<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%
		// 获取请求的参数
		// 1.当以get方式请求时，在请求的URI中，会以?的形式将参数携带
		// 2.当以post方式请求时，不会在URI中携带参数，而是在请求的报文中
		// post方式提交的参数，在获取之前需要设置编码
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("username: " + username + ", password: " + password);

		// 设置响应的格式是text/html，编码为utf-8
		response.setContentType("text/html;charset=utf-8");

		// 验证用户名和密码，假设正确的用户名admin,密码admin
		 /* String message = "";
		if (!"admin".equals(username)) {
			message = "用户名不存在";
			out.write("<h1>" + message + "</h1>");
			out.flush();
			return;
		}
		
		if (!"admin".equals(password)) {
			message = "用户名/密码不匹配";
			out.write("<h1>" + message + "</h1>");
			out.flush();
			return;
		}
		
		message = "登录成功";
		out.write("<h1>" + message + "</h1>");
		out.flush(); */
		//能不能响应具体的页面：loginFailure.html/login.html,loginSuccess.html
		//
		if(!"admin".equals(username) || !"admin".equals(password)){
			response.sendRedirect("loginFailure.jsp");
			return;
		}
		//
		request.setAttribute("username", username);
		request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
	%> 
</body>
</html>