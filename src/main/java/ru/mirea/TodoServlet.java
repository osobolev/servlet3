package ru.mirea;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TodoServlet extends HttpServlet {

    // todo: нужно создать класс-реализацию интерфейса TodoModel и создать объект этого класса
    private TodoModel model = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // todo: нужно вызвать метод model.getItems и вывести в шаблоне
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // todo: в случае добавления будет задан параметр taskText - нужно вызвать model.add(taskText)
        // todo: в случае удаленя будет задан параметр taskId - нужно вызвать model.delete(taskId)
        // todo: после изменения данных нужно вызвать resp.sendRedirect("todo.html") для того, чтобы браузер пере-запросил данные через метод GET
    }
}
