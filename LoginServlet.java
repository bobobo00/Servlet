package Http;

public class LoginServlet implements Servlet{

	public void sevice(Respones res, Request req) {
		res.print("<html>"); 
		res.print("<head>"); 
		res.print("<title>");
		res.print("服务器响应成功");
		res.print("</title>");
		res.print("</head>");
		res.print("<body>");
		res.print("shsxt server终于回来了。。。。"+req.getQueryStr());
		res.print("</body>");
		res.print("</html>");
	}
	
}
