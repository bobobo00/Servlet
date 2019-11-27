package Http;

public class OtherServlet implements Servlet{

	@Override
	public void sevice(Respones res, Request req) {
		// TODO Auto-generated method stub
		res.print("其他界面");
	}

}
