import java.io.*;
import javax.servlet.*;

public class Firstservlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html>");
		pw.print("<html>");
		
		pw.print("<b>hello manasa</b>");
		pw.print("</body></html>");
	}
}
