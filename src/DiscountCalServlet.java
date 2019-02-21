import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalServlet",urlPatterns = "/calculate")
public class DiscountCalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float discountPercent = Integer.parseInt(request.getParameter("discount"));
        float price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Product description :"+ description);
        writer.println("<br>");
        writer.println("Product price: "+ price);
        writer.println("<br>");
        writer.println("Product discount percent: "+ discountPercent);
        writer.println("<br>");
        writer.println("<h1>Price discount</h1>");
        writer.println(discountPercent * price /100);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
