package Http;

public class LoginServlet implements Servlet{

	public void sevice(Respones res, Request req) {
		res.print("<html>"); 
		res.print("<head>"); 
		res.print("<title>");
		res.print("��������Ӧ�ɹ�");
		res.print("</title>");
		res.print("</head>");
		res.print("<body>");
		res.print("shsxt server���ڻ����ˡ�������"+req.getQueryStr());
		res.print("</body>");
		res.print("</html>");
	}
	
}
