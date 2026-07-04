package com.finance;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addExpense")
public class AddExpenseServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        String type = request.getParameter("type");
        String amount = request.getParameter("amount");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Expense Added Successfully</h1>");
        out.println("<h2>Expense Type: " + type + "</h2>");
        out.println("<h2>Amount: ₹" + amount + "</h2>");
    }
}