import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FormServlet extends HttpServlet {
    private static final Set<Person> persons = new HashSet<Person>();
//    private static final String HTML = "<html>" +
//            "<head><title>Anketa</title></head>" +
//            "<body><h1> %s </h1></body>" +
//            "</html>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String firstName = req.getParameter("firstname");
        final String lastName = req.getParameter("lastname");
        final String age = req.getParameter("age");
        final String phone = req.getParameter("phone");

        final String animal = req.getParameter("animal");
        final String capital = req.getParameter("capital");
        final String putin = req.getParameter("putin");

        Answer answers = new Answer(animal, capital, putin);

        Person p = new Person.Builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .phone(phone)
                .answers(answers)
                .build();

        persons.add(p);

        resp.getWriter().println(Statistic.getInstance().getStatistic());
    }
}
