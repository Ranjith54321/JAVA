package demeo_app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_config_conflex extends HttpServlet{
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
			
			PrintWriter out = res.getWriter();
			out.println("this is me <br>");
			
			
			// servlet context is open to all servelts
			ServletContext ctx = getServletContext(); //it is an Interface
			String name = ctx.getInitParameter("name");
			String name2 = ctx.getInitParameter("name2");
			out.println(name+"  "+name2);
			
			// config this is declared inside the web.xml this servelt  tag so specific to this servlet
			ServletConfig fg = getServletConfig();
			String name_fig = fg.getInitParameter("name");
			out.println("name from congig  "+name_fig);
		}
}
// here you can click here right click to run or use page2.html to run